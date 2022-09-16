package com.aimbeyond.dashboard.step_definitions;

import com.aimbeyond.dashboard.generics.Generic;
import com.aimbeyond.dashboard.pages.loginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepDefLogin {
     WebDriver driver;
     loginPage login;
     Generic generic;

    @Given("^Open browser and start application$")
    public void Open_browser_and_start_application() throws Throwable {
        generic = new Generic();
        driver = generic.applicationLaunch();
    }

    @When("^Enter valid (.*) and (.*)$")
    public void Enter_valid_username_and_password(String username,String password) throws Throwable {
        login = new loginPage(driver);
        login.login_valid_user(username,password);
        Thread.sleep(1000);
    }

    @And("^Click on login button$")
    public void Click_on_login_button() throws Throwable {
        login.click_login_button();
        Thread.sleep(1500);
    }


    @Then("^User should be able to logging successfully$")
    public void User_should_be_able_to_logging_successfully() throws Throwable{
      String url = driver.getCurrentUrl();
      Thread.sleep(1500);
      System.out.println("Home page url is "+ url);
      Assert.assertEquals("http://192.168.0.27:5000/dashboard/dashboardPanelComponent",url);
        Thread.sleep(1000);
    }
}