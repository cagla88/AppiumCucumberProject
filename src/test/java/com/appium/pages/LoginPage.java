package com.appium.pages;

import com.appium.utils.ConfigurationReader;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(String env) {
        super(env);
    }

    @AndroidFindBy(accessibility = "test-Username")
    public WebElement username;

    @AndroidFindBy(accessibility = "test-Password")
    public WebElement password;

    @AndroidFindBy(accessibility = "test-LOGIN")
    public WebElement loginButton;

    public void login() {

        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }

}
