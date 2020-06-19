package automationPractise.StepDefs;

import automationPractise.Pages.BasePage;
import io.cucumber.java.Before;
import org.junit.After;

import java.net.MalformedURLException;

public class Hooks extends BasePage {

    @Before
    public void startBrowser() throws MalformedURLException {
        openBrowser(browserName, baseUrl);
    }

    @After
    public void stopBrowser() {
       closeBrowser();
   }
}


