package com.platform.configure.condition;

import java.util.List;

public class InCondition<T> extends BaseCondition {
	private static final long serialVersionUID = 4806851880934258752L;
	private List<T> value;


	public List<T> getValue() {
		return value;
	}

	public void setValue(List<T> value) {
		this.value = value;
	}
}
