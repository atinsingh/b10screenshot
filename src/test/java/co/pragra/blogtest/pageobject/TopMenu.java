package co.pragra.blogtest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {

    WebDriver driver;

    @FindBy(css="a[class~=logo]>span>span")
    WebElement logo ;

    @FindBy(xpath = "//a/span/span/span[.='Home']")
    WebElement homeLink;

    WebElement laguageDropDown;

    @FindBy(css = "li[class~=nav-item]:last-child")
    WebElement accountDropDown;


    @FindBy(css = "#login")
    WebElement signInLink;

    @FindBy(css = "a[class=dropdown-item][href='#/register']")
    WebElement resigterLink;

    // We need to use PageFactory == >
    // class given Selenium guys, which will help
    // you to initiliaze all these items


    public TopMenu(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public  TopMenu clickOnAccountLink(){
        this.accountDropDown.click();
        return this;
    }

    public SignInPage clickOnSignInLink(){
        this.signInLink.click();
        return  new SignInPage(driver);
    }


}
