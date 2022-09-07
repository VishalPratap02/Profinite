@ViewAttendance
Feature: View Attendance
#  @First
  Scenario: User should be able to land on View Attendance page
    Given User have Logged In Dashboard application
    And Landing To HOME Page
    When Click on View Attendance from ADMIN drop down
    Then User should be able to land on View Attendance page

#  Scenario: User should be able to view employee attendance records
#    Given User landed on View Attendance page
#    When Select employee name and date
#    And Click on View button
#    Then Employee attendance record including In-time and Out-time should appear
##  @Last
#  Scenario: User should be able to export employee attendance details to excel sheet
#    Given User landed on View Attendance page
#    When Select employee name with date and click on View button
#    And Click on Export to Excel button
#    Then Excel sheet with attendance records should be downloaded in download folder
##    And Close the Browser