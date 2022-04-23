package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected WebDriver driver;

    @BeforeClass
    public void setup(){
         ChromeOptions ops = new ChromeOptions();
         ops.setAcceptInsecureCerts(true);
         WebDriverManager.chromedriver().setup();
         driver  = new ChromeDriver(ops);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }


    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
