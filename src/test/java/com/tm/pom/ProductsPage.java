package com.tm.pom;

import com.tm.utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ProductsPage {
    WebDriver driver;
    CommonMethods methods = new CommonMethods();

    @FindBy(xpath = "//button[text()='Add to car']")
    List<WebElement> products;
    @FindBy(xpath = "//button[text()='Add to cart'][1]")
    WebElement addCartBtn;
    @FindBy(xpath = "//button[text()='Remove']")
    List<WebElement> removeProducts;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void main(String[] args) {
        values("test","testing","tester");
    }

    public static void values(String... value){
        for(String s:value)
        System.out.println(s);
    }

    public void selectProductandAddTothecart(int count) {
        methods.clickElement(addCartBtn);
    }

    public void removeAddedProducts() {
        for (WebElement ele: removeProducts) {
            Assert.assertEquals(ele.getText(), "Remov");
        }
    }

}
