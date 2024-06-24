Feature: Test Opencart application

  Scenario: Test the registraion feature of opencart
    Given Open the opencart application
    When I eneter the valid data in required fields
      | fname | lname    | email           | phone      | pwd     | conpwd  |
      | meena | Krishnan | madar45@gmail.com | 9856474125 | ram123 | ram123 |
    When I check yes radio button
    When I check privacy policy
    When I click on continue button
    Then I should able to register opencart
