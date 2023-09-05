Feature: Test saucedemo login Scenario

  Scenario Outline: Test login with valid credentials
    Given open chrome and start application
    When user enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then application should be closed

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | problem_user            | secret123    |
