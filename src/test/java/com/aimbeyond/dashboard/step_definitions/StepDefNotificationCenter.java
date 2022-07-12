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

public class StepDefNotificationCenter {
    public static WebDriver driver;

    @Given("^User Have Logged In Dashboard application$")
    public void user2_have_logged_in_Dashboard_application() throws Throwable{
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://192.168.0.27:5000/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("username")).sendKeys("dashboard@aimbeyond.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(100);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(100);
    }

    @And("^Land To Home Page$")
    public void land_to_HOME_page() throws Throwable {
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Notification Center from ADMIN drop down$")
    public void click_on_update_leave_balance_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[10]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Notification Center page")
    public void user_should_be_able_to_land_on_update_leave_balance_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/notificationCenter",url);
        Thread.sleep(1000);
    }

    @Given("User landed on Notification Center page")
    public void user_is_on_update_leave_balance_page() throws Throwable {
        Thread.sleep(1000);
    }

    @When("Select Attendance request")
    public void select_attendance_request() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/span/input")).click();
        String attendance1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
        String attendance2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/span/input")).getText();

    }

    @And("click on approve button")
    public void click_on_approve_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[1]")).click();
    }

    @Then("Approved attendance (.+) (.+) should not available on notification center anymore")
    public void approved_attendance_should_not_available(String attendance1, String attendance2) throws Throwable {
        String atten1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
        String atten2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/span/input")).getText();
        Assert.assertNotEquals(attendance1,atten1);
        Assert.assertNotEquals(attendance2,atten2);
    }

    @And("click on Reject button")
    public void click_on_reject_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[2]")).click();
    }

    @Then("Rejected attendance (.+) (.+) should not available on notification center anymore")
    public void rejected_attendance_should_not_available(String attendance1, String attendance2) throws Throwable {
        String atten1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
        String atten2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/span/input")).getText();
        Assert.assertNotEquals(attendance1,atten1);
        Assert.assertNotEquals(attendance2,atten2);
    }

    @When("Select Leave request")
    public void select_leave_request() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[1]/table/tbody/tr[1]/td[1]/span/input")).click();
        String Leave1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
    }

    @And("click on Approve button")
    public void click_on_Approve_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[3]/button[1]")).click();
    }

    @Then("Approved leave (.+) should not available on notification center anymore")
    public void approved_leave_should_not_available(String leave1) throws Throwable {
        String lv1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
        Assert.assertNotEquals(leave1,lv1);
    }

    @When("Select Reject request")
    public void reject_leave_request() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[1]/table/tbody/tr[1]/td[1]/span/input")).click();
        String Leave1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
    }

    @And("click on reject button")
    public void click_on_Reject_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[3]/button[2]")).click();
    }

    @Then("Rejected Leave (.+) (.+) should not available on notification center anymore")
    public void rejected_leave_should_not_available(String Leave1) throws Throwable {
        String lv1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/input")).getText();
        Assert.assertNotEquals(Leave1,lv1);
            }

}
