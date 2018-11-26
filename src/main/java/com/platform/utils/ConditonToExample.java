package com.platform.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.platform.configure.base.WordFirstCharChangeUtils;

/**
 * 
 * *把前台的condition转换为Example   
 * @author kangjin.zhao
 *
 * @param <C>
 * @param <E>
 */
public class ConditonToExample<C, E> {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private E examlpe;

	@SuppressWarnings("unchecked")
	public ConditonToExample(C condition, E examlpe) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String conditionStr = mapper.writeValueAsString(condition);
			Map<String, Object> conditionMap = mapper.readValue(conditionStr, Map.class);
			Field[] fields = condition.getClass().getDeclaredFields();
			Method criteriaMethod = examlpe.getClass().getMethod("createCriteria");
			Object criteria = criteriaMethod.invoke(examlpe);
			Map<String, Object> eachConditon = null;
			for (int i = 0; i < fields.length; i++) {
				String fieldName = fields[i].getName();
				if (fieldName.equals("serialVersionUID") || null == conditionMap.get(fieldName)) {
					continue;
				}
				if (null != conditionMap.get(fieldName)) {
					eachConditon = (Map<String, Object>) conditionMap.get(fieldName);
					Set<Entry<String, Object>> entrySet = eachConditon.entrySet();
					for (Entry<String, Object> entry : entrySet) {
						if (null == entry.getValue()) {
							continue;
						}
						String exampleContitionName = "and" + WordFirstCharChangeUtils.toUpperCaseFirstChar(fieldName) + WordFirstCharChangeUtils.toUpperCaseFirstChar(entry.getKey());
//						logger.error(exampleContitionName + "【" + fieldName + ">>>" + entry.getKey() + ";" + ":" + entry.getValue());
						ParameterizedType parameterizedType = (ParameterizedType) condition.getClass().getDeclaredField(fieldName).getGenericType();
						Type[] name=parameterizedType.getActualTypeArguments();
						Method criteriaMethodGen = criteria.getClass().getDeclaredMethod(exampleContitionName,Class.forName(name[0].getTypeName()));
						criteriaMethodGen.invoke(criteria, entry.getValue());
					}
				}
			}
		} catch (Exception e) {
			logger.error("e:" + e);
		}
		this.examlpe = examlpe;
	}

	public E getExamlpe() {
		return examlpe;
	}
}
