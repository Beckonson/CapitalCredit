Feature: Login functionality

  Scenario: Valid user login
    Given user is navigated to Adjutor application
    When user enter a valid email and password
    And user click on login button
    Then user is successfully logged in