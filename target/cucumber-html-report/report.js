$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Dashboard",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "By login dashboard user should be able to land on Home page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser and start application",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter valid \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to logging successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "ritu.gupta@aimbeyond.com",
        "",
        "12345"
      ]
    },
    {
      "cells": [
        "dashboard@aimbeyond.com",
        "",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "By login dashboard user should be able to land on Home page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "Open browser and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefLogin.Open_browser_and_start_application()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"com.aimbeyond.dashboard.step_definitions.StepDefLogin.driver\" is null\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefLogin.Open_browser_and_start_application(StepDefLogin.java:41)\r\n\tat ✽.Open browser and start application(file:src/test/resources/features/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter valid ritu.gupta@aimbeyond.com and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefLogin.Enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefLogin.Click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to logging successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefLogin.User_should_be_able_to_logging_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"com.aimbeyond.dashboard.step_definitions.StepDefLogin.driver\" is null\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefLogin.teardown(StepDefLogin.java:36)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:49)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "By login dashboard user should be able to land on Home page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "Open browser and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefLogin.Open_browser_and_start_application()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"com.aimbeyond.dashboard.step_definitions.StepDefLogin.driver\" is null\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefLogin.Open_browser_and_start_application(StepDefLogin.java:41)\r\n\tat ✽.Open browser and start application(file:src/test/resources/features/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter valid dashboard@aimbeyond.com and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefLogin.Enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefLogin.Click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to logging successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefLogin.User_should_be_able_to_logging_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"com.aimbeyond.dashboard.step_definitions.StepDefLogin.driver\" is null\r\n\tat com.aimbeyond.dashboard.step_definitions.StepDefLogin.teardown(StepDefLogin.java:36)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:49)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
});