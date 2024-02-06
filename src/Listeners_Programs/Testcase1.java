package Listeners_Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListener_class.class)
public class Testcase1{
	WebDriver driver;
	@Test
	
	public void scenario1() throws InterruptedException
	{
		driver = new ChromeDriver();
		//launching the browser
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//maximize the browser
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		if(title.equals("Selenium"))
		{
			System.out.println("Pass : title is: " +title);
			
		}
		else
		{
			System.out.println("Fail : title is: " +title);
			
		}
		//navigate to download page
		driver.navigate().to("https://www.selenium.dev/downloads/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
