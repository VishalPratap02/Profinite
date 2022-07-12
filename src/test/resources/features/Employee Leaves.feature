@EmployeeLeaves

Feature: Employee leave records

  Scenario: User should be able to land on Employee Leaves page
    Given User have Logged in Dashboard application
    And Landing to HOME Page
    When Click on Employee Leaves from ADMIN drop down
    Then User should be able to land on Employee Leaves page
    And Close the browser

  Scenario: User should be able to filter employee leave records by different fields
    Given User landed on Employee Leave page
    When Select leave type as Paid Time Off
    And click on Search button
    Then Only Paid time off leave type should appear
    And Close the browser

  Scenario: User should be able to approve 'awaiting approval' leaves
    Given User landed on Employee Leave page
    When Select awaiting approval leave status
    And click on Search button
    And Click on action and approved button
    Then Leave status should be updated accordingly
    And Close the browser

  Scenario: User should be able to apply new leave
    Given User landed on Employee Leave page
    When  Click on Apply New Leave button
    And   Fill mandatory fields and click on apply button
    Then  New leave should be applied successfully
    And   Close the browser

  Scenario: Getting error message if mandatory fields are missing
    Given User landed on Employee Leave page
    When Click on Apply New Leave button
    And Leave mandatory fields blank and click on Apply button
    Then Error should prevent applying leave flow
    And Close the browser