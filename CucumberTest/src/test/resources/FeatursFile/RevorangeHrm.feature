Feature: Test the DDT in Ornage Hrm application

 Scenario Outline: Test orange hrm application
    Given open the orange hrm application
    When User enter the valid username <Un> and valid password <pwd>
    When the user click on the login button
    Then User should able to login the application

    Examples: 
      | Un     | pwd      |
      | Admin  | admin123 |
      | Madhav | madav123 |
      | Admin  | admin123 |
      | Sarang | test123  |
