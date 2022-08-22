@Projects
Feature: View or Add projects

  Scenario: User should be able to land on Projects page
    Given User have Logged in to Dashboard application
    And Land To HOME page
    When Click on Projects from ADMIN drop down
    Then User should be able to land on Projects page

  Scenario: User should be able to add a Project
    Given User is on Projects page
    When Click on NEW PROJECT button and fill the mandatory fields
    And Click on SAVE button
    Then Project should created successfully

  Scenario: Getting error message if mandatory fields are missing
    Given User is on Projects page
    When  Click on NEW PROJECT button and leave mandatory fields blank
    And   Click on SAVE button
    Then  Error should prevent creating new project flow

  Scenario: User should be able to edit project details
    Given User is on Projects page
    When Click on edit sign of the project
    And Edit the project details and click on UPDATE button
    Then Project details should updated as expected

  Scenario: User should be able to delete project
    Given User is on Projects page
    When Click on delete sign of the project
    And Click on the confirmation pop up
    Then Project should be delete from Projects page

  Scenario: User should be able to land on view project page
    Given User is on Projects page
    When Click on view sign of the project
    Then User should be able to land on view project page

  Scenario: User should be able to add team member from View project page
    Given User is on view projects page
    When Click on Team Member button and provide member details
    And Click on Save button
    Then Member details should be added to Team Members section

  Scenario: User should be able to route back to Project page
    Given User is on view projects page
    When Click on Projects button
    Then User should be route back to Projects page
    And Close Browser