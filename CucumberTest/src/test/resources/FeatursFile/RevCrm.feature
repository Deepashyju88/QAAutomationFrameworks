Feature: Test theCRM application

  Background: 
    Given open the CRM application

  Scenario: Test the signin link
    When click on the sign in link
    Then the link should open and redirect to login page

  @Login
  Scenario: Test the Login functionality using valid key word
    When i enter valied email "test@gmail.com" and valid pswd "test123"
    When i click on the submit button
    Then I should able to login and navigate to customer page
