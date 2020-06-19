package automationPractise.StepDefs;

import automationPractise.Pages.HomePage;
import automationPractise.Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Homepagesteps {
    HomePage homepage = new HomePage();

    @Given("^I am on the homepage$")
    public void iAmOnHomePage() {
        Assert.assertTrue(homepage.isUseronHomepage());
    }

    @When("^I select SignIn link$")
    public void selectSignInLink() {
        Utils.waitForPageLoad();
        homepage.gotoAuthenticationPage();
        //driver.findElement(By.cssSelector(".login")).click();
        //test case is executing very fast, its not waiting for the web element to perform the action
        // we need to use web driver explicit wait
    }

}
