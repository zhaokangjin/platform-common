package com.platform.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.beanutils.BeanUtils;
import com.platform.configure.base.WordFirstCharChangeUtils;

/**
 * 
 * *把前台的condition转换为Example   
 * @author kangjin.zhao
 *
 * @param <C>
 * @param <E>
 */
public class ConditionToExampleUtils<C, E> {

	private E examlpe;

	public ConditionToExampleUtils(C condition, E examlpe) {
		// {"creationTime":{"gte":1.542812608723E12},"creator":{"eq":"zhangshan"}}
		Field[] fields = condition.getClass().getDeclaredFields();
		Method criteriaMethod = null;
		try {
			criteriaMethod = examlpe.getClass().getMethod("createCriteria");
			Object criteria = criteriaMethod.invoke(examlpe);
			for (int i = 0; i < fields.length; i++) {
				Object conditionItem = BeanUtils.getProperty(condition, fields[i].getName());
				if (null != conditionItem) {
					Field[] conditionItemFields = conditionItem.getClass().getDeclaredFields();
					for (Field fieldName : conditionItemFields) {

						if (fieldName.getName().equals("eq")) {
							String newMethod = "and" + WordFirstCharChangeUtils.toUpperCaseFirstChar(fieldName.getName()) + "EqualTo";
							Method criteriaMethodGen = null;
							criteriaMethodGen = criteria.getClass().getMethod(newMethod);
							criteriaMethodGen.invoke(criteria, BeanUtils.getProperty(conditionItem, "eq"));
						}
					}
				}
			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

		}
		this.examlpe = examlpe;
	}

	public E getExamlpe() {
		return examlpe;
	}
}
