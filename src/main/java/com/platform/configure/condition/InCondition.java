package com.platform.configure.condition;

import java.util.List;

public class InCondition extends BaseCondition {
	private static final long serialVersionUID = 4806851880934258752L;
	private String fieldName;
	private List<Object> value;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<Object> getValue() {
		return value;
	}

	public void setValue(List<Object> value) {
		this.value = value;
	}
}
