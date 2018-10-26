package co.pragra.blogtest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    WebDriver driver;

    @FindBy(css = "div[class~=alert]>span>span")
    WebElement successAlert;

    public DashBoardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement getSuccessAlert() {
        return successAlert;
    }
}
