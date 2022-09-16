@registration

Feature: Registration Dashboard

  Scenario: User should be able to land on Registration page
    Given User have logged in Dashboard application
    And   Landing to HOME page
    When  Click on Registration from ADMIN drop down
    Then  User should be able to land on Registration page

  Scenario: Getting error message if mandatory fields are missing
    Given User landed on Registration page
    When  Mandatory fields are not provided
    And   Register new employee
    Then  Error should prevent the registration flow

  Scenario: User should be able to register new employee
    Given User landed on Registration page
    When  Filling employee details
    And   Click on REGISTER NOW: NEW EMPLOYEE button
    Then  Registration should be completed successfully
    And   Closing browser