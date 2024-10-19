package com.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MyApp {
	@Value("${myapp.name}")
	private String name;
	@Value("${myapp.version}")
	private String version;
	@Value("${myapp.description}")
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
