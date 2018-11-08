package com.platform.configure.base.custom.message;

import java.io.Serializable;
import java.util.List;

public class MessageI18n implements Serializable {
	private static final long serialVersionUID = 1L;
	private String key;
	private List<Language> msgList;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<Language> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<Language> msgList) {
		this.msgList = msgList;
	}
}
