@Settings
Feature: Mail settings

  Scenario: User should be able to land on settings
    Given User have logged into Dashboard Application
    And Landing to HOME
    When Click on Settings from ADMIN drop down
    Then User should be able to land on Settings page

  Scenario: User should be able to update settings
    Given User landed on Settings page
    When Select HR name and disable attendance mail
    And Click on UPDATE SETTINGS button
    Then Setting should updated successfully