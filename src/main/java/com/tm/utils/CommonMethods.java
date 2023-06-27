package com.tm.utils;

import com.tm.drivermanager.DriverInit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.Set;

public class CommonMethods {

    DriverInit driver = new DriverInit();

    public void sendTextToElement(WebElement ele, String value) {
        try {
            ele.sendKeys(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickElement(WebElement ele) {
        try {
            ele.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectValueFromdropdown(WebElement ele, String value) {
        try {
            Select sel = new Select(ele);
            sel.selectByVisibleText(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectValueFromdropdownWithoutSelect(List<WebElement> ele, String value) {
        for (WebElement index : ele) {
            if (index.getText().equals(value)) {
                index.click();
            }
        }
    }

    public void switchToFrame(WebElement ele) {
        driver.getDriver().switchTo().frame(ele);
    }

    public void switchToDefault() {
        driver.getDriver().switchTo().defaultContent();
    }

    public void switchToWindow() {
        String activeWindow = driver.getDriver().getWindowHandle();
        Set<String> allOpenWindows = driver.getDriver().getWindowHandles();
        for (String childWindow : allOpenWindows) {
            if (!childWindow.equals(activeWindow)) {
                driver.getDriver().switchTo().window(childWindow);
            }
        }
    }

    public void refreshThePage() {
        driver.getDriver().navigate().refresh();
    }

    public void takeScreenShot() {
        try {
            File file = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "//ScreenShots"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
