package test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.Create_Account_Page;
import page.Login_Page;
import java.time.Duration;
import java.util.List;


public class Create_Account_Page_Test extends Test_Case{
    private String URL="http://localhost:8081/espocrm/";
    private String name="Taylor Swift";
    private String website="taylorswift.com";
    private String email1="taylorswift13@gmail.com";
    private String email2="taylornation@gmail.com";
    private String phoneType="Mobile";
    private String phoneNumber01="9179096202";
    private String phoneNumber02="9102098120";
    private String billingAddressStreet="Cornellia";
    private String billingAddressCity="New York";
    private String billingAddressState="New York";
    private String billingAddressPostalCode="13131313";
    private String billingAddressCountry="The United States Of America";
    private String shippingAddressStreet="Stanford";
    private String shippingAddressCity="Washington DC";
    private String shippingAddressState="Washington DC";
    private String shippingAddressPostalCode="89898989";
    private String shippingAddressCountry="The United States Of America";
    private String typeValue="Customer";
    private String industryType="Music";
    private String description="A Billionaire";
private Create_Account_Page cap=new Create_Account_Page();

    @BeforeMethod(description="Login Successfully")
    public void LogInSuccessfully(){
        driver.navigate().to(URL);
        Login_Page loginPage= new Login_Page();
        delayTillElementIsClickable(loginPage.getTxtUsername());
        fillInTextBox(loginPage.getTxtUsername(),"admin");
        fillInTextBox(loginPage.getTxtPassword(),"1");
        clickOnElement(loginPage.getBtnLogin());
        delayTillElementIsPresent(cap.getMenuAccount());
        clickOnElement(cap.getMenuAccount());
        delayTillElementIsPresent(cap.getBtnCreateAccount());
        clickOnElement(cap.getBtnCreateAccount());
        delayTillElementIsPresent(cap.getBtnSave());
    }

    @Test (description = "Create Account Successfully", priority = 0)
    public void CreateAccountSuccessfully() throws InterruptedException {
        delayTillElementIsPresent(cap.getMenuAccount());
        clickOnElement(cap.getMenuAccount());
        delayTillElementIsPresent(cap.getBtnCreateAccount());
        clickOnElement(cap.getBtnCreateAccount());
        delayTillElementIsPresent(cap.getBtnSave());
fillInTextBox(cap.getTxtName(),name);
fillInTextBox(cap.getTxtWebsite(),website);
fillInTextBox(cap.getTxtEmail(),email1);
clickOnElement(cap.getBtnAddEmail());
List<WebElement> element= driver.findElements(cap.getTxtEmail());
element.get(1).sendKeys(email2);
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
espoDropdownFillIn(cap.getTxtTypePhoneNumber(),phoneType);
fillInTextBox(cap.getTxtPhoneNumber(),phoneNumber01);
clickOnElement(cap.getBtnAddPhoneNumber());
List<WebElement> elementPhoneNumber= driver.findElements(cap.getTxtPhoneNumber());
elementPhoneNumber.get(1).sendKeys(phoneNumber02);
fillInTextBox(cap.getTxtBillingAddressStreet(), billingAddressStreet);
fillInTextBox(cap.getTxtBillingAddressCity(), billingAddressCity);
fillInTextBox(cap.getTxtBillingAddressState(), billingAddressState);
fillInTextBox(cap.getTxtBillingAddressPostalCode(), billingAddressPostalCode);
fillInTextBox(cap.getTxtBillingAddressCountry(), billingAddressCountry);
fillInTextBox(cap.getTxtShippingAddressStreet(), shippingAddressStreet);
fillInTextBox(cap.getTxtShippingAddressCity(), shippingAddressCity);
fillInTextBox(cap.getTxtShippingAddressState(), shippingAddressState);
fillInTextBox(cap.getTxtShippingAddressPostalCode(), shippingAddressPostalCode);
fillInTextBox(cap.getTxtShippingAddressCountry(), shippingAddressCountry);
espoDropdownFillIn(cap.getDropdownType(), typeValue);
espoDropdownFillIn(cap.getDropdownIndustry(), industryType);
fillInTextBox(cap.getTxtDescription(),description);
clickOnElement(cap.getBtnSave());
WebDelay();
        String actualResult=driver.findElement(cap.getLbAccountNameBreadCrum()).getText();
Assert.assertEquals(actualResult, name);
    }

