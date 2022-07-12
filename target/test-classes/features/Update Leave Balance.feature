@UpdateLeaveBalance
Feature: Update Leave Balance

  Scenario: User should be able to land on Update Leaves Balance
    Given User have logged In Dashboard Application
    And Land to Home page
    When Click on Update Leave Balance from ADMIN drop down
    Then User should be able to land on Update Leaves Balance page

  Scenario: User should be able to Update Leave Balance
    Given User landed on Update Leaves Balance page
    When Provide leave balance to an employee
    And click on update button
    Then Employee leave balance should be updated

  Scenario: User should be able to sort and Update Leave Balance in negative
    Given User landed on Update Leaves Balance page
    When Sort the value by Employee Name and provide negative value to an employee
    And click on update button
    Then Employee leave balance should be updated on negative input