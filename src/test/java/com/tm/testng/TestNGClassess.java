package com.tm.testng;

import com.tm.drivermanager.DriverInit;
import com.tm.pom.LoginPage;
import com.tm.pom.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGClassess extends TestNgMethods {



    @Test(groups = {"sanity", "regression", "selectProduct_2"} )
    public void selectSingleProductAndAddToTheCart() {
        ProductsPage productsPage = new ProductsPage(DriverInit.getDriver());
        productsPage.selectProductandAddTothecart(2);
       // productsPage.removeAddedProducts();
    }

    @Test(groups = {"sanity", "regression", "removeProduct"})
    public void selectSingleProductAndAddToTheCart2() {
        ProductsPage productsPage = new ProductsPage(DriverInit.getDriver());
        productsPage.removeAddedProducts();
    }

    @Parameters("product")
    @Test(groups = {"sanity", "regression", "selectProduct"})
    public void selectSingleProductAndAddToTheCart23(String product) {
        ProductsPage productsPage = new ProductsPage(DriverInit.getDriver());
        productsPage.selectProductandAddTothecart(2);
    }

   /* @Test(groups = {"sanity", "regression", "login"}, dataProvider = "login")
    public void loginFunctionality(String userName, String password) {
        LoginPage login = new LoginPage(DriverInit.getDriver());
        login.logintoThePage(userName, password);
        String expectedvalue = DriverInit.getDriver().findElement(By.id("item_4_title_link")).getText();
        Assert.assertEquals(expectedvalue, "Sauce Labs Backpa");
    }*/

    @DataProvider(name = "login")
    public Object[][] loginDetails() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
        };
    }
}
