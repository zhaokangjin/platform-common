package com.platform.configure.result;

import java.io.Serializable;

import com.platform.configure.base.enums.Status;

public class ResultStatus<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private T reuslt;
	private int status;

	public ResultStatus() {
	}

	public ResultStatus(T reuslt, Status status) {
		this.reuslt = reuslt;
		this.status = status.getStatus();
	}

	public ResultStatus(T reuslt) {
		this.reuslt = reuslt;
		this.status = Status.SUCCESS.getStatus();
	}

	public T getReuslt() {
		return reuslt;
	}

	public int getStatus() {
		return status;
	}
}
