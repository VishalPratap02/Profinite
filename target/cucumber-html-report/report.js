$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Notification%20Center.feature");
formatter.feature({
  "name": "Notification Center",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NotificationCenter"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to land on Notification Center page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NotificationCenter"
    }
  ]
});
formatter.step({
  "name": "User Have Logged In Dashboard application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefNotificationCenter.user2_have_logged_in_Dashboard_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Land To Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefNotificationCenter.land_to_HOME_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Notification Center from ADMIN drop down",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefNotificationCenter.click_on_update_leave_balance_from_ADMIN_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on Notification Center page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefNotificationCenter.user_should_be_able_to_land_on_update_leave_balance_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to Approve Attendance in mass from Attendance Notification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NotificationCenter"
    }
  ]
});
formatter.step({
  "name": "User landed on Notification Center page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefNotificationCenter.user_is_on_update_leave_balance_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Attendance request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefNotificationCenter.select_attendance_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on approve button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefNotificationCenter.click_on_approve_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Approved attendance \u003cString\u003e \u003cString\u003e should not available on notification center anymore",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefNotificationCenter.approved_attendance_should_not_available(String,String)"
});
formatter.result({
  "status": "passed"
});
});