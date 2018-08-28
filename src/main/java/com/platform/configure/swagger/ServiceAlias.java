package com.platform.configure.swagger;

import java.io.Serializable;

public class ServiceAlias implements Serializable{
	private static final long serialVersionUID = -7044414865622842775L;
	private String name;
	private String description;
	private String developer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
}
