package com.platform.configure.condition;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Conditions<T> extends BaseCondition {
	private static final long serialVersionUID = -4137598697029736184L;
	private BetweenCondition<T> between;
	private EqualsCondition<T> equals;
	private LikeCondition<T> like;
	private GreaterThanCondition<T> greaterThan;
	private GreatThanOrEqualToCondition<T> greaterThanOrEquals;
	private NotInCondition<T> notIn;
	private LessThanCondition<T> lessThan;
	private LessThanOrEqualToCondition<T> lessThanOrEquals;
	private NotEqualsCondition<T> notEquals;
	/*以下命名遵守ONGL表达式命名法则*/
	//in
	private InCondition<T> in;
	//between
	private BetweenCondition<T> bw;
	//==
	private EqualsCondition<T> eq;
	//!=
	private NotEqualsCondition<T> neq;
	//>
	private GreaterThanCondition<T> gt;
	//>=
	private GreatThanOrEqualToCondition<T> gte;
	//not in
	private NotInCondition<T> nin;
	//< 
	private LessThanCondition<T> lt;
	//<=
	private LessThanOrEqualToCondition<T> lte;

	public BetweenCondition<T> getBetween() {
		return between;
	}

	public void setBetween(BetweenCondition<T> between) {
		this.between = between;
	}

	public EqualsCondition<T> getEquals() {
		return equals;
	}

	public void setEquals(EqualsCondition<T> equals) {
		this.equals = equals;
	}

	public GreaterThanCondition<T> getGreaterThan() {
		return greaterThan;
	}

	public void setGreaterThan(GreaterThanCondition<T> greaterThan) {
		this.greaterThan = greaterThan;
	}

	public GreatThanOrEqualToCondition<T> getGreaterThanOrEquals() {
		return greaterThanOrEquals;
	}

	public void setGreaterThanOrEquals(GreatThanOrEqualToCondition<T> greaterThanOrEquals) {
		this.greaterThanOrEquals = greaterThanOrEquals;
	}

	public InCondition<T> getIn() {
		return in;
	}

	public void setIn(InCondition<T> in) {
		this.in = in;
	}

	public NotInCondition<T> getNotIn() {
		return notIn;
	}

	public void setNotIn(NotInCondition<T> notIn) {
		this.notIn = notIn;
	}

	public LessThanCondition<T> getLessThan() {
		return lessThan;
	}

	public void setLessThan(LessThanCondition<T> lessThan) {
		this.lessThan = lessThan;
	}

	public LessThanOrEqualToCondition<T> getLessThanOrEquals() {
		return lessThanOrEquals;
	}

	public void setLessThanOrEquals(LessThanOrEqualToCondition<T> lessThanOrEquals) {
		this.lessThanOrEquals = lessThanOrEquals;
	}

	public NotEqualsCondition<T> getNotEquals() {
		return notEquals;
	}

	public void setNotEquals(NotEqualsCondition<T> notEquals) {
		this.notEquals = notEquals;
	}

	public LikeCondition<T> getLike() {
		return like;
	}

	public void setLike(LikeCondition<T> like) {
		this.like = like;
	}

	public BetweenCondition<T> getBw() {
		return bw;
	}

	public void setBw(BetweenCondition<T> bw) {
		this.bw = bw;
	}

	public EqualsCondition<T> getEq() {
		return eq;
	}

	public void setEq(EqualsCondition<T> eq) {
		this.eq = eq;
	}

	public GreaterThanCondition<T> getGt() {
		return gt;
	}

	public void setGt(GreaterThanCondition<T> gt) {
		this.gt = gt;
	}

	public GreatThanOrEqualToCondition<T> getGte() {
		return gte;
	}

	public void setGte(GreatThanOrEqualToCondition<T> gte) {
		this.gte = gte;
	}

	public NotInCondition<T> getNin() {
		return nin;
	}

	public void setNin(NotInCondition<T> nin) {
		this.nin = nin;
	}

	public LessThanCondition<T> getLt() {
		return lt;
	}

	public void setLt(LessThanCondition<T> lt) {
		this.lt = lt;
	}

	public LessThanOrEqualToCondition<T> getLte() {
		return lte;
	}

	public void setLte(LessThanOrEqualToCondition<T> lte) {
		this.lte = lte;
	}

	public NotEqualsCondition<T> getNeq() {
		return neq;
	}

	public void setNeq(NotEqualsCondition<T> neq) {
		this.neq = neq;
	}
}
