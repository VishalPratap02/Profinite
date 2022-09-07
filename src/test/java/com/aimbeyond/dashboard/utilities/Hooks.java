package com.aimbeyond.dashboard.utilities;
//import com.aimbeyond.dashboard.step_definitions.StepDefLogin;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

//public class Hooks{ //extends StepDefLogin{
//    public static WebDriver driver;
//    @Before("@First")
//@Before
//public void browser_setup() throws Throwable{
//    System.setProperty("webdriver.gecko.driver","C:\\Users\\Vishal Pratap Singh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://192.168.0.27:5000/");
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.findElement(By.name("username")).sendKeys("ritu.gupta@aimbeyond.com");
//        driver.findElement(By.name("password")).sendKeys("12345");
//        Thread.sleep(100);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//    @After("@Last")
//    public void after_last_scenario() throws Throwable{
//        driver.quit();
//    }
//}
