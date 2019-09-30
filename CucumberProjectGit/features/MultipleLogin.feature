@FunctionalTest
Feature: To test multiple login fuctionality

  @SmokeTest
  
  Scenario Outline: Test multipleLogin functionality on DemoWebShop
    Given user is on DemoWebShop wage
    When user enters "<username>" and "<password>"
    Then Display message Loggedin successfully

    Examples: 
      | username           | password   | 
      | pratiksha@test.com | pratiksha | 
      | rick@test.com      | tester     |   
