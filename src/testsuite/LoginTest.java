package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    public static String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }
   @Test
   public void userShouldNavigateToLoginPageSuccessfully(){
        String expectedMessage="welcome, please Sign In!";
        clickElement(By.linkText("log in"));
        Assert.assertEquals(expectedMessage,getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")));
    }

    @Test
    public void verifySignOutMessageWithValidCredentials() {
        clickElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "sawan123@gmail.com");
        sendTextToElement(By.id("Password"), "admin123");
        clickElement(By.xpath("//button[contains(text(),'Log in')]"));
        //Check msg of login failure
        // clickOnElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a[contains(text(),'Log out')]"));
        String expectedMsg = "Log out";
        Assert.assertEquals(expectedMsg,getTextFromElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a[contains(text(),'Log out')]")));

    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        clickElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "test123@gmail.com");
        sendTextToElement(By.id("Password"), "Welcome1");
        //Check msg of login failure
        // clickOnElement(By.linkText("button-1 login-button"));
        clickElement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedMessage1 = "Login was unsuccessful. Please correct the errors and try again.";
        //Assert.assertEquals(expectedMessage1, getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1][contains(text(),'Login was unsuccessful. Please correct the errors and try again.')")));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }




        }




