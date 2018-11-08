package com.platform.configure.base.enums;

public enum MsgLevel {
	ERROR("error"), INFO("info"), WARN("warn");
	private String level;

	private MsgLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

}
