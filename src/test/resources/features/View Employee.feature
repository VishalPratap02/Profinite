@ViewEmployee

Feature: View employee records

  Scenario: User should be able to land on View Employee page
    Given User have logged into Dashboard application
    And Land to HOME page
    When Click on View Employee from ADMIN drop down
    Then User should be able to land on View Employee page
    And Closing  browser

  Scenario: User should be able to filter employee records by different fields
    Given User landed on View Employee page
    When Select department as Engineering
    And Click on Search button
    Then Employee records should appear only for Engineering department

  Scenario: User should be able to activate/deactivate employee
    Given User landed on View Employee page
    When Search employee by name
    And Select the check box to activate or deactivate the employee
    And Click ok on additional pop up to active or inactive the employee
    Then Employee status should be updated accordingly

  Scenario: User should be able to view employee profile
    Given User landed on View Employee page
    When Search employee by name
    And Click on employee name to go to employee profile
    Then User should be landed to Employee Profile page

  Scenario: User should be able to update employee details
    Given User landed on View Employee page
    When Search employee by name
    And click on Update Details button
    Then User should be landed to Personal Details page



