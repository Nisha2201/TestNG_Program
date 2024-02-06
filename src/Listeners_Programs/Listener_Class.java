package Listeners_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_Class {
	WebDriver d1;
	@Test
	public void login() {
		d1 =new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		d1.findElement(By.name("q")).sendKeys("India");
		Assert.assertEquals(d1.getTitle(), "Google");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		
		
	}

}
