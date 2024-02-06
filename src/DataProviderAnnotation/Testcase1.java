package DataProviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Testcase1 {
	@DataProvider(name="data1")
	public Object[][] dataforstringfunction()
		{
			return new Object[][] {{16},{20},{30}};
	
		}
	@Test(dataProvider="data1")
	public void scenario1(int data)
	{
		int sum = data+100;
		System.out.println(sum);
	}

}
