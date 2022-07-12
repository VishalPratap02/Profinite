package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefUpdateLeaveBalance {
    public static WebDriver driver;

    @Given("^User have logged In Dashboard Application$")
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

    @And("^Land to Home page$")
    public void land_to_HOME_page() throws Throwable {
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Update Leave Balance from ADMIN drop down$")
    public void click_on_update_leave_balance_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[11]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Update Leaves Balance page")
    public void user_should_be_able_to_land_on_update_leave_balance_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/balanceLeave",url);
        Thread.sleep(1000);
    }

    @Given("User landed on Update Leaves Balance page")
    public void user_is_on_update_leave_balance_page() throws Throwable {
        Thread.sleep(1000);
    }

    @When("Provide leave balance to an employee")
    public void provide_leave_balance_to_employee() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/table/tbody/tr[4]/td[3]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/table/tbody/tr[4]/td[3]/input")).sendKeys("101");
    }

    @And("click on update button")
    public void click_on_search_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/button")).click();
    }

    @Then("Employee leave balance should be updated")
    public void employee_attendance_record_including_time() throws Throwable {
        Alert alt = driver.switchTo().alert();
        String txt = alt.getText();
        Assert.assertEquals("Records updated successfully.",txt );
        alt.accept();
    }

    @When("Sort the value by Employee Name and provide negative value to an employee")
    public void sort_the_value_and_negative_value()  throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/table/thead/tr/th[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("-1");
    }

    @Then("Employee leave balance should be updated on negative input")
    public void employee_attendance_record_negative_value() throws Throwable {
        Alert at = driver.switchTo().alert();
        String tx = at.getText();
        Assert.assertEquals("Records updated successfully.",tx );
        at.accept();
    }
}
