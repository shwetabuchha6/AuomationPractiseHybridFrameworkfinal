package automationPractise.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends BasePage {
@FindBy(css="#id_gender1")
    WebElement selectTitle;

@FindBy(css="#customer_firstname")
    WebElement selectFirstname;
@FindBy(css="#customer_lastname")
    WebElement selectLastname;
@FindBy(css="#passwd")
    WebElement selectPassword;
@FindBy(css="#address1")
    WebElement selectAddress;
@FindBy(css="#city")
    WebElement selectCity;
@FindBy(css="#id_state")
    WebElement selectState;
@FindBy(css="#days")
    WebElement selectDate;
@FindBy(css="#months")
    WebElement selectMonth;
@FindBy(css="#years")
    WebElement selectyear;
@FindBy(css="#postcode")
    WebElement selectPostcode;
@FindBy(css="#phone_mobile")
    WebElement selectMobile;
@FindBy(css="#alias")
    WebElement selectReference;
@FindBy(css="#submitAccount")
    WebElement selectSubmitbutton;
//driver.findElement(By.cssSelector("#submitAccount")).click();

public RegistrationForm() {
        PageFactory.initElements(driver,this);
        }
public void userSelectTheTitle(String title) {
        selectTitle.sendKeys(title);
        selectTitle.click();
        }


public void enterFirstname(String firstname) {
        selectFirstname.sendKeys(firstname);
        }

public void enterLastname(String lastname) {
        selectLastname.sendKeys(lastname);
        }

public void enterPassword(String password) {
        selectPassword.sendKeys(password);

        }

public void enterAddress(String address) {
        selectAddress.sendKeys(address);
        }

public void enterCity(String city) {
        selectCity.sendKeys(city);
        }

public void enterState(String state) {
        selectState.sendKeys(state);
        }

public void enterDay(String day) {
        selectDate.sendKeys(day);
        }

public void enterMonth(String month) {
        selectMonth.sendKeys(month);
        }

public void enterYear(String year) {
        selectyear.sendKeys(year);
        }

public void enterZipcode(String zipcode) {
        selectPostcode.sendKeys(zipcode);
        }

public void entermobilenumber(String mobilenumber) {
        selectMobile.sendKeys(mobilenumber);
        }

public void enterReference(String reference) {
        selectReference.sendKeys(reference);
        }

public void clickRegisterButton() {
        selectSubmitbutton.click();
        }
        }





