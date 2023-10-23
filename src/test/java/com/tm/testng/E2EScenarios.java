package com.tm.testng;

import org.testng.annotations.Test;

public class E2EScenarios extends TestNgMethods{

    @Test(groups = {"module","sanity"})
    public void sampletest(){
        System.out.println("Browser Launched");
    }

    @Test(groups = {"module","regression","E2EScenarios"})
    public void sampletest2(){
        System.out.println("Sample test 2");
    }


}
