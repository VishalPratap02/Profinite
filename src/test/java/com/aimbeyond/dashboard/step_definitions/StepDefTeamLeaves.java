package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefTeamLeaves {
    public static WebDriver driver;

    @Given("^User logged in Dashboard application$")
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

    @And("^Should land to Home page$")
    public void land_to_HOME_page() throws Throwable {
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Team Leaves from ADMIN drop down$")
    public void click_on_update_leave_balance_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[4]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Team Leaves page")
    public void user_should_be_able_to_land_on_update_leave_balance_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewEmployeeLeave?fromPage=teamLeave",url);
        Thread.sleep(1000);
    }

    @Given("User landed on Team Leaves page")
    public void user_is_on_update_leave_balance_page() throws Throwable {
        Thread.sleep(1000);
    }

    @When("Select leaves type as Paid Time Off")
    public void select_leave_type_as_paid_off() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[4]/div/div/div/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-5-option-1")).click();
        Thread.sleep(1000);
    }

    @And("Click on search button")
    public void click_on_search_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[5]/button")).click();
    }

    @Then("Only Paid time off leaves type should appear")
    public void only_paid_time_off_leave_type_should_appear() throws Throwable {
        Boolean PTO = driver.getPageSource().contains("Paid Time Off");
        Assert.assertTrue(PTO);
        Boolean LWP = driver.getPageSource().contains("Leave Without Pay");
        Assert.assertFalse(LWP);
        Boolean PT = driver.getPageSource().contains("Paternity");
        Assert.assertFalse(PT);
        Boolean RH = driver.getPageSource().contains("Restricted Holiday");
        Assert.assertFalse(RH);
    }

    @When("Select Awaiting approval leave status")
    public void select_awaiting_approval_leave_status() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[3]/div/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-4-option-5")).click();
        Thread.sleep(1000);
    }

    @And("Click on Action and approved button")
    public void click_on_action() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/table/tbody/tr/td[7]/span/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(1000);
    }

    @Then("Leave Status should be updated accordingly")
    public void leave_status_should_be_updated_accordingly() throws Throwable {
        String message =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div")).getText();
        System.out.println("Leave status - "+message);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/button")).click();
    }

}
