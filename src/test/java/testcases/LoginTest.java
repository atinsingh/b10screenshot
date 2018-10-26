package testcases;

import co.pragra.blogtest.drivermanager.DriverManager;
import co.pragra.blogtest.listener.DriverEventListener;
import co.pragra.blogtest.listener.ScreenShotListener;
import co.pragra.blogtest.pageobject.DashBoardPage;
import co.pragra.blogtest.pageobject.SignInPage;
import co.pragra.blogtest.pageobject.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


@Listeners({ScreenShotListener.class})
public class LoginTest {


    EventFiringWebDriver driver;
    TopMenu topMenu;
    SignInPage signInPage;


    @BeforeTest
    public void testPrep(){
        driver = DriverManager.getDriver();
        driver.get("https://pragrablog.herokuapp.com");
        topMenu = new TopMenu(driver);
        //d.switchTo().alert().dismiss();

    }

    @Test
    public void checkLogin(){
        signInPage = topMenu.clickOnAccountLink().clickOnSignInLink();
        DashBoardPage page =signInPage.keyinUserName("admin").keyInPassword("admin").clickSignButton();
        Assert.assertTrue(page.getSuccessAlert().getText().contains("logged"));
    }

    @Test
    public void afterLogin(){
        Assert.fail();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}
