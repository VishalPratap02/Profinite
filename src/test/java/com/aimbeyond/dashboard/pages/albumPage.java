package com.aimbeyond.dashboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class albumPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div/a/i")
    WebElement new_album_btn;

    @FindBy(name = "albumName")
    WebElement album_name;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]")
    WebElement a1;

    @FindBy(id = "react-select-2-option-3")
    WebElement a2;

    @FindBy(xpath = "//textarea[@name='description']")
    WebElement desc;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[4]/div/div/div/button")
    WebElement a3;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[4]/div/div/div/input")
    WebElement upload_pic;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/div/button")
    WebElement upload_now;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/a")
    WebElement album;

    public albumPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void new_album_mandatory_fields(String albumname){
        new_album_btn.click();
        album_name.sendKeys(albumname);
        a1.click();
        a2.click();
        desc.sendKeys("Test");
        a3.click();
        upload_pic.sendKeys("C:\\Users\\Vishal Pratap Singh\\Desktop\\Automation3.jpg");
    }

    public void click_upload_now(){
        upload_now.click();
    }

    public void click_on_album(){
        album.click();
    }

    public void album_created_successfully(){

    }
}
