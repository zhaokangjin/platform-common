package com.platform.configure.condition;

import java.util.List;

public class NotInCondition<T> extends BaseCondition {
	private static final long serialVersionUID = -3054071490730706587L;
	private List<T> value;

	public List<T> getValue() {
		return value;
	}

	public void setValue(List<T> value) {
		this.value = value;
	}
}
