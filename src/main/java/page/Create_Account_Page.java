package page;

import org.openqa.selenium.By;

public class Create_Account_Page {
    private By menuAccount=By.xpath("//a[@href='#Account']");
    private By btnCreateAccount= By.xpath("//div[@class='header-buttons btn-group pull-right']");
    private By txtName=By.xpath("//input[@data-name='name']");
    private By txtWebsite=By.xpath("//input[@data-name='website']");
    private By txtEmail=By.xpath("//input[@type='email']");
    private By btnAddEmail=By.xpath("//button[@data-action='addEmailAddress']");
    private By btnDeleteEmail=By.xpath("//div[@class='input-group email-address-block'][2]//button[@data-action='removeEmailAddress']");
    //private By dropdownPhoneNumber=By.xpath("//div[@class='input-group phone-number-block']//div[contains(@class,'selectize-dropdown')]");
    private By txtTypePhoneNumber=By.xpath("//div[@data-value='Office']/following-sibling::input");
    private By txtPhoneNumber=By.xpath("//input[@class='form-control phone-number no-margin-shifting']");
    private By btnAddPhoneNumber= By.xpath("//button[@data-action='addPhoneNumber']");
    private By btnDeletePhoneNumber=By.xpath("//button[@data-action='removePhoneNumber']");
    private By txtBillingAddressStreet=By.xpath("//div[@data-name='billingAddress']//textarea[@placeholder='Street']");
    private By txtShippingAddressStreet=By.xpath("//div[@data-name='shippingAddress']//textarea[@placeholder='Street']");
    private By txtBillingAddressCity=By.xpath("//input[@data-name='billingAddressCity']");
    private By txtBillingAddressState=By.xpath("//input[@data-name='billingAddressState']");
    private By txtBillingAddressPostalCode=By.xpath("//input[@data-name='billingAddressPostalCode']");
    private By txtBillingAddressCountry= By.xpath("//input[@data-name='billingAddressCountry']");
    private By txtShippingAddressCity=By.xpath("//input[@data-name='shippingAddressCity']");
    private By txtShippingAddressState=By.xpath("//input[@data-name='shippingAddressState']");
    private By txtShippingAddressPostalCode=By.xpath("//input[@data-name='shippingAddressPostalCode']");
    private By txtShippingAddressCountry= By.xpath("//input[@data-name='shippingAddressCountry']");
    private By dropdownType=By.xpath("//div[@data-name='type']//input");
    private By dropdownIndustry=By.xpath("//div[@data-name='industry']//input");
    private By txtDescription=By.xpath("//textarea[@data-name='description']");
    private By btnSave=By.xpath("//button[@data-name='save']");
    private By btnCancel=By.xpath("//button[@data-name='cancel']");
    private By lbPopoverContent=By.xpath("//div[@class='popover-content']//p");
    private By lbAccountNameBreadCrum=By.xpath("//div[@class='breadcrumb-item'][2]//span");
    private By modalExistingInformation=By.xpath("//div[@class='modal-content']");
    private By txtAccountNameModal=By.xpath("//div[@class='modal-content']//tbody//td//a");
    private By btnSaveModal=By.xpath("//div[@class='modal-content']//button[@data-name='save']");
    private By btnCancelModal=By.xpath("//div[@class='modal-content']//button[@data-name='cancel']");
    public By getLbAccountNameBreadCrum() {
        return lbAccountNameBreadCrum;
    }

    public By getModalExistingInformation() {
        return modalExistingInformation;
    }

    public By getTxtAccountNameModal() {
        return txtAccountNameModal;
    }

    public By getBtnSaveModal() {
        return btnSaveModal;
    }

    public By getBtnCancelModal() {
        return btnCancelModal;
    }

    public By getMenuAccount() {
        return menuAccount;
    }

    public void setMenuAccount(By menuAccount) {
        this.menuAccount = menuAccount;
    }

    public By getBtnCreateAccount() {
        return btnCreateAccount;
    }

    public void setBtnCreateAccount(By btnCreateAccount) {
        this.btnCreateAccount = btnCreateAccount;
    }

    public By getTxtName() {
        return txtName;
    }

    public void setTxtName(By txtName) {
        this.txtName = txtName;
    }

    public By getTxtWebsite() {
        return txtWebsite;
    }

