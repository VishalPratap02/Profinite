package com.aimbeyond.dashboard.step_definitions;

import com.aimbeyond.dashboard.pages.emailPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class StepDefEmail {

    public static WebDriver driver;
    emailPage emailpage;

    @Given("^User have Logged into Dashboard Application$")
    public void user_have_logged_In_Dashboard_application() throws Throwable{
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

    @And("^land to home page$")
    public void land_to_hOME_page() throws Throwable{
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on Email from ADMIN drop down$")
    public void click_on_email_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        //Actions a = new Actions(driver);
        Thread.sleep(3000);
        //a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a"))).click().perform();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[12]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Email page")
    public void user_should_be_able_to_land_on_email_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/emailComponent",url);
        Thread.sleep(1000);
    }

    @Given("User is on Email page")
    public void user_is_on_email_page() throws Throwable {
        System.out.println("User is on Email page");
    }

    @When("Fill the mandatory fields")
    public void fill_the_mandatory_fields() throws Throwable{
        emailpage = new emailPage(driver);
        emailpage.email_mandatory_fields();
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("vishal.singh@aimbeyond.com");
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/input")).sendKeys(Keys.ENTER);
//        driver.findElement(By.name("subject")).sendKeys("Automation Testing");
        Thread.sleep(1000);
        }

    @And("Click on Send button")
    public void click_on_send_button() throws Throwable{
        emailpage.click_send_button();
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/button[1]")).click();
        Thread.sleep(5000);
    }

    @Then("Email should be send successfully")
    public void email_should_be_send_successfully() throws Throwable {
        Alert alt = driver.switchTo().alert();
        String txt = alt.getText();
        Assert.assertEquals("Mail Sent",txt );
        alt.accept();
    }

    @When("leave mandatory fields blank")
    public void leave_mandatory_fields_blank() throws Throwable {
        Thread.sleep(1000);
    }

    @Then("Error should prevent sending mail flow")
    public void error_should_prevent_sending_mail_flow() throws Throwable {
        String to =driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/span/div")).getText();
        System.out.println("Email status - "+to);
        Assert.assertEquals("The to field is required.",to);
        String subject =driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[4]/span/div")).getText();
        System.out.println("Email status - "+subject);
        Assert.assertEquals("The subject field is required.",subject);
        String body =driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[5]/span/div")).getText();
        System.out.println("Email status - "+body);
        Assert.assertEquals("The body field is required.",body);
    }

    @And("Click on RESET button")
    public void click_on_reset_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/button[2]")).click();
    }

    @Then("Fields value should be reset to blank")
    public void fields_value_should_be_reset_to_blank() throws Throwable {
        String to =driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/input")).getText();
        Assert.assertNotEquals("vishal.singh@aimbeyond.com",to);
        String subject =driver.findElement(By.name("subject")).getText();
        Assert.assertNotEquals("Automation Testing",subject);
    }

    @And("^Closing browsers$")
    public void closing_the_browser() throws Throwable{
        driver.quit();
    }

}
