Feature: Test orge

  Scenario Outline: Test the orange hrm
    Given the orange hrm site opend
    When I enter the userid <uid> and password <pwd>
    When I click onthe login button
    Then the page should login and enter into the application

    Examples: 
      | uid   | pwd      |
      | Admin | admin123 |
      | sam   | Test123  |
      | tkhk  | tres123  |