    public void setTxtWebsite(By txtWebsite) {
        this.txtWebsite = txtWebsite;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(By txtEmail) {
        this.txtEmail = txtEmail;
    }

    public By getBtnAddEmail() {
        return btnAddEmail;
    }

    public void setBtnAddEmail(By btnAddEmail) {
        this.btnAddEmail = btnAddEmail;
    }

    public By getBtnDeleteEmail() {
        return btnDeleteEmail;
    }

    public void setBtnDeleteEmail(By btnDeleteEmail) {
        this.btnDeleteEmail = btnDeleteEmail;
    }

//    public By getDropdownPhoneNumber() {
//        return dropdownPhoneNumber;
//    }
//
//    public void setDropdownPhoneNumber(By dropdownPhoneNumber) {
//        this.dropdownPhoneNumber = dropdownPhoneNumber;
//    }

    public By getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    public void setTxtPhoneNumber(By txtPhoneNumber) {
        this.txtPhoneNumber = txtPhoneNumber;
    }
    public By getBtnAddPhoneNumber() {
        return btnAddPhoneNumber;
    }

    public void setBtnAddPhoneNumber(By btnAddPhoneNumber) {
        this.btnAddPhoneNumber = btnAddPhoneNumber;
    }
    public By getBtnDeletePhoneNumber() {
        return btnDeletePhoneNumber;
    }

    public void setBtnDeletePhoneNumber(By btnDeletePhoneNumber) {
        this.btnDeletePhoneNumber = btnDeletePhoneNumber;
    }

    public By getTxtBillingAddressStreet() {
        return txtBillingAddressStreet;
    }

    public void setTxtBillingAddressStreet(By txtBillingAddressStreet) {
        this.txtBillingAddressStreet = txtBillingAddressStreet;
    }

    public By getTxtShippingAddressStreet() {
        return txtShippingAddressStreet;
    }

    public void setTxtShippingAddressStreet(By txtShippingAddressStreet) {
        this.txtShippingAddressStreet = txtShippingAddressStreet;
    }

    public By getTxtBillingAddressCity() {
        return txtBillingAddressCity;
    }

    public void setTxtBillingAddressCity(By txtBillingAddressCity) {
        this.txtBillingAddressCity = txtBillingAddressCity;
    }

    public By getTxtBillingAddressState() {
        return txtBillingAddressState;
    }

    public void setTxtBillingAddressState(By txtBillingAddressState) {
        this.txtBillingAddressState = txtBillingAddressState;
    }

    public By getTxtBillingAddressPostalCode() {
        return txtBillingAddressPostalCode;
    }

    public void setTxtBillingAddressPostalCode(By txtBillingAddressPostalCode) {
        this.txtBillingAddressPostalCode = txtBillingAddressPostalCode;
    }

    public By getTxtBillingAddressCountry() {
        return txtBillingAddressCountry;
    }

    public void setTxtBillingAddressCountry(By txtBillingAddressCountry) {
        this.txtBillingAddressCountry = txtBillingAddressCountry;
    }

    public By getTxtShippingAddressCity() {
        return txtShippingAddressCity;
    }

    public void setTxtShippingAddressCity(By txtShippingAddressCity) {
        this.txtShippingAddressCity = txtShippingAddressCity;
    }

    public By getTxtShippingAddressState() {
        return txtShippingAddressState;
    }

    public void setTxtShippingAddressState(By txtShippingAddressState) {
        this.txtShippingAddressState = txtShippingAddressState;
    }

    public By getTxtShippingAddressPostalCode() {
        return txtShippingAddressPostalCode;
    }

    public void setTxtShippingAddressPostalCode(By txtShippingAddressPostalCode) {
        this.txtShippingAddressPostalCode = txtShippingAddressPostalCode;
    }

    public By getTxtShippingAddressCountry() {
        return txtShippingAddressCountry;
    }

    public void setTxtShippingAddressCountry(By txtShippingAddressCountry) {
        this.txtShippingAddressCountry = txtShippingAddressCountry;
    }

    public By getDropdownType() {
        return dropdownType;
    }

    public void setDropdownType(By dropdownType) {
        this.dropdownType = dropdownType;
    }

    public By getDropdownIndustry() {
        return dropdownIndustry;
    }

    public void setDropdownIndustry(By dropdownIndustry) {
        this.dropdownIndustry = dropdownIndustry;
    }

    public By getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(By txtDescription) {
        this.txtDescription = txtDescription;
    }

    public By getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(By btnSave) {
        this.btnSave = btnSave;
    }

    public By getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(By btnCancel) {
        this.btnCancel = btnCancel;
    }

    public By getLbPopoverContent() {
        return lbPopoverContent;
    }

    public void setLbNameIsRequired(By lbPopoverContent) {
        this.lbPopoverContent = lbPopoverContent;
    }


    public By getTxtTypePhoneNumber() {
        return txtTypePhoneNumber;
    }

    public void setTxtTypePhoneNumber(By txtTypePhoneNumber) {
        this.txtTypePhoneNumber = txtTypePhoneNumber;
    }

}
