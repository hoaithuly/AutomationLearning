package page;

import common.Test_Base;
import org.openqa.selenium.By;

public class Login_Page extends Test_Base {
private By txtUsername=By.xpath("//input[@id='field-userName']");
    private By txtPassword=By.id("field-password");
    private By btnLogin = By.id("btn-login");
    private By logo=By.xpath("//img[@class='logo']");

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getLogo() {
        return logo;
    }


}
