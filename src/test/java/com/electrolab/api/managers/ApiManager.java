package com.electrolab.api.managers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import com.electrolab.api.specbuilder.SpecBuilder;

public class ApiManager {

    public Response getUsers() {
        return RestAssured
                .given()
                .spec(SpecBuilder.getRequest())
                .when()
                .get("/api/users");
    }
}