package com.appium.step_definitions;

import com.appium.pages.LoginPage;
import com.appium.pages.ProductPage;
import com.appium.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductTestSteps {

    LoginPage loginPage;
    ProductPage productPage;

    @When("user login to mobile app with {string} setup")
    public void user_login_to_mobile_app_with_setup(String env) {

        loginPage = new LoginPage(env);
        productPage = new ProductPage(env);

        loginPage.username.sendKeys("standard_user");
        loginPage.password.sendKeys("secret_sauce");
        loginPage.loginButton.click();

    }
    @When("add first product to cart")
    public void add_first_product_to_cart() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver("local-sauceApp"), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productPage.firstProduct));

        productPage.firstProduct.click();


    }
    @Then("verify product is added")
    public void verify_product_is_added() {

        Assertions.assertEquals("REMOVE", productPage.removeElement.getText());

        Assertions.assertEquals("1", productPage.numberOfProducts.getText());

    }
}
