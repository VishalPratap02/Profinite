package com.aimbeyond.dashboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewAttendance {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[1]")
    WebElement view_btn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[1]")
    WebElement empl_name;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[2]")
    WebElement in_time;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[3]")
    WebElement out_time;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div/div/div[4]")
    WebElement cmnt_txt;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[3]/button[2]")
    WebElement export_excel;

    public viewAttendance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click_view_button(){
        view_btn.click();
    }
    public void employee_attendance_record_shoud_appear(){
        String name = empl_name.getText();
        String t1 = in_time.getText();
        String t2 = out_time.getText();
        String cments = cmnt_txt.getText();
        System.out.println("Name "+name);
        System.out.println("In-time "+t1);
        System.out.println("Out-time "+t2);
        System.out.println("Comments "+cments);
    }

    public void click_on_export_excel(){
        export_excel.click();
    }
}
