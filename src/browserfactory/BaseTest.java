package browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public void openBrowser(String baseurl){
        System.setProperty("webdriver.chrome.driver","drviers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void clickElement(By by) {
        WebElement loginlink = driver.findElement(by);
        loginlink.click();
    }

    public String  getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    public void sendTextToElement(By by,String text){
        //Find the element email field
        driver.findElement(by).sendKeys(text);
    }
    public  void sendTextToElement1(By by){
        //Find the element email field
        driver.findElement(by).click();

    }

    public void closeBrowser(){

        driver.quit();
    }



}
