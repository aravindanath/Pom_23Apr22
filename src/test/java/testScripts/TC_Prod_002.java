package testScripts;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class TC_Prod_002 extends BaseTest{


    @Test
    public void TC_Lgn_001(){

        LoginPage lp = new LoginPage(driver);
        lp.login("TC_Lgn_001");
        DashboardPage dp = new DashboardPage(driver);
        dp.verifyDashboardTitle();
        dp.navigateToProduct();
        dp.verifyProductNames();

    }
}
