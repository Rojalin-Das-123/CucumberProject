Feature: My first feature
  Scenario: valid login
    Given the user should login first
    When enter the creds
    And click on submit
    Then he should login
    When the "POST" call is made
    Then nothing
