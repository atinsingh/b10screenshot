package co.pragra.blogtest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement username;


    @FindBy(id = "password")
    WebElement password;

    @FindBy(css = "button[type='submit']")
    WebElement signButton;


    public  SignInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public SignInPage keyinUserName(String username){
        this.username.sendKeys(username);
        return this;
    }

    public  SignInPage keyInPassword(String password){
        this.password.sendKeys(password);
        return this;
    }

    public DashBoardPage clickSignButton(){
        this.signButton.click();
        return  new DashBoardPage(driver);
    }
}
