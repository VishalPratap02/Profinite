@login

Feature: Login Dashboard

  Scenario: By login dashboard user should be able to land on Home page
    Given Open browser and start application
    When  Enter valid username and password
    And   Click on login button
    Then  User should be able to logging successfully
    And   Closing the browser
