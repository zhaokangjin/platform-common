package com.platform.configure.condition;

public class LessThanCondition extends BaseCondition {

	private static final long serialVersionUID = 2276128576796780333L;
	private String fieldName;
	private Object value;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
