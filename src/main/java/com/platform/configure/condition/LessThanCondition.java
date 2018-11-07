package com.platform.configure.condition;

public class LessThanCondition<T> extends BaseCondition {

	private static final long serialVersionUID = 2276128576796780333L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
