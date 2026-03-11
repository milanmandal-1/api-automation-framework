package com.electrolab.api.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setup() {
		System.out.println("Test Started");
	}
	
	@After
	public void teardown() {
		System.out.println("Test Finished");
	}
}