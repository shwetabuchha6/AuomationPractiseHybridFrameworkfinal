package automationPractise.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AuthenticationPage extends BasePage {

    @FindBy(css = "#create-account_form")
    WebElement createAccountForm;
    @FindBy(css = "#login_form")
    WebElement signInPanel;
    @FindBy(css = "#email")
    WebElement SignInEmailField;

    @FindBy(css = "#passwd")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement loginButton;
    @FindBy(css="#SubmitCreate")
    WebElement submitCreateAccount;
    @FindBy(css="#create_account_error ol li")
    WebElement validationMessage;
    @FindBy(css="#email_create")
    WebElement enterEmailAddress;
    @FindBy(css = ".alert.alert-danger ol li")
    WebElement validationMessagesBlock;
    @FindBy(css="#authentication")
    WebElement isUserOnRegistrationPage;

    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isUserOnAuthenticationPage() {
        return createAccountForm.isDisplayed();
    }


    public boolean isSignInPanelShown() {
        return signInPanel.isDisplayed();

    }


    public void enterEmailAndPassword(String email, String password) {

        SignInEmailField.sendKeys(email);
        passwordField.sendKeys(password);
    }


        public void clickSignIn() {
            loginButton.click();

    }


    public void selectCreateAccount() {
        submitCreateAccount.click();
    }


    public void enterEmailAdress(String email) {
        enterEmailAddress.sendKeys(email);
    }


    public boolean verifyRegisterPage(){
  return isUserOnRegistrationPage.isDisplayed();
    }


    public void seeValidationMessage() {
       String error = validationMessage.getText();
      System.out.println(error);
    }


        public  String getErrorMessage() {
            return  validationMessagesBlock.getText();

    }
}


