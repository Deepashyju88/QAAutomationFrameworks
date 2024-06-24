Feature: Cart Login Page

  Scenario: Login cartlogin using valid credentials
    Given open cart login page
    When I enter valid login credentials
      | email             | password |
      | madar45@gmail.com | ram123   |
    When I click on Login button from cart page
    Then I should able to login into the opencart application
