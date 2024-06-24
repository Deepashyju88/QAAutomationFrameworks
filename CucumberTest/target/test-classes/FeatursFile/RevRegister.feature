Feature: Test the Opencart application

  Scenario: Test the registraion page of opencart
    Given open the registraion page of opencart application
    When enter the fields of the reg form
      | fname | lname    | email             | phone      | pwd    | conpwd |
      | meena | Krishnan | frog88@gmail.com | 9856474125 | ram123 | ram123 |
    When I check the radio button for yes
    When I check the private policy
    When I click on continue
    
    Then I should able to do registraion process
