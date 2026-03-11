package com.electrolab.api.stepdefinitions;

import com.electrolab.api.managers.ApiManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserSteps {
	ApiManager apiManager = new ApiManager();
	Response response;
	
	@Given("User calls get user API")
	public void callApi() {
		response = apiManager.getUsers();
	}
	
	
	@Then("status code should be {int}")
	public void validateStatus(int code) {
		assertThat(response.getStatusCode(), equalTo(code));
	}
}