    @Test (description = "Create Account Without Filling Required Field", priority = 1)
    public void CreateAccountFailedWithoutFillingRequiredField() throws InterruptedException {
        fillInTextBox(cap.getTxtWebsite(),website);
        fillInTextBox(cap.getTxtEmail(),email1);
        clickOnElement(cap.getBtnAddEmail());
        List<WebElement> element= driver.findElements(cap.getTxtEmail());
        element.get(1).sendKeys(email2);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        espoDropdownFillIn(cap.getTxtTypePhoneNumber(),phoneType);
        fillInTextBox(cap.getTxtPhoneNumber(),phoneNumber01);
        clickOnElement(cap.getBtnAddPhoneNumber());
        List<WebElement> elementPhoneNumber= driver.findElements(cap.getTxtPhoneNumber());
        elementPhoneNumber.get(1).sendKeys(phoneNumber02);
        fillInTextBox(cap.getTxtBillingAddressStreet(), billingAddressStreet);
        fillInTextBox(cap.getTxtBillingAddressCity(), billingAddressCity);
        fillInTextBox(cap.getTxtBillingAddressState(), billingAddressState);
        fillInTextBox(cap.getTxtBillingAddressPostalCode(), billingAddressPostalCode);
        fillInTextBox(cap.getTxtBillingAddressCountry(), billingAddressCountry);
        fillInTextBox(cap.getTxtShippingAddressStreet(), shippingAddressStreet);
        fillInTextBox(cap.getTxtShippingAddressCity(), shippingAddressCity);
        fillInTextBox(cap.getTxtShippingAddressState(), shippingAddressState);
        fillInTextBox(cap.getTxtShippingAddressPostalCode(), shippingAddressPostalCode);
        fillInTextBox(cap.getTxtShippingAddressCountry(), shippingAddressCountry);
        espoDropdownFillIn(cap.getDropdownType(), typeValue);
        espoDropdownFillIn(cap.getDropdownIndustry(), industryType);
        fillInTextBox(cap.getTxtDescription(),description);
        clickOnElement(cap.getBtnSave());
        delayTillElementIsPresent(cap.getLbPopoverContent());
        String actualResult=driver.findElement(cap.getLbPopoverContent()).getText();
        Assert.assertEquals(actualResult, "Name is required");
    }

    @DataProvider(name = "Invalid Email")
    public Object[][] invalidEmail(){
        Object[][] invalidEmail={{"abc"},{"abc.com"},{"abc@gmail."}};
        return invalidEmail;
    }
    @Test (description = "Create Account With Invalid Email Address", priority = 2, dataProvider = "Invalid Email")
    public void CreateAccountFailedWithInvalidEmailAddress(String email) {
        fillInTextBox(cap.getTxtName(),name);
        fillInTextBox(cap.getTxtEmail(),email);
        clickOnElement(cap.getBtnSave());
        delayTillElementIsPresent(cap.getLbPopoverContent());
        String actualResult=driver.findElement(cap.getLbPopoverContent()).getText();
        Assert.assertEquals(actualResult, "Email should be a valid email");
    }

    @Test (description = "Create Account Failed By Clicking Cancel", priority = 3)
    public void CreateAccountFailedByClickingCancel() throws InterruptedException {
        fillInTextBox(cap.getTxtName(),name);
        fillInTextBox(cap.getTxtEmail(),email1);
        clickOnElement(cap.getBtnCancel());
        WebDelay();
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:8081/espocrm/#Account");
    }

    @Test (description = "Create Account Failed With Existing Information", priority = 4)
    public void CreateAccountFailedWithExistingInformation() throws InterruptedException {
        fillInTextBox(cap.getTxtName(),name);
        fillInTextBox(cap.getTxtEmail(),email1);
        clickOnElement(cap.getBtnSave());
        WebDelay();
       Assert.assertEquals(driver.findElement(cap.getTxtAccountNameModal()).getText(), name);
       clickOnElement(cap.getBtnCancelModal());
       List<WebElement> modal=driver.findElements(cap.getModalExistingInformation());
       Assert.assertEquals(modal.size(),0);
    }

    @Test (description = "Create Account Successfully With Existing Information", priority = 5)
    public void CreateAccountSuccessfullyWithExistingInformation() throws InterruptedException {
        fillInTextBox(cap.getTxtName(),name);
        fillInTextBox(cap.getTxtEmail(),email1);
        clickOnElement(cap.getBtnSave());
        WebDelay();
        clickOnElement(cap.getBtnSaveModal());
        WebDelay();
        String actualResult=driver.findElement(cap.getLbAccountNameBreadCrum()).getText();
        Assert.assertEquals(actualResult, name);
    }

}
