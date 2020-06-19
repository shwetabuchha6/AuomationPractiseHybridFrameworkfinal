package automationPractise.Utils;

import automationPractise.Pages.BasePage;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void waitForPageLoad() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static String getPageTitle() {
        return driver.getTitle();
        //Whenever u need to check the user is on my account page u can call the method
}}
