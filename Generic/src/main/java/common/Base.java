package common;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.lang.String;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shakir on 8/22/2016.
 */
public class Base {
    public WebDriver driver= null;

    @BeforeMethod
    @Parameters({"url"})
    public void setUp(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shakir\\Desktop\\PeopleNtech\\software\\chromedriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\shakir\\Desktop\\PeopleNtech\\software\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        sleepFor(1);

    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();

    }
    public void clickByCss(String Locator){
        driver.findElement(By.cssSelector(Locator)).click();
    }
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);

    }
    public void sleepFor(int sec) throws InterruptedException{
        Thread.sleep(sec * 3000);
    }


}
