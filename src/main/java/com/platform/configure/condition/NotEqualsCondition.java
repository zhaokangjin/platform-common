package com.platform.configure.condition;

public class NotEqualsCondition<T> extends BaseCondition {
	private static final long serialVersionUID = -2591801047980399856L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
