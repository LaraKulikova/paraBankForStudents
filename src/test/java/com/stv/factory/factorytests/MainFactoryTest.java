package com.stv.factory.factorytests;


import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.stv.framework.core.utils.Waiters.waitForElementVisible;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    @Test (description = "Assert the main page is loaded and main logl is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
        Assert.assertEquals(actualResult, true, "Main Logo isn't visible");
    }
/*МОЙ ТЕСТ*/
    @Test (description = "Test error message when Username is empty and Password is entered")
    public void testErrorMessageWhenUsernameIsEmpty() {
        String username = "";
        String password = "123456";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.enterUsername(username);
        mainFactoryPage.enterPassword(password);
        mainFactoryPage.clickOnLoginButton();
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(), "Error! Please enter a username and password.");
    }

    @Test (description = "An attempt to log in by an unregistered user!")
    public void notRegisteredUsetEnterError() {
        String username = "Larisa";
        String password = "123456";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.enterUsername(username);
        mainFactoryPage.enterPassword(password);
        mainFactoryPage.clickOnLoginButton();
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(), "Error! The username and password could not be verified.");
    }

}
