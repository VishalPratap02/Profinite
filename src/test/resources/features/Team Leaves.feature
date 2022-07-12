@TeamLeaves

Feature: Team leaves records

  Scenario: User should be able to land on Team Leaves page
    Given User logged in Dashboard application
    And Should land to Home page
    When Click on Team Leaves from ADMIN drop down
    Then User should be able to land on Team Leaves page

  Scenario: User should be able to filter team leave records by different fields
    Given User landed on Team Leaves page
    When Select leaves type as Paid Time Off
    And Click on search button
    Then Only Paid time off leaves type should appear

  Scenario: User should be able to approve 'awaiting approval' leaves
    Given User landed on Team Leaves page
    When Select Awaiting approval leave status
    And Click on search button
    And Click on Action and approved button
    Then Leave Status should be updated accordingly