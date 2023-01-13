 
Feature: To verify the adactin hotel login page.
  
  Scenario: verify the adactin hotel login page with valid credentials.
    Given user is on adactin hotel login page.
    When user should enter the username and password.
    And user should click the login button.
    Then user should verify the success msg.

    