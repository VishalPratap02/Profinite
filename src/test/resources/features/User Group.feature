@UserGroup

Feature: Giving permission to groups

  Scenario: User should be able to land on User Group page
    Given User should have Logged into Dashboard Application
    And land to Home page
    When Click on User Group from ADMIN drop down
    Then User should be able to land on User Group page

  Scenario: User should be able to add new group
    Given User is on User Group page
    When Click on add group button
    And Provide group name and click on save button
    Then New group should be added successfully

  Scenario: Getting error message if group field is missing
    Given User is on User Group page
    When  Click on add group button
    And   Click on save button without giving group name
    Then  Error should prevent creating new group flow

  Scenario: User should be able to add new permission
    Given User is on User Group page
    When Click on add permission button
    And Provide permission name and click on save button
    Then New permission should be added successfully

  Scenario: Getting error message if permission field is missing
    Given User is on User Group page
    When  Click on add permission button
    And   Click on save button without giving permission name
    Then  Error should prevent creating new permission flow

  Scenario: User should be able to map permission to group
    Given User is on User Group page
    When Select group from groups drop down
    And Select permission from permissions drop down
    And Click on ADD PERMISSION TO GROUP button
    Then Group permission should be mapped successfully

  Scenario: Getting error message if mandatory fields are missing while mapping
    Given User is on User Group page
    When Leave blank group and permission
    And Click on ADD PERMISSION TO GROUP button
    Then Error should prevent group permission mapping flow