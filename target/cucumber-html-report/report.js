$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/View%20Attendance.feature");
formatter.feature({
  "name": "View Attendance",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ViewAttendance"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to land on View Attendance page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ViewAttendance"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have Logged In Dashboard application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefViewAttendance.user_have_logged_in_Dashboard_application()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Error creating bean with name \u0027com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance\u0027: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance.\u003cinit\u003e()\r\n\tat cucumber.runtime.java.spring.SpringFactory.getInstance(SpringFactory.java:212)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:45)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name \u0027com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance\u0027: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance.\u003cinit\u003e()\r\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1334)\r\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1232)\r\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)\r\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)\r\n\tat org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$1(AbstractBeanFactory.java:374)\r\n\tat cucumber.runtime.java.spring.GlueCodeScope.get(GlueCodeScope.java:14)\r\n\tat org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:371)\r\n\tat org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:233)\r\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1282)\r\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1243)\r\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:494)\r\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:349)\r\n\tat org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)\r\n\tat cucumber.runtime.java.spring.SpringFactory.getInstance(SpringFactory.java:210)\r\n\t... 35 more\r\nCaused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance.\u003cinit\u003e()\r\n\tat org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:83)\r\n\tat org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1326)\r\n\t... 48 more\r\nCaused by: java.lang.NoSuchMethodException: com.aimbeyond.dashboard.step_definitions.StepDefViewAttendance.\u003cinit\u003e()\r\n\tat java.base/java.lang.Class.getConstructor0(Class.java:3585)\r\n\tat java.base/java.lang.Class.getDeclaredConstructor(Class.java:2754)\r\n\tat org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:78)\r\n\t... 49 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Landing To HOME Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefViewAttendance.landing_to_HOME_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on View Attendance from ADMIN drop down",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefViewAttendance.click_on_View_Attendance_from_ADMIN_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to land on View Attendance page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefViewAttendance.user_should_be_able_to_land_on_View_Attendance_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});