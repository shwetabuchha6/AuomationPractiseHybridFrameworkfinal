package automationPractise.StepDefs;

import automationPractise.Pages.AuthenticationPage;
import automationPractise.Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthenticationPageSteps {
    AuthenticationPage authenticationPage = new AuthenticationPage();

    @Then("^I should be on the authentication page$")
    public void verifyAuthenticationPage() {
        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
    }

    @Then("^I should see SignUp panel$")
    public void verifySingUpPanel() {
        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
        //Assert.assertTrue(driver.findElement(By.cssSelector("#center_column")).isDisplayed());

    }

    @And("I should see SignIn panel")
    public void iShouldSeeSignInPanel() {
       // WebElement accountLinks = driver.findElement(By.cssSelector(".myaccount-link-list"));
        Assert.assertTrue(authenticationPage.isSignInPanelShown());
    }


    @When("^I Enter EmailId as (.*)$")
    public void enterEmailaddress(String email) {
        authenticationPage.enterEmailAdress(email);

    }


    @And("^I see validation message as (.*) I should not loggedIn$")
    public void iSeeValidationMessageAsMessageIShouldNotLoggedIn(String message ) {
        //System.out.println("Actual message : " + message);
       // String error = driver.findElement(By.cssSelector(".alert.alert-danger ol li")).getText();
        //Assert.assertEquals(message, error);
        //System.out.println("Expected message : " + error);
        //Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger ol li")).isDisplayed());
        Assert.assertEquals(message, authenticationPage.getErrorMessage());
    }
    @And("^I should see validation message $")
    public void emailId() {
       // String errorMessages = driver.findElement(By.cssSelector("#create_account_error ol li")).getText();
      //  System.out.println(errorMessages);
       authenticationPage.seeValidationMessage();
    }
    @And("^I should see validation message as (.*)$")
    public void iShouldSeeValidationMessageAs(String message) {
        //System.out.println(message);
        Assert.assertEquals(message, authenticationPage.getErrorMessage());

    }
    @Then("^I Should be on the Registration page$")
    public void verifyRegisterPage() {

        Assert.assertTrue(authenticationPage.verifyRegisterPage());
        Utils.waitForPageLoad();
    }

    @When("^I enter username as (.*), password as(.*)")
    public void enterEmailAndPassword(String email, String password) {
        authenticationPage.enterEmailAndPassword(email,password);

    }

    @And("^I click SignIn$")
    public void iClickSignIn() {
        authenticationPage.clickSignIn();

    }
    @Then("^I should not be loggedIn$")
    public void iShouldNotBeLoggedIn()
    {

        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
    }

    @And("I click Create An Account Button")
    public void iClickCreateAnAccountButton() {

        authenticationPage.selectCreateAccount();

    }



    }








