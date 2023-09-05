Feature: Test Functionality of the SauceDemo

  @Smoke
  Scenario Outline: Login to sauce demo with valid Credentials and verify Homepage
    Given User is on the login page
    When Title of the page is "<LoginPageTitle>"
    Then User enters "<loginName>" and "<password>"
    And clicks on SignIn btn
    Then User is on the homePage "<HomePageTitle>"

    Examples: 
      | loginName     | password     | LoginPageTitle | HomePageTitle |
      | standard_user | secret_sauce | Swag Labs      | Swag Labs     |
      
  @Smoke
  Scenario Outline: Login to sauce demo with Invalid Credentials
    Given User is on the login page
    When Title of the page is "<LoginPageTitle>"
    Then User enters "<loginName>" and "<password>"
    And clicks on SignIn btn
    Then User is Prompted with an "<errormessage>"

    Examples: 
      | loginName   | password   | LoginPageTitle | errormessage                                                              |
      | standard_us | secret_sau | Swag Labs      | Epic sadface: Username and password do not match any user in this service |
      
  @Smoke
  Scenario Outline: Login to sauce demo with Invalid Credentials (Clicking Login without entering username and password)
    Given User is on the login page
    When Title of the page is "<LoginPageTitle>"
    Then User enters "<loginName>" and "<password>"
    And clicks on SignIn btn
    Then User is Prompted with an when no credentials is entered "<errormessage>"

    Examples: 
      | loginName | password | LoginPageTitle | errormessage                       |
      |           |          | Swag Labs      | Epic sadface: Username is required |
      

  Scenario Outline: Login to sauce demo with Invalid Credentials (Entering Only Username and Clicking on Login)
    Given User is on the login page
    When Title of the page is "<LoginPageTitle>"
    Then User enters "<loginName>" and "<password>"
    And clicks on SignIn btn
    Then User is Prompted with an "<errormessage>" message when only username is entered

    Examples: 
      | loginName     | password | LoginPageTitle | errormessage                       |
      | standard_user |          | Swag Labs      | Epic sadface: Password is required |
