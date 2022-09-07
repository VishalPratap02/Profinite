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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import com.aimbeyond.dashboard.utilities.Hooks;

import java.io.File;

public class StepDefViewAttendance {
   WebDriver driver;
   StepDefLogin stepDefLogin;// = new StepDefLogin();

    @Given("^User have Logged In Dashboard application$")
    public void user_have_logged_in_Dashboard_application() throws Throwable{
        stepDefLogin.browser_setup();
        stepDefLogin.Open_browser_and_start_application();
        stepDefLogin.Enter_valid_username_and_password("ritu.gupta@aimbeyond.com", "12345");
        stepDefLogin.Click_on_login_button();
//        stepDefLogin.User_should_be_able_to_logging_successfully();
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.get("http://192.168.0.27:5000/");
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.findElement(By.name("username")).sendKeys("ritu.gupta@aimbeyond.com");
//        driver.findElement(By.name("password")).sendKeys("12345");
//        Thread.sleep(100);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(100);
    }

    public StepDefViewAttendance(WebDriver driver){
        this.driver = driver;
    }

    @And("^Landing To HOME Page$")
    public void landing_to_HOME_page() throws Throwable {
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on View Attendance from ADMIN drop down$")
    public void click_on_View_Attendance_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        //Actions a = new Actions(driver);
        Thread.sleep(500);
        //a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a"))).click().perform();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[7]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on View Attendance page")
    public void user_should_be_able_to_land_on_View_Attendance_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/adminViewAttendanceComponent",url);
        Thread.sleep(1000);
    }

    @Given("User landed on View Attendance page")
    public void user_is_on_album_page() throws Throwable {
        System.out.println("User is on View Attendance page");
    }

    @When("Select employee name and date")
    public void select_employee_name_and_date() throws Throwable {
        //Thread.sleep(3000);
        //driver.findElement(By.id("react-select-2-option-0")).click();
    }

    @And("Click on View button")
    public void click_on_view_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[1]")).click();
    }

    @Then("Employee attendance record including In-time and Out-time should appear")
    public void employee_attendance_record_including_time() throws Throwable {
        String name = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[1]")).getText();
        String t1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[2]")).getText();
        String t2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[3]")).getText();
        String comments = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[4]")).getText();
        System.out.println("Name - "+name);
        System.out.println("In-time - "+t1);
        System.out.println("Out-time - "+t2);
        System.out.println("Comments - "+comments);
    }

    @When("Select employee name with date and click on View button")
    public void select_employee_name_with_date_and_click_view_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[1]")).click();
    }

    @And("Click on Export to Excel button")
    public void click_on_export_to_excel_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[2]")).click();
    }

    @Then("Excel sheet with attendance records should be downloaded in download folder")
    public void excel_sheet_with_attendance_in_download_folder() throws Throwable {
        File fl = new File("C:\\Users\\Vishal Pratap Singh\\Downloads");
        File[] files = fl.listFiles();
        for (File file : files){
            if (file.getName().equals("All.xlsx")){
                System.out.println("File is downloaded");
                break;
            }
        }
    }

    @And("^Close the Browser$")
    public void closing_the_browser() throws Throwable{

    }
}
