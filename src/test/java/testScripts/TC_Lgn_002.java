package testScripts;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class TC_Lgn_002 extends BaseTest{


    @Test
    public void TC_Lgn_002(){

        LoginPage lp = new LoginPage(driver);
        lp.login("TC_Lgn_002");
        DashboardPage dp = new DashboardPage(driver);
        dp.verifyDashboardTitle();

    }
}
