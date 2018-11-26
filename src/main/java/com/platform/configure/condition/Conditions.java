package com.platform.configure.condition;

import java.util.List;

/*以下命名尽可能遵守ONGL表达式命名法则*/
public class Conditions<T>{

	private String all;
	private T greaterThan;
	private Between<T> between;
	private T equalTo;
	private T greaterThanOrEqualTo;
	private List<T> in;
	private T isNotNull;
	private T isNull;
	private T lessThan;
	private T lessThanOrEqualTo;
	private Between<T> notBetween;
	private T notEqualTo;
	private List<T> notIn;

	public String getAll() {
		return all;
	}

	public void setAll(String all) {
		this.all = all;
	}

	public T getGreaterThan() {
		return greaterThan;
	}

	public void setGreaterThan(T greaterThan) {
		this.greaterThan = greaterThan;
	}

	public Between<T> getBetween() {
		return between;
	}

	public void setBetween(Between<T> between) {
		this.between = between;
	}

	public T getEqualTo() {
		return equalTo;
	}

	public void setEqualTo(T equalTo) {
		this.equalTo = equalTo;
	}

	public T getGreaterThanOrEqualTo() {
		return greaterThanOrEqualTo;
	}

	public void setGreaterThanOrEqualTo(T greaterThanOrEqualTo) {
		this.greaterThanOrEqualTo = greaterThanOrEqualTo;
	}

	public List<T> getIn() {
		return in;
	}

	public void setIn(List<T> in) {
		this.in = in;
	}

	public T getIsNotNull() {
		return isNotNull;
	}

	public void setIsNotNull(T isNotNull) {
		this.isNotNull = isNotNull;
	}

	public T getIsNull() {
		return isNull;
	}

	public void setIsNull(T isNull) {
		this.isNull = isNull;
	}

	public T getLessThan() {
		return lessThan;
	}

	public void setLessThan(T lessThan) {
		this.lessThan = lessThan;
	}

	public T getLessThanOrEqualTo() {
		return lessThanOrEqualTo;
	}

	public void setLessThanOrEqualTo(T lessThanOrEqualTo) {
		this.lessThanOrEqualTo = lessThanOrEqualTo;
	}

	public Between<T> getNotBetween() {
		return notBetween;
	}

	public void setNotBetween(Between<T> notBetween) {
		this.notBetween = notBetween;
	}

	public T getNotEqualTo() {
		return notEqualTo;
	}

	public void setNotEqualTo(T notEqualTo) {
		this.notEqualTo = notEqualTo;
	}

	public List<T> getNotIn() {
		return notIn;
	}

	public void setNotIn(List<T> notIn) {
		this.notIn = notIn;
	}
}
