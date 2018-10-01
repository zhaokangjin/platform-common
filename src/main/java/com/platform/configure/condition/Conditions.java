package com.platform.configure.condition;

import java.util.List;

public class Conditions extends BaseCondition {
	private static final long serialVersionUID = -4137598697029736184L;
	private List<BetweenCondition> between;
	private List<EqualsCondition> equals;
	private List<GreaterThanCondition> greaterThan;
	private List<GreatThanOrEqualToCondition> greaterThanOrEquals;
	private List<InCondition> in;
	private List<NotInCondition> notIn;
	private List<LessThanCondition> lessThan;
	private List<LessThanOrEqualToCondition> lessThanOrEquals;
	private List<NotEqualsCondition> notEquals;

	public List<BetweenCondition> getBetween() {
		return between;
	}

	public void setBetween(List<BetweenCondition> between) {
		this.between = between;
	}

	public List<EqualsCondition> getEquals() {
		return equals;
	}

	public void setEquals(List<EqualsCondition> equals) {
		this.equals = equals;
	}

	public List<GreaterThanCondition> getGreaterThan() {
		return greaterThan;
	}

	public void setGreaterThan(List<GreaterThanCondition> greaterThan) {
		this.greaterThan = greaterThan;
	}

	public List<GreatThanOrEqualToCondition> getGreaterThanOrEquals() {
		return greaterThanOrEquals;
	}

	public void setGreaterThanOrEquals(List<GreatThanOrEqualToCondition> greaterThanOrEquals) {
		this.greaterThanOrEquals = greaterThanOrEquals;
	}

	public List<InCondition> getIn() {
		return in;
	}

	public void setIn(List<InCondition> in) {
		this.in = in;
	}

	public List<NotInCondition> getNotIn() {
		return notIn;
	}

	public void setNotIn(List<NotInCondition> notIn) {
		this.notIn = notIn;
	}

	public List<LessThanCondition> getLessThan() {
		return lessThan;
	}

	public void setLessThan(List<LessThanCondition> lessThan) {
		this.lessThan = lessThan;
	}

	public List<LessThanOrEqualToCondition> getLessThanOrEquals() {
		return lessThanOrEquals;
	}

	public void setLessThanOrEquals(List<LessThanOrEqualToCondition> lessThanOrEquals) {
		this.lessThanOrEquals = lessThanOrEquals;
	}

	public List<NotEqualsCondition> getNotEquals() {
		return notEquals;
	}

	public void setNotEquals(List<NotEqualsCondition> notEquals) {
		this.notEquals = notEquals;
	}
}
