$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Employee%20Leaves.feature");
formatter.feature({
  "name": "Employee leave records",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@EmployeeLeaves"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to land on Employee Leaves page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EmployeeLeaves"
    }
  ]
});
formatter.step({
  "name": "User have Logged in Dashboard application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.user_have_logged_in_Dashboard_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Landing to HOME Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.landing_to_HOME_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Employee Leaves from ADMIN drop down",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.click_employee_leaves_from_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on Employee Leaves page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.user_should_be_able_to_land_on_employee_leaves_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Getting error message if mandatory fields are missing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EmployeeLeaves"
    }
  ]
});
formatter.step({
  "name": "User landed on Employee Leave page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.user_landed_on_Employee_leave_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Apply New Leave button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.click_on_apply_new_leave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Leave mandatory fields blank and click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.leave_mandatory_fields_blank_and_apply()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error should prevent applying leave flow",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.error_should_prevent_applying_leave_flow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefEmployeeLeaves.closing_the_browser()"
});
formatter.result({
  "status": "passed"
});
});