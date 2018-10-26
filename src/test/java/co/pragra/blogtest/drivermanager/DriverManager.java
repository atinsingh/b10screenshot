package co.pragra.blogtest.drivermanager;

import co.pragra.blogtest.listener.DriverEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    static WebDriver webDriver;
    static  EventFiringWebDriver driver;

    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/atinsingh/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverEventListener driverListener = new DriverEventListener();

        driver = new EventFiringWebDriver(webDriver);
        driver.register(driverListener);
    }

    public static EventFiringWebDriver getDriver(){
        if(driver==null){
            setUp();
        }
        return driver;
    }
}
