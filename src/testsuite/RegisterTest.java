package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    public static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        clickElement(By.linkText("Register"));
        String expectedM = "Register";
        Assert.assertEquals(expectedM, getTextFromElement(By.xpath("//div[@class='header-links']//a[contains(text(),'Register')]")));
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        clickElement(By.linkText("Register"));
        clickElement(By.className("forcheckbox"));
        sendTextToElement(By.id("FirstName"), "Sawam");
        sendTextToElement(By.id("LastName"), "Desai");
        String expectedM = "Register";
        Assert.assertEquals(expectedM, getTextFromElement(By.xpath("//h1[contains(text(),'Register')]")));
        sendTextToElement(By.name("DateOfBirthDay"),"1");
        sendTextToElement(By.name("DateOfBirthMonth"),"09");
        sendTextToElement(By.name("DateOfBirthYear"),"1999");
        sendTextToElement(By.id("Email"),"Sawan123@gmail.com");
        sendTextToElement(By.id("Company"),"Abc@123");
        clickElement(By.id("Newsletter"));
        sendTextToElement(By.id("Password"),"Welcome123");
        sendTextToElement(By.id("ConfirmPassword"),"Welcome123");
        clickElement(By.id("register-button"));
        String expectM1="Your registration completed";
        Assert.assertEquals(expectM1,getTextFromElement(By.xpath(" //div[@class='page-body']//div[contains(text(),'Your registration completed')]")));


    }


    @After
    public void tearDown() {
        // closeBrowser();
    }







}



