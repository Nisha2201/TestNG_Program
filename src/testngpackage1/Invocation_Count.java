package testngpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Invocation_Count 
{
	@Test(invocationCount=2)
	public void tc1()
	{
		ChromeDriver d1 = new ChromeDriver();
		//SafariDriver s1 = new SafariDriver();
		d1.get("https://www.google.com/");
		d1.findElement(By.name("q")).sendKeys("Bharat");
	}
}
	
