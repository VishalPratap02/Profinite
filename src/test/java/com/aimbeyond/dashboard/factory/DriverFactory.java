package com.aimbeyond.dashboard.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public WebDriver driver;

    public static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

    public WebDriver init_driver(String browser) {
        System.out.println("browser value is" + browser);

        if (browser.equals("chrome")) {
            //WebDriverManager.chromedriver().setup();
            tDriver.set(new ChromeDriver());
        }
        else if (browser.equals("firefox")) {
            //WebDriverManager.chromedriver().setup();
            tDriver.set(new FirefoxDriver());
        }
        else {
            System.out.println("Please pass the correct browser value:" + browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }
    public static synchronized WebDriver getDriver() {
        return tDriver.get();
    }
}
