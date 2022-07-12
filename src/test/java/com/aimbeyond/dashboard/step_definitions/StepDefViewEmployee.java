package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefViewEmployee {
    WebDriver driver;

    @Given("^User have logged into Dashboard application$")
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

    @Given("^Land to HOME page$")
    public void landing_to_HOME_page() throws Throwable{
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        Assert.assertEquals("Dashboard",title);
        Thread.sleep(1000);
    }

    @When("^Click on View Employee from ADMIN drop down$")
    public void click_on_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/a")).click();
        Thread.sleep(1000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='viewEmployee']")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on View Employee page")
    public void user_should_be_able_to_land_on_Registration_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewEmployees",url);
        Thread.sleep(1000);
    }

    @And("^Closing  browser$")
    public void closing_the_browser() throws Throwable{
        driver.quit();
    }

    @Given("User landed on View Employee page")
    public void user_landed_on_Registration_page() throws Throwable {
        user_have_logged_in_Dashboard_application();
        Thread.sleep(1000);
        click_on_from_ADMIN_drop_down();
        Thread.sleep(1000);
    }

    @When("Select department as Engineering")
    public void select_department_as_engineering() throws Throwable {
        //Actions a = new Actions(driver);
        //Thread.sleep(1000);
        //WebElement we=driver.findElement(By.id("react-select-2-option-4"));
        //a.moveToElement(we).perform();

        //JavascriptExecutor js= (JavascriptExecutor)driver;
        //WebElement we=driver.findElement(By.id("react-select-2-option-4"));
        //js.executeScript("arguments[0].scrollIntoView();", we);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div/div/div/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-2-option-4")).click();

    }

    @And("Click on Search button")
    public void click_on_search_button() throws Throwable {
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
    }

    @Then("Employee records should appear only for Engineering department")
    public void records_appear_for_engineering_department() throws Throwable {
        Boolean Eng = driver.getPageSource().contains("Engineering");
        Assert.assertTrue(Eng);
        Boolean SA = driver.getPageSource().contains("System Admin");
        Assert.assertFalse(SA);
        Boolean HR = driver.getPageSource().contains("Human Resource");
        Assert.assertFalse(HR);
    }

    @When("Search employee by name")
    public void search_employee_by_name() throws Throwable{
       driver.findElement(By.name("employeeName")).sendKeys("Rinku");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
       Thread.sleep(2000);
    }

    @And("Select the check box to activate or deactivate the employee")
    public void select_check_box_to_activate_employee() throws Throwable{
        driver.findElement(By.xpath("//input[@name='empStatus']")).click();
    }

    @And("User should be landed to Employee Profile page")
    public void user_landed_to_employee_profile_page() throws Throwable{
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewEmployeeProfile",url);
    }

    @And("click on Update Details button")
    public void click_on_update_details_button() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/table/tbody/tr/td[7]/div/a/i")).click();
    }

    @Then("User should be landed to Personal Details page")
    public void user_should_landed_to_personal_details_page() throws Throwable{
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/personalDetailFormComponent",url);
        Thread.sleep(1000);
    }

    @And("Click ok on additional pop up to active or inactive the employee")
    public void click_pop_up_to_active_employee() throws Throwable{
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @And("Employee status should be updated accordingly")
    public void employee_status_should_be_updated() throws Throwable{
        Thread.sleep(1000);
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
    }
}
