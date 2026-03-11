🚀 API Automation Framework

A scalable and modular API Automation Testing Framework built using Java, RestAssured, Cucumber BDD, TestNG, and Maven.
This framework is designed for enterprise-level REST API testing with reusable components, clean architecture, and maintainable automation practices.

🧰 Tech Stack

Java

RestAssured

Cucumber BDD

TestNG

Maven

Jackson / Gson

Log4j

Git

```bash


apiAutoFramework
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       └── java
│           └── com.electrolab.api
│               │
│               ├── base
│               │   ├── ScenarioContext.java
│               │   └── TestContext.java
│               │
│               ├── config
│               │   ├── ConfigManager.java
│               │   └── Environment.java
│               │
│               ├── hooks
│               │   └── Hooks.java
│               │
│               ├── managers
│               │   ├── ApiManager.java
│               │   └── TokenManager.java
│               │
│               ├── mock
│               │   ├── MockServer.java
│               │   └── UserMock.java
│               │
│               ├── models
│               │   ├── AuthResponse.java
│               │   └── User.java
│               │
│               ├── runners
│               │   └── TestRunners.java
│               │
│               ├── specbuilder
│               │   └── SpecBuilder.java
│               │
│               ├── stepdefinitions
│               │   └── UserSteps.java
│               │
│               └── utils
│                   ├── ApiClient.java
│                   ├── JsonUtils.java
│                   ├── LoggerUtils.java
│                   └── RetryAnalyzer.java
│
└── resources
    └── features
        └── user.feature



⚙️ Framework Features

✔ BDD testing using Cucumber
✔ API testing using RestAssured
✔ Reusable RequestSpecBuilder
✔ Token-based authentication handling
✔ Environment configuration support
✔ Modular and maintainable architecture
✔ Logging and retry mechanisms
✔ JSON utilities for request/response handling

🧪 Sample BDD Scenario
Feature: User API

Scenario: Get users list
Given User calls GET users API
Then response status should be 200

🧱 Request Specification Builder

Reusable request configuration using SpecBuilder.

public class SpecBuilder {

    public static RequestSpecification getRequest() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigManager.get("qa.url"))
                .addHeader("Content-Type", "application/json")
                .build();
    }
}

🔐 Token Manager

Handles authentication tokens dynamically and injects them into API requests.

🔧 Running Tests
Run using Maven

Run from IDE
Run the TestRunners.java file.

📊 Future Enhancements

Parallel execution

Allure reports
CI/CD integration (Jenkins / GitHub Actions)
Dockerized test execution
API contract testing
Performance testing integration

👨‍💻 Author

Milan Mandal
Software Engineer | SDET | API Automation Engineer
6+ Years Experience in Test Automation

⭐ Contribution
Feel free to fork the repository and submit pull requests to improve the framework.
