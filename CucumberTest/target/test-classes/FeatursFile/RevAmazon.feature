Feature: Test the Amazon application

Background: 
Given Open Amazon application

Scenario: Test the home page title of amazon
When user capture the current title of the page
Then The title should match with the expected title of the home page


Scenario: Test the title of Beat Seller link available in amazon
When user open the bestseller link
When user capture the current title of the page
Then The title should match with the expected title of the best seller page

Scenario: Test the title of Books link available in amazon
When user open the books link
When user capture the current title of the page
Then The title should match with the expected title of the books page

Scenario: Test the title of gift cards link available in amazon
When user open the giftcards link
When user capture the current title of the page
Then The title should match with the expected title of the gift cards page

