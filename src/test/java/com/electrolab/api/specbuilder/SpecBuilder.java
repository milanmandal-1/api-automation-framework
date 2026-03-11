package com.electrolab.api.specbuilder;

import com.electrolab.api.config.ConfigManager;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class SpecBuilder {
	
	public static RequestSpecification getRequest() {
		
		return new RequestSpecBuilder()
				.setBaseUri(ConfigManager.get("qa.url"))
				.addHeader("Content-Type", "application/json")
				.build();
	}

}
