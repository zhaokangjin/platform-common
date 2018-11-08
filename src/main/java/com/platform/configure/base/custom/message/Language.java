package com.platform.configure.base.custom.message;

import java.io.Serializable;

public class Language implements Serializable {
	private static final long serialVersionUID = 1L;
	private String countyCode;
	private String language;

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
