package com.platform.configure.condition;

import java.io.Serializable;

public class LikeCondition <T> implements Serializable{
	private static final long serialVersionUID = -2795452073285883327L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
