package com.tm.pom;

import com.tm.utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;
    CommonMethods methods= new CommonMethods();

    @FindBy(xpath="//div[text()='Sauce Labs Backpack']")
    WebElement product;
    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addCartBtn;

    public ProductsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void selectProductandAddTothecart(){
        methods.clickElement(product);
        methods.clickElement(addCartBtn);
    }
}
