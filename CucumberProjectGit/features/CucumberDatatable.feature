
@FunctionalTest
Feature: Login Functionality
 
  @SmokeTest
  Scenario: Test HerokuApp Login
    Given user is on heroku home page
    When user enters username and passwords
    |tomsmith|SuperSecretPassword!|
    Then display ma=essage user logged in successfully


