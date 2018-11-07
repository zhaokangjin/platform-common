package com.platform.configure.condition;

public class Between<T> extends BaseCondition{
	private static final long serialVersionUID = -4249653188402445007L;
	private T preValue;
	private T endValue;
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
