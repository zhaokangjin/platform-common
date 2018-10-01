package com.platform.configure.condition;

import java.util.List;

public class NotInCondition extends BaseCondition {
	private static final long serialVersionUID = -3054071490730706587L;
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
