package com.aimbeyond.dashboard.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Generic {
    Properties pro;
    FileInputStream fis;

    public static Logger logger = LoggerFactory.getLogger(Generic.class);
    public WebDriver applicationLaunch() throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
        pro = new Properties();
        pro.load(fis);
        WebDriver driver = new FirefoxDriver();
        driver.get(pro.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("My first log");
        return driver;
    }

    public WebDriver login_to_application() throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
        pro = new Properties();
        pro.load(fis);
        WebDriver driver = new FirefoxDriver();
        driver.get(pro.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Login to application - log");
        driver.findElement(By.name("username")).sendKeys(pro.getProperty("uname"));
        driver.findElement(By.name("password")).sendKeys(pro.getProperty("pass"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return driver;
    }
}

