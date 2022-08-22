$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/View%20Employee.feature");
formatter.feature({
  "name": "View employee records",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ViewEmployee"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to land on View Employee page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ViewEmployee"
    }
  ]
});
formatter.step({
  "name": "User have logged into Dashboard application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefViewEmployee.user_have_logged_in_Dashboard_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Land to HOME page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewEmployee.landing_to_HOME_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on View Employee from ADMIN drop down",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefViewEmployee.click_on_from_ADMIN_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on View Employee page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefViewEmployee.user_should_be_able_to_land_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to filter employee records by different fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ViewEmployee"
    }
  ]
});
formatter.step({
  "name": "User landed on View Employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefViewEmployee.user_landed_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select department as Engineering",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefViewEmployee.select_department_as_engineering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewEmployee.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee records should appear only for Engineering department",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefViewEmployee.records_appear_for_engineering_department()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to activate/deactivate employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ViewEmployee"
    }
  ]
});
formatter.step({
  "name": "User landed on View Employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefViewEmployee.user_landed_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search employee by name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefViewEmployee.search_employee_by_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the check box to activate or deactivate the employee",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewEmployee.select_check_box_to_activate_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ok on additional pop up to active or inactive the employee",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewEmployee.click_pop_up_to_active_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee status should be updated accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefViewEmployee.employee_status_should_be_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to view employee profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ViewEmployee"
    }
  ]
});
formatter.step({
  "name": "User landed on View Employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefViewEmployee.user_landed_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for an employee",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefViewEmployee.search_for_an_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on employee name to go to employee profile",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewEmployee.click_employee_to_go_employee_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed to Employee Profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefViewEmployee.user_landed_to_employee_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to update employee details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ViewEmployee"
    }
  ]
});
formatter.step({
  "name": "User landed on View Employee page again",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefViewEmployee.user_landed_on_view_employee_page_again()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search employee by name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefViewEmployee.search_employee_by_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Update Details button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewEmployee.click_on_update_details_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed to Personal Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefViewEmployee.user_should_landed_to_personal_details_page()"
});
formatter.result({
  "status": "passed"
});
});