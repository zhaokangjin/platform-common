package com.platform.utils;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FieldUtils {

	static Logger logger = LoggerFactory.getLogger(FieldUtils.class);

	public static Object getTargetObject(Object sourceObject, Map<String, Object> addProperties) {
		PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
		PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(sourceObject);
		Map<String, Class<?>> propertyMap = new HashMap<String, Class<?>>();
		for (PropertyDescriptor d : descriptors) {
			if (!"class".equalsIgnoreCase(d.getName())) {
				propertyMap.put(d.getName(), d.getPropertyType());
			}
		}
		addProperties.forEach((k, v) -> propertyMap.put(k, v.getClass()));
		DynamicBean dynamicBean = new DynamicBean(sourceObject.getClass(), propertyMap);
		propertyMap.forEach((k, v) -> {
			try {
				if (!addProperties.containsKey(k)) {
					dynamicBean.setValue(k, propertyUtilsBean.getNestedProperty(sourceObject, k));
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		});
		addProperties.forEach((k, v) -> {
			try {
				dynamicBean.setValue(k, v);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		});
		Object target = dynamicBean.getTarget();
		return target;
	}
 
/*	public static void main(String[] args) {
		Map<String,Object> ddd=new HashMap<String,Object>();
		ddd.put("a", "aaa");
		ddd.put("b", "bbb");
		ddd.forEach((key,value)->{
			System.out.println(value);
		});
		PojoTest pt=new PojoTest();
		pt.setName("zhangsan");
		Map<String, Object> addProperties = new HashMap<String, Object>();
		addProperties.put("age", 23);
		System.out.println(JSON.toJSONString(getTargetObject(pt, addProperties)));
	}*/
}