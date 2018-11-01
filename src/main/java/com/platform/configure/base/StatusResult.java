package com.platform.configure.base;

import java.io.Serializable;
/**
 * 
 * @author kangjin.zhao@accenture
 *
 * @param <R>
 */
public class StatusResult <R> implements Serializable{
	private static final long serialVersionUID = 1L;
	private int status;
	private R result;
	/**
	 * 
	 * @param status
	 * @param result
	 */
	public StatusResult(int status,R result) {
		this.status=status;
		this.result=result;
	}
	public int getStatus() {
		return status;
	}
	public R getResult() {
		return result;
	}
}
