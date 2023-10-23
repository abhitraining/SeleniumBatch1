package com.tm.testng;

import com.tm.drivermanager.DriverInit;
import com.tm.pom.LoginPage;
import com.tm.pom.ProductsPage;
import org.testng.annotations.Test;

public class Class2 extends TestNgMethods{

    @Test(groups = {"sanity","Class2"})
    public void selectProductAndAddToTheCart(){
        ProductsPage productsPage=new ProductsPage(DriverInit.getDriver());
        productsPage.selectProductandAddTothecart(2);
    }
}
