package testScripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class TC_Lgn_001 extends BaseTest{

    ExtentReports extent;
    ExtentSparkReporter spark;


    @BeforeMethod
    public void report(){
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("index.html");
        spark.config().setReportName("Arvind");
        String os =  System.getProperty("os.name");
        spark.viewConfigurer().reporter().config().setReportName(os);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Automation Report");
        extent.attachReporter(spark);
    }
    //https://www.extentreports.com/docs/versions/5/java/index.html


    @Test
    public void TC_Lgn_001(){

        ExtentTest test = extent.createTest("TC_Lgn_001");
        LoginPage lp = new LoginPage(driver);
        lp.login("TC_Lgn_001");
        test.info("Page Title "+ driver.getTitle());
        DashboardPage dp = new DashboardPage(driver);
        dp.verifyDashboardTitle();
        test.info("Page Title "+ driver.getTitle());

    }

    @AfterMethod
    public void tearDown(){
        extent.flush();
    }
}
