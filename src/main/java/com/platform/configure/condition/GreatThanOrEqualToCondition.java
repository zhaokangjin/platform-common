package com.platform.configure.condition;

public class GreatThanOrEqualToCondition<T> extends BaseCondition {

	private static final long serialVersionUID = 1977244007168512875L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
