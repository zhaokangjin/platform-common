package com.platform.configure.result;

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
