package com.platform.configure.condition;

public class EqualsCondition<T>  extends BaseCondition{
	private static final long serialVersionUID = -2795452073285883327L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
