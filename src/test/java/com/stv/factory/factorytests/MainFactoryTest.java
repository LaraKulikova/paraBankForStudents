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

    @Test (description = "Test error message when Username is empty and Password is entered")
    public void testErrorMessageWhenUsernameIsEmpty() {
        String username = "";//если оставить поле пустым 1 задание, если внести любое имя - 2
        String password = "123456";
        mainFactoryPage.clickOnAdminLogo(); // Navigate to Admin login page
        // Enter Password without entering Username
        mainFactoryPage.enterUsername(username); // Leave Username field empty
        mainFactoryPage.enterPassword(password);
        mainFactoryPage.clickOnLoginButton();
        // Verify error message is displayed
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(), "Error message is not displayed");
}}
