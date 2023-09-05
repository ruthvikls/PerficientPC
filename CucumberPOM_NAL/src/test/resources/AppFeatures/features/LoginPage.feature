Feature: Test Login Page of Swag Labs

Scenario: Verify Login Page Title
Given user is on the login page
When user gets the title of the page
Then the title of the page should be "Swag Labs"


Scenario: Verify if able to login with valid credentials
Given user is on the login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks on login button
Then User gets the title of the homepage
And homepage title should be "Swag Labs"