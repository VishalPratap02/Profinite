package com.aimbeyond.dashboard.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefProjects {
    public static WebDriver driver;

    @Given("^User have Logged in to Dashboard application$")
    public void user_have_logged_In_to_Dashboard_application() throws Throwable{
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://192.168.0.27:5000/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("username")).sendKeys("dashboard@aimbeyond.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @And("^Land To HOME page$")
    public void land_to_hme_page() throws Throwable{
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println("Home page title is :: "+ title);
        //Assert.assertEquals("Dashboard",title);
        Thread.sleep(4000);
    }

    @When("^Click on Projects from ADMIN drop down$")
    public void click_on_projects_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        //Actions a = new Actions(driver);
        Thread.sleep(3000);
        //a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a"))).click().perform();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[13]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Projects page")
    public void user_should_be_able_to_land_on_projects_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/projects",url);
        Thread.sleep(1000);
    }

    @Given("User is on Projects page")
    public void user_is_on_projects_page() throws Throwable {
        System.out.println("User is on Email page");
    }

    @When("Click on NEW PROJECT button and fill the mandatory fields")
    public void click_on_new_project_button_and_fill_the_mandatory_fields() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[1]/input")).sendKeys("Automation Testing10");
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]")).click();
        driver.findElement(By.id("react-select-5-option-0")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("actualEndDate")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[4]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[4]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[4]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[5]/div/div/div/div[1]")).click();
        driver.findElement(By.id("react-select-6-option-5")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[6]/div/div/div/div[1]/div[1]")).click();
        driver.findElement(By.id("react-select-7-option-6")).click();
        driver.findElement(By.name("projectDesc")).sendKeys("Automation Testing Project10");
    }

    @And("Click on SAVE button")
    public void click_on_save_button() {
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("Project should created successfully")
    public void project_should_created_successfully() throws Throwable {
        String message =driver.findElement(By.cssSelector(".form-body > div:nth-child(1)")).getText();
        System.out.println("Project details - "+message);
        //Assert.assertEquals("Project is added successfully." +
        //        "CLOSE",message);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/button")).click();
        Thread.sleep(1000);
    }

    @When("Click on NEW PROJECT button and leave mandatory fields blank")
    public void click_on_new_project_button_and_leave_mandatory_fields_blank() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div/a")).click();
        Thread.sleep(1000);
    }

    @Then("Error should prevent creating new project flow")
    public void error_should_prevent_creating_new_project_flow() throws Throwable{
        String name =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[1]/span/div")).getText();
        System.out.println("Project status - "+name);
        Assert.assertEquals("The project name field is required.",name);
        String pm =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[5]/span/div")).getText();
        System.out.println("Project status - "+pm);
        Assert.assertEquals("The project manager field is required.",pm);
        String prm =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[6]/span/div")).getText();
        System.out.println("Project status - "+prm);
        Assert.assertEquals("The program manager field is required.",prm);
        String desc =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[7]/span/div")).getText();
        System.out.println("Project status - "+desc);
        Assert.assertEquals("The description field is required.",desc);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span[1]")).click();
    }

    @When("Click on edit sign of the project")
    public void click_on_edit_sign_of_the_project() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/a[1]/i")).click();
    }

    @And("Edit the project details and click on UPDATE button")
    public void edit_the_project_details_and_click_on_update_button() throws Throwable{
        driver.findElement(By.name("projectDesc")).sendKeys("New Project Aim");
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("Project details should updated as expected")
    public void project_details_should_updated_as_expected() throws Throwable{
//        String mess =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/text()")).getText();
//        System.out.println("Project details - "+mess);
//        Assert.assertEquals("Project is updated successfully.",mess);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div.modal > div > div > div.modal-header-bg.modal-header > button > span:nth-child(1)")).click();
        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        Assert.assertEquals("Project is updated successfully.",alert);
//        alert.accept();
    }

    @When("Click on delete sign of the project")
    public void click_on_delete_sign_of_the_project() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/a[2]/i")).click();
    }

    @And("Click on the confirmation pop up")
    public void click_on_the_confirmation_pop_up() throws Throwable{
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Then("Project should be delete from Projects page")
    public void project_should_be_deleted_from_projects_page() throws Throwable{
        Thread.sleep(1000);
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
    }

    @When("Click on view sign of the project")
    public void click_on_view_sign_of_the_project() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/a[3]/i")).click();
    }

    @Then("User should be able to land on view project page")
    public void user_should_be_able_to_land_on_view_project_page() throws Throwable{
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewProjects",url);
    }

    @Given("User is on view projects page")
    public void user_is_on_view_projects_page() throws Throwable{
        Thread.sleep(1000);
    }

    @When("Click on Team Member button and provide member details")
    public void click_on_team_member_button_and_provide_member_details() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("react-select-17-option-4")).click();
        Thread.sleep(1500);
        // driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div[1]")).sendKeys(Keys.TAB);
//        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("react-select-6-option-21")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div[1]/div[1]")).click();
//        driver.findElement(By.id("react-select-7-option-0")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div[4]/div/div/div/div[1]/div[1]")).click();
        driver.findElement(By.id("react-select-20-option-4")).click();
        Thread.sleep(1000);
    }

    @And("Click on Save button")
    public void click_on_save_button_() throws Throwable{
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/button[1]")).click();
    }

    @Then("Member details should be added to Team Members section")
    public void member_details_should_be_added_to_team_member_section() throws Throwable{
        String txt = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div")).getText();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div.modal > div > div > div.modal-header-bg.modal-header > button > span:nth-child(1)")).click();
    }

    @When("Click on Projects button")
    public void click_on_projects_button() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div/a")).click();
    }

    @Then("User should be route back to Projects page")
    public void user_should_be_route_back_to_projects_page() throws Throwable{
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/projects",url);
        Thread.sleep(1000);
    }

    @And("^Close Browser$")
    public void closing_Browser() throws Throwable{
        driver.quit();
    }


}
