package test;

import common.Test_Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import page.Create_Account_Page;
import page.Login_Page;

public class Test_Case extends Test_Base {
    private String URL="http://localhost:8081/espocrm/";


    @BeforeMethod(description = "Open browser", alwaysRun = true)
    public void openBrowser() {
        intializeDriver();
        driver.navigate().to(URL);
    }

    @AfterMethod(description = "Close browser", alwaysRun = true)
    public void closeBrowser() {
        driver.close();
    }
}
