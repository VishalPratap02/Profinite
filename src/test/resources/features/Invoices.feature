@Invoices

Feature: Invoices

  Scenario: User should be able to land on Invoices page
    Given User have logged in Dashboard Application
    And Land to Home Page
    When Click on Invoices from ADMIN drop down
    Then User should be able to land on Invoices page
#
#  Scenario: User should be able to filter Invoices by different fields
#    Given User landed on Invoices page
#    When Fill Invoice number
#    And click on Search button
#    Then Invoice details should appear
#
#  Scenario: User should be able to mark invoice as paid
#    Given User landed on Invoices page
#    When Select payment status as outstanding
#    And click on Search button
#    And Click on Mark Invoice As Paid button
#    Then Payment status should be updated accordingly
#
#  Scenario: User should be able to add new Invoice
#    Given User landed on Invoices page
#    When  Click on New Invoice button
#    And   Fill mandatory fields and click on submit button
#    Then  New Invoice should be added successfully
#
#  Scenario: Getting error message if mandatory fields are missing while adding new Invoice
#    Given User landed on Invoice page
#    When Click on New Invoice button
#    And Leave mandatory fields blank and click on submit button
#    Then Error should prevent applying leave flow
#    And Close the browser