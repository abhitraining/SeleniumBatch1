package com.tm.drivermanager;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class DriverInit {

   static ThreadLocal<WebDriver>driver=new ThreadLocal<>();

    public static void initDriver(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver.set(new ChromeDriver(options));
        driver.get().get(url);
        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void main(String[] args) {
        initDriver("https://www.google.com");
        String script = "return window.getComputedStyle(document.querySelector('.okButton'),':after').getPropertyValue('content')";
    }
    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver() {
        driver.get().close();
    }
}
