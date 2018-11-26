package com.platform.configure.condition;

public class Between<T>{
	private T preValue;
	private T endValue;
	
	public Between(T preValue,T endValue) {
		this.preValue = preValue;
		this.endValue = endValue;
	}
	public T getPreValue() {
		return preValue;
	}
	public void setPreValue(T preValue) {
		this.preValue = preValue;
	}
	public T getEndValue() {
		return endValue;
	}
	public void setEndValue(T endValue) {
		this.endValue = endValue;
	}
}
