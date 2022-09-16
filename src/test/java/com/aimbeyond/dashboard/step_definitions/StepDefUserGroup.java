package com.aimbeyond.dashboard.step_definitions;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefUserGroup {

    public static WebDriver driver;
    Faker faker;

    @Given("^User should have Logged into Dashboard Application$")
    public void user_should_have_logged_In_Dashboard_application() throws Throwable{
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://192.168.0.27:5000/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("username")).sendKeys("dashboard@aimbeyond.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(100);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
    }

    @And("^land to Home page$")
    public void land_to_Home_page() throws Throwable{
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on User Group from ADMIN drop down$")
    public void click_on_user_group_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        //Actions a = new Actions(driver);
        Thread.sleep(3000);
        //a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a"))).click().perform();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[14]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on User Group page")
    public void user_should_be_able_to_land_on_user_group_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/userGroup",url);
        Thread.sleep(1000);
    }

    @Given("User is on User Group page")
    public void user_is_on_user_group_page() throws Throwable {
     //   System.out.println("User is on User Group page");
    }

    @When("Click on add group button")
    public void click_on_add_group_button() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[2]/button")).click();
        Thread.sleep(1000);
    }

    @And("Provide group name and click on save button")
    public void provide_group_name_and_click_on_save_button() throws Throwable{
        faker = new Faker();
        driver.findElement(By.name("name")).sendKeys(faker.team().name());
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("New group should be added successfully")
    public void new_group_should_be_added_successfully() throws Throwable {
      //  Alert alt = driver.switchTo().alert();
      //  String txt = alt.getText();
        //Assert.assertEquals("Mail Sent",txt );
      //  alt.accept();
        Thread.sleep(1000);
     //
         driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/button")).click();
    }

    @And("Click on save button without giving group name")
    public void click_on_save_button_without_giving_group_name() throws Throwable{
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("Error should prevent creating new group flow")
    public void error_should_prevent_creating_new_group_flow() throws Throwable{
        String s = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/span/div")).getText();
        System.out.println(s);
         Assert.assertEquals("The name field is required.", s);
         Thread.sleep(500);
         driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[2]")).click();
    }

    @When("Click on add permission button")
    public void click_on_add_permission_button() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[4]/button")).click();
        Thread.sleep(1000);
    }

    @And("Provide permission name and click on save button")
    public void provide_permission_name_and_click_on_save_button() throws Throwable{
        driver.findElement(By.name("name")).sendKeys("Automation Permission");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("New permission should be added successfully")
    public void new_permission_should_be_added_successfully() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/button")).click();
    }

    @And("Click on save button without giving permission name")
    public void click_on_save_button_without_giving_permission_name() throws Throwable{
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("Error should prevent creating new permission flow")
    public void error_should_prevent_creating_new_permission_flow() throws Throwable{
        String s = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/span/div")).getText();
        System.out.println(s);
        Assert.assertEquals("The name field is required.", s);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[2]")).click();
    }

    @When("Select group from groups drop down")
    public void select_group_from_groups_drop_down() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-2-option-8")).click();
    }

    @And("Select permission from permissions drop down")
    public void select_permission_from_permissions_drop_down() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div/div/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-3-option-0")).click();
    }

    @And("Click on ADD PERMISSION TO GROUP button")
    public void click_on_add_permission_to_group_button() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[5]/div/button")).click();
    }

    @Then("Group permission should be mapped successfully")
    public void group_permission_should_be_mapped_successfully() throws Throwable{
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        String s1 = alert.getText();
        System.out.println("Message- " +s1);
        Assert.assertEquals("Group permission mapped successfully",s1);
        alert.accept();
    }

    @When("Leave blank group and permission")
    public void leave_blank_group_and_permission() throws Throwable{
        Thread.sleep(1000);
    }

    @Then("Error should prevent group permission mapping flow")
    public void error_should_prevent_group_permission_mapping_flow() throws Throwable{
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        String s2 = alert.getText();
        System.out.println("Message- " + s2);
        Assert.assertEquals("Please select valid group and permission",s2);
        alert.accept();
    }
}
