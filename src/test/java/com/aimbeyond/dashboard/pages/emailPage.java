package com.aimbeyond.dashboard.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emailPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/input")
    WebElement to;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/input")
    WebElement entr;

    @FindBy(name = "subject")
    WebElement subject;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/button[1]")
    WebElement send_btn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/span/div")
    WebElement to_err_msg;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[1]/span/div")
    WebElement subject_err_msg;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[5]/span/div")
    WebElement body_err_msg;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/button[2]")
    WebElement reset_btn;

 //   @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[5]/span/div")
 //   WebElement body_err_mg;

    public emailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void email_mandatory_fields(){
        to.sendKeys("vishal.singh@aimbeyond.com");
        entr.sendKeys(Keys.ENTER);
        subject.sendKeys("Automation Testing");
    }

    public void click_send_button(){
        send_btn.click();
    }

    public void error_msg(){
        to_err_msg.getText();
        subject_err_msg.getText();
        body_err_msg.getText();
    }

    public void click_reset_button(){
        reset_btn.click();
    }
}
