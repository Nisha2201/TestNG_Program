package Listeners_Programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class ITestListener_class implements ITestListener
{
	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("The testcase is Started");
		

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("The testcase is Passed");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source=	ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/adwitasingh/eclipse-workspace/TestNg_Project1/Screenshots/Pass"+Math.random()+".png");
		try {
			FileUtils.copyDirectory(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("The testcase is Failed");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source=	ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/adwitasingh/eclipse-workspace/TestNg_Project1/Screenshots/Fail"+Math.random()+".png");
		try {
			FileUtils.copyDirectory(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("The testcase is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		Reporter.log("The testcase is Failed But Within Success Percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("The testcase is Failed With Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("The testcase is onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("The testcase is on finished");
	}
	

	
}
