Feature: Test Amazon Application

  Background: 
    Given open Amazon application

  @Homepage
  Scenario: Test for homepage title
    When user capture the actual title of amazone application
    Then The title should match with the expected title

  @BestSeller
  Scenario: Test for Beat seller title
    When user open best seller page
    When user capture best seller page actual title
    Then The title should match with the best seller expected title

  @mobiles
  Scenario: Test for mobiles title
    When user open mobiles page
    When user capture mobiles page actual title
    Then The title should match with the mobiles expected title

  @sell
  Scenario: Test for sell title
    When user open sell page
    When user capture sell page actual title
    Then The title should match with the sell expected title
