Feature: User API Testing

  Scenario: Get users list
    Given User calls GET users API
    Then response status should be 200
