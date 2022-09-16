@ProjectEmployeeLeaves
Feature: Project Employee Leaves

  Scenario: User should be able to land on Project Employee Leaves
    Given User have logged In Dashboard application
    And Landing to Home page
    When Click on Project Employee Leaves from ADMIN drop down
    Then User should be able to land on Project Employee Leaves page

  Scenario: User should be able to search employee leaves
    Given User landed on Project Employee Leaves page
    When Select project as all and date as current month
    And click on search button
    Then Employee leave should appear for all the project

  Scenario: User should be able to view employee leave details
    Given User landed on Project Employee Leaves page
    When Select Dashboard project with current month
    And  click on search button
    Then Leave details should appear for Dashboard project
#    And Close browser