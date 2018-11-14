package com.platform.configure.condition;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*以下命名尽可能遵守ONGL表达式命名法则*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Conditions<T> extends BaseCondition implements Serializable{
	private static final long serialVersionUID = -4137598697029736184L;
	//in 
	private List<T> in;
	//not in
	private List<T> nin;
	//between
	private Between<T> bw;
	//like
	private T lk;
	//==
	private T eq;
	//!=
	private T neq;
	//>
	private T gt;
	//>=
	private T gte;
	//< 
	private T lt;
	//<=
	private T lte;
	public List<T> getIn() {
		return in;
	}
	public void setIn(List<T> in) {
		this.in = in;
	}
	public List<T> getNin() {
		return nin;
	}
	public void setNin(List<T> nin) {
		this.nin = nin;
	}
	public T getLk() {
		return lk;
	}
	public void setLk(T lk) {
		this.lk = lk;
	}
	public Between<T> getBw() {
		return bw;
	}
	public void setBw(Between<T> bw) {
		this.bw = bw;
	}
	public T getEq() {
		return eq;
	}
	public void setEq(T eq) {
		this.eq = eq;
	}
	public T getNeq() {
		return neq;
	}
	public void setNeq(T neq) {
		this.neq = neq;
	}
	public T getGt() {
		return gt;
	}
	public void setGt(T gt) {
		this.gt = gt;
	}
	public T getGte() {
		return gte;
	}
	public void setGte(T gte) {
		this.gte = gte;
	}
	public T getLt() {
		return lt;
	}
	public void setLt(T lt) {
		this.lt = lt;
	}
	public T getLte() {
		return lte;
	}
	public void setLte(T lte) {
		this.lte = lte;
	}
	@Override
	public String toString() {
		return "Conditions [in=" + in + ", nin=" + nin + ", lk=" + lk + ", bw=" + bw + ", eq=" + eq + ", neq=" + neq
				+ ", gt=" + gt + ", gte=" + gte + ", lt=" + lt + ", lte=" + lte + "]";
	}

}
