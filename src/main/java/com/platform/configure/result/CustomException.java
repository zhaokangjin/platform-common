package com.platform.configure.result;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.platform.configure.base.enums.MsgLevel;
import com.platform.configure.base.enums.Status;

public class CustomException extends Throwable implements Serializable{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorMsg;
	private String processMsg;
	private int status;
	private String level;
	public CustomException(String errorCode,String processMsg,Status status,MsgLevel level,Throwable cause) {
		this.status=status.getStatus();
		this.errorCode=errorCode;
		this.processMsg=processMsg;
		this.level=level.getLevel();
		logger.error(cause.getStackTrace()[1].getClassName()+ ">" +cause.getStackTrace()[1].getMethodName()+">line:"+cause.getStackTrace()[1].getLineNumber()+":"+cause);
	} 
	public CustomException(Throwable cause) {
		this.status=Status.EXCEPTION.getStatus();
		this.errorCode="default exception";
		this.processMsg="IT协助";
		this.level=MsgLevel.ERROR.getLevel();
		logger.error(cause.getStackTrace()[1].getClassName()+ ">" +cause.getStackTrace()[1].getMethodName()+">line:"+cause.getStackTrace()[1].getLineNumber()+":"+cause);
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public int getStatus() {
		return status;
	}
	public String getProcessMsg() {
		return processMsg;
	}
	public String getLevel() {
		return level;
	}
}
