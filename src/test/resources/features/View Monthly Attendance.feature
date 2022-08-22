@ViewMonthlyAttendance
Feature: View Monthly Attendance

  Scenario: User should be able to land on View Monthly Attendance
    Given User Have logged in Dashboard Application
    And Landing to Home Page
    When Click on View Monthly Attendance from ADMIN drop down
    Then User should be able to land on View Monthly Attendance page

  Scenario: User should be able to view employee monthly attendance records
    Given User landed on View Monthly Attendance page
    When Select Year and Month
    And click on View button
    Then Employee monthly attendance record should appear

  Scenario: User should be able to export employee attendance details to excel sheet
    Given User landed on View Monthly Attendance page
    When Select year and month and click on View button
    And Click on Export to Excel Button
    Then Excel sheet with monthly attendance records should be downloaded in download folder
    And Close The browser

