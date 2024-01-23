#Author
#Date
#Description
@smokeFeature
Feature: test to login functionality
@smoketest
  Scenario: Check login is successful with valid credentials
    Given user is in login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
