package automationPractise.StepDefs;
import automationPractise.Pages.RegistrationForm;
import io.cucumber.java.en.And;

public class RegistrationFormSteps {
    RegistrationForm registrationpage = new RegistrationForm();
    //        x. Select the title
    @And("^I enter title as (.+)$")
    public void selectTitle(String title) {
        registrationpage.userSelectTheTitle(title);
        //WebElement abc = driver.findElement(By.cssSelector("#id_gender1"));
        // abc.sendKeys(title);ti
        // abc.click();

    }

    @And("^firstname as (.*) and lastname as (.*)$")
    public void firstnameAndlastname(String firstname, String lastname) {
        registrationpage.enterFirstname(firstname);
        registrationpage.enterLastname(lastname);
        //driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(firstname);
        //driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(lastname);
    }

    @And("^Password as (.*) and Address as (.*) and City as (.*) and State as (.*)$")
    public void passwordAddressAndCity(String password, String address, String city, String state) {
        registrationpage.enterPassword(password);
        registrationpage.enterAddress(address);
        registrationpage.enterCity(city);
        registrationpage.enterState(state);

    }
    @And("^DateOfBirth as (.*),(.*),(.*)$")
    public void dateofbirth_(String day, String month, String year) {
        registrationpage.enterDay(day);
        registrationpage.enterMonth(month);
        registrationpage.enterYear(year);
        //driver.findElement(By.cssSelector("#days")).sendKeys(day);
        //driver.findElement(By.cssSelector("#months")).sendKeys(month);
        //driver.findElement(By.cssSelector("#years")).sendKeys(year);
    }


    @And("^zipPostal Code as (.*) and mobile no as (.*)$")
    public void zipcodeandmobileno(String zipcode, String mobilenumber) {
        registrationpage.enterZipcode(zipcode);
        registrationpage.entermobilenumber(mobilenumber);
        //driver.findElement(By.cssSelector("#postcode")).sendKeys(zipcode);
        //driver.findElement(By.cssSelector("#phone_mobile")).sendKeys(mobilenumber);
    }

    @And("^Assign an Address alias for future reference as (.*)$")
    public void enterFutureReference(String reference) {
        registrationpage.enterReference(reference);
        //driver.findElement(By.cssSelector("#alias")).sendKeys(reference);
    }

    @And("^I select Register button$")
    public void clickRegistorButton() {
        registrationpage.clickRegisterButton();
        // driver.findElement(By.cssSelector("#submitAccount")).click();
    }

}
