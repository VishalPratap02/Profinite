@login

Feature: Login Dashboard

  Scenario Outline: By login dashboard user should be able to land on Home page
    Given Open browser and start application
    When  Enter valid <username> and <password>
    And   Click on login button
    Then  User should be able to logging successfully
    Examples:
    | username                 | | password |
    | ritu.gupta@aimbeyond.com | | 12345 |
    | dashboard@aimbeyond.com  | | 12345 |


