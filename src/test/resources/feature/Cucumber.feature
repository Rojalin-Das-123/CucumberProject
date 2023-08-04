Feature: My first feature
  Scenario: Get User Details
    Given base URL is set to "https://reqres.in"
    Given endPoint is set to "/api/users/2"
    When the "GET" call is made
    Then the status of the response should be 200


  Scenario: Create user
    Given base URL is set to "https://reqres.in"
    Given endPoint is set to "/api/users"
    And request body is set for user creation
    When the "POST" call is made
    Then the status of the response should be 201


  Scenario: Update user details
    Given base URL is set to "https://reqres.in"
    Given endPoint is set to "/api/users/2"
    And request body is set to update user details
    When the "PUT" call is made
    Then the status of the response should be 200


