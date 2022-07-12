package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefLogin {
    WebDriver driver;

    @Given("^Open browser and start application$")
    public void Open_browser_and_start_application() throws Throwable {
      //System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
      //driver = new ChromeDriver();
        driver = new FirefoxDriver();
      driver.get("http://192.168.0.27:5000/");
      //driver.get("https://www.google.co.in/");
    }

    @When("^Enter valid username and password$")
    public void Enter_valid_username_and_password() throws Throwable {
      driver.findElement(By.name("username")).sendKeys("ritu.gupta@aimbeyond.com");
      driver.findElement(By.name("password")).sendKeys("12345");
      Thread.sleep(1000);
    }

    @And("^Click on login button$")
    public void Click_on_login_button() throws Throwable {
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(1000);
    }

    @Then("^User should be able to logging successfully$")
    public void User_should_be_able_to_logging_successfully() throws Throwable{
      String title = driver.getTitle();
      Thread.sleep(1000);
      System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }
    @And("^Closing the browser$")
    public void closing_the_browser() throws Throwable{
        driver.quit();
    }
}
