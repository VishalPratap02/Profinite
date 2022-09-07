package com.aimbeyond.dashboard.step_definitions;

import com.aimbeyond.dashboard.pages.loginPage;
//import com.aimbeyond.dashboard.utilities.Hooks;
import cucumber.api.HookTestStep;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class StepDefLogin {
     public static WebDriver driver;
     loginPage login;

@Before
    public void browser_setup() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

@After
    public void teardown() throws Throwable {
        driver.quit();
}
    @Given("^Open browser and start application$")
    public void Open_browser_and_start_application() throws Throwable {
        driver.get("http://192.168.0.27:5000/");
    }

    @When("^Enter valid (.*) and (.*)$")
    public void Enter_valid_username_and_password(String username,String password) throws Throwable {
        login = new loginPage(driver);
        login.login_valid_user(username,password);
//      driver.findElement(By.name("username")).sendKeys(username);
//      driver.findElement(By.name("password")).sendKeys(password);
      Thread.sleep(1000);
    }

    @And("^Click on login button$")
    public void Click_on_login_button() throws Throwable {
        login.click_login_button();
//      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(1500);
    }

    @Then("^User should be able to logging successfully$")
    public void User_should_be_able_to_logging_successfully() throws Throwable{
      String title = driver.getTitle();
      Thread.sleep(1500);
      System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }
}