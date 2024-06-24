Feature: Test the Google application

  Background: 
  Given Open the google application

  Scenario: Test the google Title
    #Given Open the google application
    When capture the google current page title
    Then crosscheck the title with expected title

  Scenario: Test search feature using valid key word
    #Given Open the google application
    When i enter the valid search key word and
    Then google application should provide valid search results
