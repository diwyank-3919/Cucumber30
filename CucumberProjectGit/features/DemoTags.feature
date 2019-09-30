@Functional
Feature: Tags functionality
  To test Tags functionality

  Background: Background Functionality
    Given Test one background
    When Test two background
    Then Test three background

  @SmokeTest
  Scenario: Test Smoke Functionality
    Given Its a Smoke first step
    When Its a Smoke second step
    Then Its a Smoke thirdstep

  @RegressionTest
  Scenario: Test Regression Functionality
    Given Its a Regression  first step
    When Its a Regression  second step
    Then Its a Regression  thirdstep

  @IntegrationTest
  Scenario: Test Integration Functionality
    Given Its a Integration  first step
    When Its a Integration  second step
    Then Its a Integration  thirdstep


