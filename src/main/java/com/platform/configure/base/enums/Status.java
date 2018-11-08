package com.platform.configure.base.enums;

public enum Status {
	// 200, 500, 404 401, 502, 504
	SUCCESS(200), EXCEPTION(500), RESOURCE_NOT_FOUND(404), TIME_OUT(408), LOGIN_FAILED(401), BAD_GATEWAY(502),
	GATEWAY_TIMEOUT(508);
	private Status(int status) {
		this.status=status;
	}

	private int status;

	public int getStatus() {
		return status;
	}

}
