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
formatter.scenario({
  "name": "User should be able to add an album",
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
  "name": "Click on NEW ALBUM button and fill the mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefAlbum.click_on_new_album_button_and_fill_the_mandatory_fields()"
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
  "status": "passed"
});
formatter.step({
  "name": "Error should prevent creating new album flow",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAlbum.error_should_prevent_creating_new_album_flow()"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on editAlbumImages page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAlbum.user_land_on_edit_album_images_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefAlbum.closing_the_browser()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Timed out waiting for driver server to stop.\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-D9NGSTG\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [c45c519d-7290-444b-b1f4-5e18a152837e, quit {}]\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 101.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20220608170832, moz:debuggerAddress: localhost:63977, moz:geckodriverVersion: 0.31.0, moz:headless: false, moz:processID: 13196, moz:profile: C:\\Users\\VISHAL~1\\AppData\\L..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(), se:cdp: ws://localhost:63977/devtoo..., se:cdpVersion: 85, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c45c519d-7290-444b-b1f4-5e18a152837e\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:132)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:598)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:439)\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefAlbum.closing_the_browser(StepDefAlbum.java:155)\r\n\tat ✽.Close The Browser(file:src/test/resources/features/Album.feature:27)\r\nCaused by: java.util.concurrent.ExecutionException: org.openqa.selenium.TimeoutException: Process timed out after waiting for 20000 ms.\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-D9NGSTG\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: driver.version: unknown\r\n\tat java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)\r\n\tat java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2096)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:598)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:439)\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefAlbum.closing_the_browser(StepDefAlbum.java:155)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:45)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: org.openqa.selenium.TimeoutException: Process timed out after waiting for 20000 ms.\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-D9NGSTG\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.os.OsProcess.waitFor(OsProcess.java:174)\r\n\tat org.openqa.selenium.os.CommandLine.waitFor(CommandLine.java:127)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.lambda$execute$2(DriverCommandExecutor.java:122)\r\n\tat java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1768)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\r\n\tat java.base/java.lang.Thread.run(Thread.java:833)\r\n",
  "status": "failed"
});
});