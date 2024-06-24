Feature: Test OrangeHrm application

  Scenario Outline: Test the Login functionality for Data driven test
    Given open OrangeHrm application
    When user enter the user name "<Un>" and password "<Pwd>" in the login fields
    When user click on the Login button from login pannel
    Then user able to login and enter into dashboard page

    Examples: 
      | Un      | Pwd        |
      | Admin   | admin123   |
      | Sarang  | Test123    |
      | Admin   | admin123   |
      | Deepika | Padukon123 |
