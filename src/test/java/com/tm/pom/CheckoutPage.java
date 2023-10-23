package com.tm.pom;

import com.tm.utils.CommonMethods;
import com.tm.utils.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver;
    CommonMethods methods=new CommonMethods();
    @FindBy(id="checkout")
    WebElement checkoutBtn;
    @FindBy(id="remove-sauce-labs-backpack") WebElement removeBtn;
    @FindBy(id="continue-shopping") WebElement continueShoppingBtn;
    @FindBy(id="first-name") WebElement fisrtNameTxt;
    @FindBy(id="last-name") WebElement lastNameTxt;
    @FindBy(id="postal-code") WebElement postalCodeTxt;
    @FindBy(id="continue") WebElement continueBtn;

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void CheckoutTheProduct(){
     methods.clickElement(checkoutBtn);
    }

    public void enterdetails(){
        methods.sendTextToElement(fisrtNameTxt, TestData.getData("FirstName"));
        methods.sendTextToElement(lastNameTxt, TestData.getData("LastName"));
        methods.sendTextToElement(postalCodeTxt, TestData.getData("ZipCode"));
        methods.clickElement(continueBtn);
    }

    public void selectProduct(){
        if(TestData.getData("Menu_Option").equals(fisrtNameTxt.getText())){
            fisrtNameTxt.click();
        }else if(TestData.getData("Category").equals(lastNameTxt.getText())){
            lastNameTxt.click();
        }
    }
}
