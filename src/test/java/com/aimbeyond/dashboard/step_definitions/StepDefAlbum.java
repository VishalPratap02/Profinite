package com.aimbeyond.dashboard.step_definitions;

import com.aimbeyond.dashboard.generics.Generic;
import com.aimbeyond.dashboard.pages.albumPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefAlbum {

         static WebDriver driver;
         albumPage albumpage;
         Generic generic;
        @Given("^User have Logged into Dashboard application$")
        public void user_have_logged_in_Dashboard_application() throws Throwable{
            generic = new Generic();
            driver = generic.login_to_application();
        }

        @And("^Landing To HOME page$")
        public void landing_to_HOME_page() throws Throwable{
            String title = driver.getTitle();
            Thread.sleep(1000);
            System.out.println("Home page title is :: "+ title);
            Assert.assertEquals("Dashboard",title);
            Thread.sleep(1000);
        }

    @When("^Click on Album from ADMIN drop down$")
    public void click_on_Album_from_ADMIN_drop_down() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,5);
        //Actions a = new Actions(driver);
        Thread.sleep(3000);
        //a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a"))).click().perform();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarText\"]/div/ul/li[8]/ul/li[4]/a")));
        Thread.sleep(1000);
        myAccount.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("User should be able to land on Album page")
    public void user_should_be_able_to_land_on_album_page() throws Throwable {
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/viewAlbumComponent",url);
        Thread.sleep(1000);
    }

    @Given("User is on Album page")
    public void user_is_on_album_page() throws Throwable {
            System.out.println("User is on Album page");
    }

    @When("Click on NEW ALBUM button and fill the mandatory fields including \\\"(.*)\\\"")
    public void click_on_new_album_button_and_fill_the_mandatory_fields(String albumname) throws Throwable{
            albumpage = new albumPage(driver);
            albumpage.new_album_mandatory_fields(albumname);
    }

    @And("Click on UPLOAD NOW button")
    public void click_on_upload_now_button() {
            albumpage.click_upload_now();
    }

    @Then("Album should created successfully")
    public void album_should_created_successfully() throws Throwable {
        String message =driver.findElement(By.cssSelector("body > div.modal > div > div > div.modal-content.modal-content1.modal-body > div > div")).getText();
        System.out.println("Album details - "+message);
        //Assert.assertEquals("Image uploaded successfully!",message);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div.modal > div > div > div.modal-content.modal-content1.modal-body > div > div > div > button")).click();
        Thread.sleep(1000);
    }

    @And("Metadata should match with the values provided")
    public void metadata_should_match_with_the_values_provided() throws Throwable {
            Thread.sleep(1000);
        String msg =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals("Test", msg);
    }

    @When("Click on NEW ALBUM button and leave mandatory fields")
    public void click_on_new_album_button_and_leave_mandatory_fields() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div/a/i")).click();
        Thread.sleep(1000);
    }

    @Then("Error should prevent creating new album flow")
    public void error_should_prevent_creating_new_album_flow() throws Throwable {
        String name =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[1]/div/span/div")).getText();
        System.out.println("Leave status - "+name);
        Assert.assertEquals("The album name field is required.", name);
        String cat =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[2]/div/span/div")).getText();
        System.out.println("Leave status - "+cat);
        Assert.assertEquals("The category field is required.", cat);
        String dsc =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[3]/span/div")).getText();
        System.out.println("Leave status - "+dsc);
        Assert.assertEquals("The description field is required.", dsc);
        String img =driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[4]/div/span/div")).getText();
        System.out.println("Leave status - "+img);
        Assert.assertEquals("The image field is required.", img);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span[1]")).click();
    }

    @When("Click on a particular album")
    public void click_on_a_particular_album() throws Throwable{
            Thread.sleep(1000);
//            albumpage.click_on_album();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/a")).click();
    }

    @Then("User should be able to land on editAlbumImages page")
    public void user_land_on_edit_album_images_page() throws Throwable{
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        System.out.println("Page url is "+url);
        Assert.assertEquals("http://192.168.0.27:5000/dashboard/editAlbumImages",url);
        Thread.sleep(1000);
    }

}
