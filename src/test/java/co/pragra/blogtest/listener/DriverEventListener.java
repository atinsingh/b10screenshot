package co.pragra.blogtest.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DriverEventListener extends AbstractWebDriverEventListener {
    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        //super.afterClickOn(element, driver);
        System.out.println("All good now I am picking what I want");
    }
}
