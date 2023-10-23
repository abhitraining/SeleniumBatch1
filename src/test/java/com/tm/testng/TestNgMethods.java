package com.tm.testng;

import com.tm.drivermanager.DriverInit;
import com.tm.pom.LoginPage;
import com.tm.utils.ProjectConfig;
import org.testng.annotations.*;

import java.sql.Driver;

public class TestNgMethods {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        DriverInit.initDriver(ProjectConfig.getProperty("url"));
        LoginPage login = new LoginPage(DriverInit.getDriver());
        login.logintoThePage();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        DriverInit.closeDriver();
    }

}
