package automationPractise.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(css="#home-page-tabs")
    WebElement homepageTabs;

    @FindBy(css=".login")
    WebElement signInLink;

    public HomePage(){

        PageFactory.initElements(driver,this);
    }
public boolean  isUseronHomepage()
{
    return homepageTabs.isDisplayed();
}

  public void gotoAuthenticationPage(){


      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      signInLink.click();

  }
}
