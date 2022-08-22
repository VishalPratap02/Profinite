@Email

Feature: Send mail on behalf of dashboard@aimbeyond

  Scenario: User should be able to land on Email page
    Given User have Logged into Dashboard Application
    And land to home page
    When Click on Email from ADMIN drop down
    Then User should be able to land on Email page

  Scenario: User should be able to send an Email
    Given User is on Email page
    When Fill the mandatory fields
    And Click on Send button
    Then Email should be send successfully

  Scenario: Getting error message if mandatory fields are missing
    Given User is on Email page
    When  leave mandatory fields blank
    And   Click on Send button
    Then  Error should prevent sending mail flow

  Scenario: User should be able to Reset email fields
    Given User is on Email page
    When Fill the mandatory fields
    And Click on RESET button
    Then Fields value should be reset to blank
    And Closing browsers