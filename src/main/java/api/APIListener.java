package api;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class APIListener implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"start");
    }

    public void onTestSuccess(ITestResult result) {
       // System.out.println("onTestSuccess Method" +result.getName());
    }

}
