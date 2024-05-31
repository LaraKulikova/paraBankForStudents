package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "img.admin")
    private WebElement adminLogo;

    @FindBy(css = "img[alt='ParaBank']")
    private WebElement parabankLogo;

    @FindBy(xpath = "//h1[contains(text(),'Administration')]")
    private WebElement adminRightPanel;

    /*МОИ ПЕРЕМЕННЫЕ*/

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement filedUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[@class='error']")
    public WebElement ErrorMessageText;

    
    
    public WebElement getAdminLogo() {
        return adminLogo;
    }


    public void clickOnAdminLogo() {
        adminLogo.click();
    }


    public boolean isMainLogoDisplayed() {
        return parabankLogo.isDisplayed();
    }

    public boolean isAdminPanelDisplayed() {
        return adminRightPanel.isDisplayed();
    }


    /*МОИ МЕТОДЫ*/
    public void enterUsername(String username) {
        filedUsername.sendKeys(username) ;
    }

    public void enterPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }


    public boolean isErrorMessageDisplayed() {
        return ErrorMessageText.isDisplayed();
    }


    }

