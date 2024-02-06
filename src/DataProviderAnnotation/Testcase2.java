package DataProviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase2 {

	@DataProvider(name="data2") 
	public Object[][] methodtostorevalue()
{
		return new Object[][] {{"Surya"},{"Manish"},{"Anjali"},{"Ramu"},{"Eshan"},{"Nisha"},{"Monali"}};
	}
	@Test(dataProvider= "data2")
	public void scenario1(String data)
{
		String output=data.concat(" Student");
		System.out.println(output);
}
}


