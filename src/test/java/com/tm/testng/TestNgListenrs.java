package com.tm.testng;

import com.tm.drivermanager.DriverInit;
import com.tm.utils.ProjectConfig;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListenrs implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart "+result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess "+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure "+result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped "+result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage "+result.getName());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        DriverInit.initDriver(ProjectConfig.getProperty("url"));
    }

    public void onFinish(ITestContext context) {
        DriverInit.closeDriver();
    }
}
