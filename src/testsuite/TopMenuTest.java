package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        String expectM="Computers";
        clickElement(By.linkText("Computers"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a[contains(text(),'Computers')]")));
    }
    @Test
    public void userShouldNavigateToElectronicPageSuccessfully(){
        String expectM="Electronics";
        clickElement(By.linkText("Electronics"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a[contains(text(),'Electronics')]")));
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        String expectM="Apparel";
        clickElement(By.linkText("Apparel"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a[contains(text(),'Apparel')]")));
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        String expectM="Books";
        clickElement(By.linkText("Books"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a[contains(text(),'Books')] ")));
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        String expectM="Digital downloads";
        clickElement(By.linkText("Digital downloads"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a[contains(text(),'Digital downloads')]")));
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        String expectM="Gift Cards";
        clickElement(By.linkText("Gift Cards"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')])")));
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        String expectM="Jewelry";
        clickElement(By.linkText("Jewelry"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath(" //ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")));

    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}















