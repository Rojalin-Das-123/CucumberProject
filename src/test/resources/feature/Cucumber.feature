Feature: My first feature
  Scenario: Get User Details
    Given base URL is set to "https://reqres.in"
    Given endPoint is set to "/api/users/2"
    When the "GET" call is made
    Then the status of the response should be 200


