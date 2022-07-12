package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aimbeyond.dashboard.step_definitions.StepDefLogin;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class StepDefRegistration {
    WebDriver driver;

    @Given("^User have logged in Dashboard application$")
    public void user_have_logged_in_Dashboard_application() throws Throwable{
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://192.168.0.27:5000/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("username")).sendKeys("ritu.gupta@aimbeyond.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(100);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(100);
            }

    @Given("^Landing to HOME page$")
    public void landing_to_HOME_page() throws Throwable{
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Registration from ADMIN drop down$")
    public void click_on_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        Actions a = new Actions(driver);
        //a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[7]/a"))).click().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[7]/a")).click();
        Thread.sleep(1000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='registration']")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Registration page")
    public void user_should_be_able_to_land_on_Registration_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/registrationComponent",url);
        Thread.sleep(1000);
    }

    @Given("User landed on Registration page")
    public void user_landed_on_Registration_page() throws Throwable {
        user_have_logged_in_Dashboard_application();
        Thread.sleep(1000);
        click_on_from_ADMIN_drop_down();
    }

    @When("Filling employee details")
    public void filling_employee_details() throws Throwable {
        driver.findElement(By.id("firstName")).sendKeys("Aamir");
        driver.findElement(By.name("lastName")).sendKeys("Singh");
        driver.findElement(By.name("primaryContact")).sendKeys("7101213146");
        driver.findElement(By.name("employeeCode")).sendKeys("82");
        driver.findElement(By.name("source")).sendKeys("Naukri");
        driver.findElement(By.name("aadharNo")).sendKeys("123134545622");
        driver.findElement(By.name("panNo")).sendKeys("BKCQR2004K");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[7]/div/div/div/div/div[1]/div[1]")).click();
        driver.findElement(By.id("react-select-2-option-0")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[8]/div/div/div/div/div[1]")).click();
        driver.findElement(By.id("react-select-3-option-0")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[10]/div/div/div/div/div[1]")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[11]/div/div/div/div/div[1]")).click();
        driver.findElement(By.id("react-select-5-option-0")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[12]/div/div/div/div/div[1]/div[1]")).click();
        driver.findElement(By.id("react-select-6-option-0")).click();
    }

    @When("Click on REGISTER NOW: NEW EMPLOYEE button")
    public void click_on_button() throws Throwable{
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(1000);
    }

    @Then("Registration should be completed successfully")
    public void registration_should_be_completed_successfully() throws Throwable{
        String url = driver.getCurrentUrl();
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewEmployees",url);
        Thread.sleep(1000);
    }

    @When("Mandatory fields are not provided")
    public void mandatory_fields_are_not_provided() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("Register new employee")
    public void register_new_employee() throws Throwable {
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(1000);
    }

    @Then("Error should prevent the registration flow")
    public void error_should_prevent_the_registration_flow() throws Throwable {
        String url = driver.getCurrentUrl();
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/registrationComponent",url);
        Thread.sleep(1000);
    }

    @And("^Closing browser$")
    public void closing_the_browser() throws Throwable{
        driver.quit();
    }

    @And("Click on employee name to go to employee profile")
    public void click_employee_to_go_employee_profile() throws Throwable{
        driver.findElement(By.xpath("//td[text()='184']//following-sibling::td//a")).click();
        Thread.sleep(1000);
    }


}
