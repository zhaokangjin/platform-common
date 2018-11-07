package com.platform.configure.result;

public enum Status {
	SUCCESS(200), EXCEPTION(500), TIME_OUT(408), GATEWAY_TIME_OUT(502), RESOURCE_NOT_FOUND(404),NO_PERMITION(401);
	private int status;
	private Status(int status){
		this.status=status;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
