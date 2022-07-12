@NotificationCenter

Feature: Notification Center

  Scenario: User should be able to land on Notification Center page
    Given User Have Logged In Dashboard application
    And Land To Home Page
    When Click on Notification Center from ADMIN drop down
    Then User should be able to land on Notification Center page

  Scenario: User should be able to Approve Attendance in mass from Attendance Notification
    Given User landed on Notification Center page
    When Select Attendance request
    And click on approve button
    Then Approved attendance <String> <String> should not available on notification center anymore

  Scenario: User should be able to Reject Attendance in mass from Attendance Notification
    Given User landed on Notification Center page
    When Select Attendance request
    And click on Reject button
    Then Rejected attendance <String> <String> should not available on notification center anymore

  Scenario: User should be able to Approve Attendance in mass from leave Notification
    Given User landed on Notification Center page
    When Select Leave request
    And click on approve button
#    Then Approved leave <String> <String> should not available on notification center anymore
#
#  Scenario: User should be able to Reject Attendance in mass from Attendance Notification
#    Given User landed on Notification Center page
#    When Select Reject request
#    And click on Reject button
#    Then Rejected Leave <String1> <String2> should not available on notification center anymore

#  Scenario: User should be able to Approve Attendance in mass from Attendance Notification
#    Given User landed on Notification Center page
#    When Select Attendance request
#    And click on approve button
#    Then Approved attendance should not available on notification center anymore
#
#  Scenario: User should be able to Reject Attendance in mass from Attendance Notification
#    Given User landed on Notification Center page
#    When Select Reject request
#    And Click on Reject button
#    Then Rejected attendance should not available on notification center anymore