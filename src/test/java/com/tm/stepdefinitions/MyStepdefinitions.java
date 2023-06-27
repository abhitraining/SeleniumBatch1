package com.tm.stepdefinitions;

import com.tm.drivermanager.DriverInit;
import com.tm.pom.LoginPage;
import com.tm.pom.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefinitions {

    @Given("^User is launch the application$")
    public void userIsLaunchTheApplication() {
        DriverInit.initDriver("Chrome");
    }

    @When("user login to the application with {string} and {string}")
    public void user_login_to_the_application_with_and(String userName, String password) {
        LoginPage loginPage=new LoginPage(DriverInit.getDriver());
        loginPage.logintoThePage(userName,password);
    }

    @When("^user login to the application$")
    public void userLoginToTheApplication() {
        LoginPage loginPage=new LoginPage(DriverInit.getDriver());
        loginPage.logintoThePage();
    }

    @When("^user selects the product and add to the card$")
    public void userSelectsTheProductAndAddToTheCard() {
        ProductsPage productsPage=new ProductsPage(DriverInit.getDriver());
        productsPage.selectProductandAddTothecart();
    }

    @Then("user is able to see products page")
    public void user_is_able_to_see_products_page()  {
        System.out.println("validated");
        DriverInit.closeDriver();
    }


}
