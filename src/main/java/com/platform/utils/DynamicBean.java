package com.platform.utils;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.platform.configure.result.CustomException;
import com.platform.configure.result.MsgLevel;
import com.platform.configure.result.Status;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;

public class DynamicBean {

	private Object target;

	private BeanMap beanMap;

	public DynamicBean(Class<?> superclass, Map<String, Class<?>> propertyMap) {
		this.target = generateBean(superclass, propertyMap);
		this.beanMap = BeanMap.create(this.target);
	}

	public void setValue(String property, Object value) {
		beanMap.put(property, value);
	}

	public Object getValue(String property) {
		return beanMap.get(property);
	}

	public Object getTarget() {
		return this.target;
	}

	private Object generateBean(Class<?> superclass, Map<String, Class<?>> propertyMap) {
		BeanGenerator generator = new BeanGenerator();
		if (null != superclass) {
			generator.setSuperclass(superclass);
		}
		BeanGenerator.addProperties(generator, propertyMap);
		return generator.create();
	}
}
