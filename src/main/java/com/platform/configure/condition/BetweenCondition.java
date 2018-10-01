package com.platform.configure.condition;

public class BetweenCondition extends BaseCondition{
	private static final long serialVersionUID = -4249653188402445007L;
	private String fieldName;
	private Object preValue;
	private Object endValue;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getPreValue() {
		return preValue;
	}

	public void setPreValue(Object preValue) {
		this.preValue = preValue;
	}

	public Object getEndValue() {
		return endValue;
	}

	public void setEndValue(Object endValue) {
		this.endValue = endValue;
	}
}
