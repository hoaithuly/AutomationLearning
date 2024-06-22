package page;

import org.openqa.selenium.By;

public class Create_User_Page {
    private By txtUserName = By.xpath("//input[@data-name='userName']");
    private By txtName = By.xpath("//div[@class='selectize-control form-control single plugin-espo_select']//input");
    private By txtFirstName = By.xpath("//input[@data-name='firstName']");
    private By txtLastName = By.xpath("//input[@data-name='lastName']");
    private By dropdownGender = By.xpath("//div[@data-name='gender' and @class='field']//div//div//div/following-sibling::input");
    private By dropdownRole = By.xpath("//input[@autocomplete='espo-roles']");
    private By txtPassword = By.xpath("//input[@data-name='password']");
    private By txtConfirmationPassword = By.xpath("//input[@data-name='passwordConfirm']");
    private By btnSave = By.xpath("//button[@data-action='save']");
    private By txtWarningMessage = By.xpath("//div[@class='popover-content']");
    private By txtUserNameBreadCrum=By.xpath("//div[@class='header-breadcrumbs']//div[3]//span");

    public By getTxtUserNameBreadCrum() {
        return txtUserNameBreadCrum;
    }

    public By getTxtWarningMessage() {
        return txtWarningMessage;
    }

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getDropdownGender() {
        return dropdownGender;
    }

    public By getDropdownRole() {
        return dropdownRole;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getTxtConfirmationPassword() {
        return txtConfirmationPassword;
    }

    public By getBtnSave() {
        return btnSave;
    }


}
