package com.electrolab.api.base;

public class TestContext {
	
	private ScenarioContext scenarioContext;   //TestContext contains a ScenarioContext.
	
	public TestContext() {
		scenarioContext = new ScenarioContext();//When TestContext is created:A new ScenarioContext is automatically created.Meaning:Each test gets its own data storage.
	}
	
	
	public ScenarioContext getScenarioContext() {//Provides controlled access.
		return scenarioContext;
	}

}




/*
 Why do we need TestContext?

Cucumber/Test Runner
        ↓
TestContext (shared object)
        ↓
ScenarioContext (data storage)
        ↓
Step Definitions


You could directly use ScenarioContext, right?

But frameworks grow.

Later you may need to share:

Scenario data

API clients

Request specs

Response objects

WebDriver (UI projects)

Auth tokens

Instead of passing many objects separately:

UserSteps(ScenarioContext sc, ApiClient api, TokenManager tm)


You pass one object:

UserSteps(TestContext context)

-- Clean dependency management.

*/