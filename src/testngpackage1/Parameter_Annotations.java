package testngpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Annotations {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void browserlaunch(String nameofbrowser)
	{
		if(nameofbrowser.equals("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("nisha@email.com");
		driver.findElement(By.id("pass")).sendKeys("Nisha1234");;
		driver.findElement(By.name("login")).click();
	}
	
}
