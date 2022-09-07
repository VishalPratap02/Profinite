package com.aimbeyond.dashboard.pages;

import com.aimbeyond.dashboard.step_definitions.StepDefLogin;
//import com.aimbeyond.dashboard.utilities.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement username_txt;

    @FindBy(name = "password")
    WebElement password_txt;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement login_btn;

    public loginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void login_valid_user(String username, String password){
        username_txt.sendKeys(username);
        password_txt.sendKeys(password);
    }
    public void click_login_button(){
        login_btn.click();
    }

}
