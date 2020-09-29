package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'identifierId')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[@id='identifierNext']/div/button/div[2]")
    private WebElement loginButton;
    @FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id='passwordNext']/div/button/div[2]")
    private WebElement passwordButton;


    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }


    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    //    @Step("Ввод логина {login}")
    public void clickLoginButton() {
        loginButton.click();
    }

    //    @Step("Ввод пароля {password}")
    public void clickPasswordButton() {
        passwordButton.click();
    }
}