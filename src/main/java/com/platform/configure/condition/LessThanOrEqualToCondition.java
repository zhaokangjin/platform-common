package com.platform.configure.condition;

public class LessThanOrEqualToCondition<T> extends BaseCondition {
	private static final long serialVersionUID = 3860246141875612763L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
