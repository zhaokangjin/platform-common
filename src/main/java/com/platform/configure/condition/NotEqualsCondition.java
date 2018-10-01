package com.platform.configure.condition;

public class NotEqualsCondition extends BaseCondition {
	private static final long serialVersionUID = -2591801047980399856L;
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
