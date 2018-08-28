package com.platform.configure.swagger;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerEntity implements Serializable {
	private static final long serialVersionUID = -182615326373700372L;
	private String basepackage;
	private ServiceAlias service;

	public String getBasepackage() {
		return basepackage;
	}

	public void setBasepackage(String basepackage) {
		this.basepackage = basepackage;
	}

	public ServiceAlias getService() {
		return service;
	}

	public void setService(ServiceAlias service) {
		this.service = service;
	}

}
