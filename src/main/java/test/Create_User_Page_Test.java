package test;

import common.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.Create_User_Page;
import page.Login_Page;

import java.io.IOException;

public class Create_User_Page_Test extends Test_Case {
    public String URL = "http://localhost:8081/espocrm/#User/create";
    public ExcelUtils excelUtils = new ExcelUtils();

    @BeforeMethod(description = "Login Successfully")
    public void LogInSuccessfully() throws InterruptedException {
        Login_Page loginPage = new Login_Page();
        delayTillElementIsClickable(loginPage.getTxtUsername());
        fillInTextBox(loginPage.getTxtUsername(), "admin");
        fillInTextBox(loginPage.getTxtPassword(), "1");
        clickOnElement(loginPage.getBtnLogin());
        driver.navigate().to("http://localhost:8081/espocrm/#User/create");
        WebDelay();
    }

    @DataProvider(name = "User Data")
    public Object[][] userData() {
        String[][] userInfor = null;
        try {
            userInfor = excelUtils.getDataFromExcel("User_Information");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return userInfor;
    }

    @Test(description = "Create user successfully", dataProvider = "User Data")
    public void createUserSuccessfully(String userName, String salutation, String firstName, String lastName, String gender, String role, String password, String passwordConfirmation) throws InterruptedException {
        Create_User_Page cup = new Create_User_Page();
        fillInTextBox(cup.getTxtUserName(), userName);
        espoDropdownFillIn(cup.getTxtName(), salutation);
        fillInTextBox(cup.getTxtFirstName(), firstName);
        fillInTextBox(cup.getTxtLastName(), lastName);
        espoDropdownFillIn(cup.getDropdownGender(), gender);
        espoDropdownFillIn(cup.getDropdownRole(), role);
        fillInTextBox(cup.getTxtPassword(), password);
        fillInTextBox(cup.getTxtConfirmationPassword(), passwordConfirmation);
        clickOnElement(cup.getBtnSave());
        WebDelay();
        String actualResult=driver.findElement(cup.getTxtUserNameBreadCrum()).getText();
        String expectedResult=firstName+" "+lastName;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @DataProvider(name = "User Invalid Information")
    public Object[][] userInvalidInformation() {
        String[][] userInfor = null;
        try {
            userInfor = excelUtils.getDataFromExcel("User_Create_Fail");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return userInfor;
    }

    @Test(description = "Create user failed", dataProvider = "User Invalid Information")
    public void createUserFailed(String userName, String salutation, String firstName, String lastName, String gender, String role, String password, String passwordConfirmation, String warningMessage) {
        Create_User_Page cup = new Create_User_Page();
        fillInTextBox(cup.getTxtUserName(), userName);
        espoDropdownFillIn(cup.getTxtName(), salutation);
        fillInTextBox(cup.getTxtFirstName(), firstName);
        fillInTextBox(cup.getTxtLastName(), lastName);
        espoDropdownFillIn(cup.getDropdownGender(), gender);
        espoDropdownFillIn(cup.getDropdownRole(), role);
        fillInTextBox(cup.getTxtPassword(), password);
        fillInTextBox(cup.getTxtConfirmationPassword(), passwordConfirmation);
        clickOnElement(cup.getBtnSave());
        String actualResult=driver.findElement(cup.getTxtWarningMessage()).getText();
        Assert.assertEquals(actualResult,warningMessage);
    }
}
