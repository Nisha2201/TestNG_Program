package Retry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario1 {
@Test(retryAnalyzer=Retry.RetryLogic.class)// retryAnalyzer=<package name>.<classname where retry logic has written>.class
		public void s1() 
			{
	
	ChromeDriver d1= new ChromeDriver();
	d1.manage().window().maximize();
	d1.navigate().to("https://www.flipkart.com/");
	WebElement search5 = d1.findElement(By.className("_30XB9F"));
	search5.click();
	
	/*ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.facebook.com/");
	d1.manage().window().maximize();
	/*WebElement useridfield = d1.findElement(By.id("email"));
	useridfield.sendKeys("email@test.com");
	WebElement passfield = d1.findElement(By.id("pass"));
	passfield.sendKeys("wrongpass");
	//Thread.sleep(3000);
	//d1.quit();*/
			}
}
