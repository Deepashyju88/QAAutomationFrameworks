Feature: Test CRM Application
  
  Background:
  Given Open the home page of Crm application

  @Signin
  Scenario: Test for signin link
    When user click on signin link
    Then the signin page should open

  @Login
  Scenario: Test Login functionality with valid credentials
    When user enter valid user id "Test123@gmail.com" and password "test123"
    When user click on submit button
    Then user should able to login and navigate to customer page
