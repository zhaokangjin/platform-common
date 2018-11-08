package com.platform.configure.base.custom.message;

import java.io.Serializable;

public class ExceptionMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	private String code;
	private String i18n;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getI18n() {
		return i18n;
	}

	public void setI18n(String i18n) {
		this.i18n = i18n;
	}
}
