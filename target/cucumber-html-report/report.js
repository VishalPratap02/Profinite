$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Album.feature");
formatter.feature({
  "name": "View or Add album",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Album"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to land on album page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Album"
    }
  ]
});
formatter.step({
  "name": "User have Logged into Dashboard application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefAlbum.user_have_logged_in_Dashboard_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Landing To HOME page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefAlbum.landing_to_HOME_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Album from ADMIN drop down",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefAlbum.click_on_Album_from_ADMIN_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on Album page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAlbum.user_should_be_able_to_land_on_album_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should be able to add an album",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Album page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on NEW ALBUM button and fill the mandatory fields including \"\u003cAlbumName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on UPLOAD NOW button",
  "keyword": "And "
});
formatter.step({
  "name": "Album should created successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "Metadata should match with the values provided",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "AlbumName"
      ]
    },
    {
      "cells": [
        "album_9"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to add an album",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Album"
    }
  ]
});
formatter.step({
  "name": "User is on Album page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefAlbum.user_is_on_album_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on NEW ALBUM button and fill the mandatory fields including \"album_9\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefAlbum.click_on_new_album_button_and_fill_the_mandatory_fields(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on UPLOAD NOW button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefAlbum.click_on_upload_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Album should created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAlbum.album_should_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Metadata should match with the values provided",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefAlbum.metadata_should_match_with_the_values_provided()"
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
      "name": "@Album"
    }
  ]
});
formatter.step({
  "name": "User is on Album page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefAlbum.user_is_on_album_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on NEW ALBUM button and leave mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefAlbum.click_on_new_album_button_and_leave_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on UPLOAD NOW button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefAlbum.click_on_upload_now_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.aimbeyond.dashboard.pages.albumPage.click_upload_now()\" because \"this.albumpage\" is null\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefAlbum.click_on_upload_now_button(StepDefAlbum.java:73)\r\n\tat ✽.Click on UPLOAD NOW button(file:src/test/resources/features/Album.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Error should prevent creating new album flow",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAlbum.error_should_prevent_creating_new_album_flow()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User should be able to edit album images",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Album"
    }
  ]
});
formatter.step({
  "name": "User is on Album page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefAlbum.user_is_on_album_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on a particular album",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefAlbum.click_on_a_particular_album()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: Element \u003ca href\u003d\"/dashboard/editAlbumImages\"\u003e is not clickable at point (116,286) because another element \u003cdiv class\u003d\"modal\"\u003e obscures it\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-D9NGSTG\u0027, ip: \u0027192.168.0.88\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [2dd65b75-c753-453e-b03e-da3e6f7f7885, clickElement {id\u003da64d035e-cdf7-449d-9a6f-d3842de5c605}]\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 101.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20220608170832, moz:debuggerAddress: localhost:58783, moz:geckodriverVersion: 0.31.0, moz:headless: false, moz:processID: 18976, moz:profile: C:\\Users\\VISHAL~1\\AppData\\L..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(), se:cdp: ws://localhost:58783/devtoo..., se:cdpVersion: 85, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nElement: [[FirefoxDriver: firefox on WINDOWS (2dd65b75-c753-453e-b03e-da3e6f7f7885)] -\u003e xpath: //*[@id\u003d\"root\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/a]\nSession ID: 2dd65b75-c753-453e-b03e-da3e6f7f7885\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:251)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefAlbum.click_on_a_particular_album(StepDefAlbum.java:120)\r\n\tat ✽.Click on a particular album(file:src/test/resources/features/Album.feature:29)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should be able to land on editAlbumImages page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAlbum.user_land_on_edit_album_images_page()"
});
formatter.result({
  "status": "skipped"
});
});