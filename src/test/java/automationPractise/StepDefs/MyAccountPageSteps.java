package automationPractise.StepDefs;


import automationPractise.Pages.MyAccountPage;
import automationPractise.Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyAccountPageSteps{
    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("^I Should be loggedIn successfully$")
    public void LoogedInSuccessful() {
        Assert.assertEquals("My account-My Store", Utils.getPageTitle());

    }


    @And("^I should be on MyAccount page$")
    public void accountPage() {

        Assert.assertTrue(myAccountPage.isUserOnMyAccountPage());
    }
}
