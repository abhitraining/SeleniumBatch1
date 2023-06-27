package com.tm.pom;

import com.tm.utils.CommonMethods;
import com.tm.utils.ProjectConfig;
import com.tm.utils.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    WebDriver driver;
    @FindBy(id="user-name") WebElement usernameTxt;
    @FindBy(id="password") WebElement passwordTxt;
    @FindBy(xpath="//input[@type='radio']")
    List<WebElement> passwordsTxt;
    @FindBy(id="login-button") WebElement loginBtn;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    CommonMethods commonMethods=new CommonMethods();

    public void logintoThePage(){
        commonMethods.sendTextToElement(usernameTxt, ProjectConfig.getProperty("userName"));
        commonMethods.sendTextToElement(passwordTxt, ProjectConfig.getProperty("password"));
        commonMethods.clickElement(loginBtn);
    }

    public void logintoThePage(String userName,String password){
        if(userName.equals("performance_glitch_user")){
            Assert.fail();
        }else {
            commonMethods.sendTextToElement(usernameTxt, userName);
            commonMethods.sendTextToElement(passwordTxt, password);
            commonMethods.clickElement(loginBtn);
        }
    }
}
