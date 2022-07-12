@Album
Feature: View or Add album

  Scenario: User should be able to land on album page
    Given User have Logged into Dashboard application
    And Landing To HOME page
    When Click on Album from ADMIN drop down
    Then User should be able to land on Album page

  Scenario: User should be able to add an album
    Given User is on Album page
    When Click on NEW ALBUM button and fill the mandatory fields
    And Click on UPLOAD NOW button
    Then Album should created successfully
    And Metadata should match with the values provided

  Scenario: Getting error message if mandatory fields are missing
    Given User is on Album page
    When  Click on NEW ALBUM button and leave mandatory fields
    And   Click on UPLOAD NOW button
    Then  Error should prevent creating new album flow

  Scenario: User should be able to edit album images
    Given User is on Album page
    When Click on a particular album
    Then User should be able to land on editAlbumImages page
    And Close The Browser