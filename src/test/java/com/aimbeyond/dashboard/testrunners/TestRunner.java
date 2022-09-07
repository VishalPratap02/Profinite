package com.aimbeyond.dashboard.testrunners;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features"},
        tags = {"@ViewAttendance"},
//        tags = {"@login"},
        plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber-report/cucumber.json"},
        glue = {"com.aimbeyond.dashboard"}
)
public class TestRunner {
}
