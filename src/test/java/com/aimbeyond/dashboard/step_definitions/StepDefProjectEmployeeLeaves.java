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

public class StepDefProjectEmployeeLeaves {
    public static WebDriver driver;

    @Given("^User have logged In Dashboard application$")
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

    @And("^Landing to Home page$")
    public void landing_to_HOME_page() throws Throwable {
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Project Employee Leaves from ADMIN drop down$")
    public void click_on_Project_Employee_Leaves_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[6]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Project Employee Leaves page")
    public void user_should_be_able_to_land_on_View_Monthly_Attendance_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewProjectEmployeeLeave",url);
        Thread.sleep(1000);
    }

    @Given("User landed on Project Employee Leaves page")
    public void user_is_on_album_page() throws Throwable {
        Thread.sleep(1000);
    }

    @When("Select project as all and date as current month")
    public void select_project_as_all_and_date_as_current_month() throws Throwable {
        //
    }

    @And("click on search button")
    public void click_on_search_button() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[4]/button")).click();
    }

    @Then("Employee leave should appear for all the project")
    public void employee_attendance_record_including_time() throws Throwable {
        Boolean tb = driver.getPageSource().contains("Dashboard");
        Assert.assertTrue(tb);
    }

    @When("Select Dashboard project with current month")
    public void select_dashboard_project_with_current_month() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-2-option-3")).click();
        Thread.sleep(1000);
    }

    @Then("Leave details should appear for Dashboard project")
    public void leave_details_should_appear_for_dashboard_project() throws Throwable {
        Boolean tb = driver.getPageSource().contains("Dashboard");
        Assert.assertTrue(tb);
    }

    @And("^Close browser$")
    public void closing_the_browser() throws Throwable{
        driver.quit();
    }
}
