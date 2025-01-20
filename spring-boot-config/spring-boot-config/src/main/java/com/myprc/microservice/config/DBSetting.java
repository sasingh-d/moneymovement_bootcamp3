package com.myprc.microservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DBSetting {
	
	private String connectionValues;
	private String name;
	private String port;
	
	public String getConnectionValues() {
		return connectionValues;
	}
	public void setConnectionValues(String connectionValues) {
		this.connectionValues = connectionValues;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
		
}
