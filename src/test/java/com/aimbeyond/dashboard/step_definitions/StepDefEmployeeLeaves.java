package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefEmployeeLeaves {
         public static WebDriver driver;

    @Given("^User have Logged in Dashboard application$")
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

    @Given("^Landing to HOME Page$")
    public void landing_to_HOME_page() throws Throwable{
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Employee Leaves from ADMIN drop down$")
    public void click_employee_leaves_from_admin() throws Throwable{
        WebDriverWait wait = new WebDriverWait(driver,5);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[3]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Employee Leaves page")
    public void user_should_be_able_to_land_on_employee_leaves_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewEmployeeLeave?fromPage=employeeLeave",url);
        Thread.sleep(1000);
    }

    @And("^Close the browser$")
    public void closing_the_browser() throws Throwable{
        driver.quit();
    }

    @Given("User landed on Employee Leave page")
    public void user_landed_on_Employee_leave_page() throws Throwable {
        Thread.sleep(1000);
    }

    @When("Select leave type as Paid Time Off")
    public void select_leave_type_as_paid_off() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[4]/div/div/div/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-5-option-1")).click();
        Thread.sleep(1000);
    }

    @And("click on Search button")
    public void click_on_search_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[5]/button")).click();
    }

    @Then("Only Paid time off leave type should appear")
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

    @When("Select awaiting approval leave status")
    public void select_awaiting_approval_leave_status() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[3]/div/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-4-option-5")).click();
        Thread.sleep(1000);
    }

    @And("Click on action and approved button")
    public void click_on_action() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/table/tbody/tr/td[7]/span/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(1000);
    }

    @When("Click on Apply New Leave button")
    public void click_on_apply_new_leave() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[1]/div/div/a")).click();
        Thread.sleep(1000);
    }

    @And("Fill mandatory fields and click on apply button")
    public void fill_mandatory_fields() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-6-option-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-7-option-0")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-8-option-3")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"leave-d\"]")).sendKeys("Doctor appointment schedule2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/div/button")).click();
        Thread.sleep(1000);
    }

    @Then("New leave should be applied successfully")
    public void new_leave_should_be_applied_successfully() throws Throwable {
        String message =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div")).getText();
        System.out.println("Leave status - "+message);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/button")).click();
    }

    @Then("Leave status should be updated accordingly")
    public void leave_status_should_be_updated_accordingly() throws Throwable {
        String message =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div")).getText();
        System.out.println("Leave status - "+message);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/button")).click();
    }

    @And("Leave mandatory fields blank and click on Apply button")
    public void leave_mandatory_fields_blank_and_apply() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/div/button")).click();
        Thread.sleep(1000);
    }

    @Then("Error should prevent applying leave flow")
    public void error_should_prevent_applying_leave_flow() throws Throwable {
        String en =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[1]/div/span/div")).getText();
        System.out.println("Leave status - "+en);
        String to =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[2]/div/span/div")).getText();
        System.out.println("Leave status - "+to);
        String cc =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[3]/div/span/div")).getText();
        System.out.println("Leave status - "+cc);
        String des =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[6]/span/div")).getText();
        System.out.println("Leave status - "+des);
    }
}