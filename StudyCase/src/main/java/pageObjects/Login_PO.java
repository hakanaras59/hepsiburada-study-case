package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO {


    private @FindBy(id = "myAccount")
    WebElement my_account;
    private @FindBy(id = "login")
    WebElement login;
    private @FindBy(id = "txtUserName")
    WebElement username_TextField;
    private @FindBy(id = "btnLogin")
    WebElement username_submitButton;
    private @FindBy(id = "txtPassword")
    WebElement password_TextField;
    private @FindBy(id = "btnEmailSelect")
    WebElement password_submitButton;

    public Login_PO() {
        super();
    }

    public void navigateTo_HepsiBurada_Login_Page() {
        navigateTo_URL(Global_Vars.HEPSI_BURADA_HOMEPAGE_URL);
    }

    public void moveOn_My_Account_Button() throws Exception {
        actionMove(my_account);
    }

    public void click_Login_Account() {
        waitForWebElementAndClick(login);
    }

    public void set_Username(String username) {
        sendKeys(username_TextField, username);
    }

    public void click_Submit_Button_After_User_Name() {
        waitForWebElementAndClick(username_submitButton);
    }

    public void click_Submit_Button_After_Password() {
        waitForWebElementAndClick(password_submitButton);
    }

    public void set_Password(String password) {
        sendKeys(password_TextField, password);
    }


}
