@TestMeApp
Feature: Login Functionality

  @SmokeTest
  Scenario Outline: TestMeApp Login
    Given user is on home page of TestMeApp
    When user enters "<username>" and "<password>" df
    Then user logged in successfully

    Examples: 
      | username | password    |
      | Lalitha  | Password123 |
      | amu1234  | amu123      |
