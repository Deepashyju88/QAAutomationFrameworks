Feature: CartLogin Page application test

  Scenario: Test the cart login feature
    Given i open the cartpage application
    When Enter the valid credential in email address and password
      | email            | Pswd   |
      | frog88@gmail.com | ram123 |
    When Enter click the login button
    Then I should able to Login in sucessfully
