package com.platform.configure.base;

import java.io.Serializable;

import com.platform.configure.base.enums.Status;
/**
 * @author kangjin.zhao
 * @param <R>
 */
public class ResultStatus <R> implements Serializable{
	private static final long serialVersionUID = 1L;
	private int status;
	private R result;
	/**
	 * 
	 * @param status
	 * @param result
	 * 200,     500,       404                408,     401,         502,        504        
	   Success, Exception, Resource_Not_Found,Time_Out,Login_Failed,Bad_Gateway,Gateway_Timeout 
	 */
	public ResultStatus(Status status,R result) {
		if(status.name().equals("Success")) {
			this.status=200;
		}else if(status.name().equals("Exception")) {
			this.status=500;
		}else if(status.name().equals("Resource_Not_Found")) {
			this.status=404;
		}else if(status.name().equals("Time_Out")) {
			this.status=408;
		}else if(status.name().equals("Login_Failed")) {
			this.status=401;
		}else if(status.name().equals("Bad_Gateway")) {
			this.status=502;
		}else if(status.name().equals("Gateway_Timeout")) {
			this.status=504;
		}
		this.result=result;
	}
	public int getStatus() {
		return status;
	}
	public R getResult() {
		return result;
	}
}
