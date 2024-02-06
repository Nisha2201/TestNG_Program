package Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
	{
	int retrytime =3;
	int count=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<retrytime)
		{
			count++;
			return true;//retry the testcase
	
		}
		return false;//doesn't retry the testcase
	}
	

	}
