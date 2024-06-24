Feature: Test for Google application

  Background: 
    Given Open the google page

  Scenario: Test the title of google page
    #Given Open the google page
    When I capture the current title
    Then The title should match to Google

  Scenario: Test the search feature with a valid key word
    #Given Open the google page
    When I enter the valid key word in the search box
    Then google application should provide valid search result
