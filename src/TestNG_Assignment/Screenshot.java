package TestNG_Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test 
	public void tc1() throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement dr =driver.findElement(By.xpath("//textarea[@name='q']"));
		dr.sendKeys("INDIA");
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/adwitasingh/eclipse-workspace/TestNg_Project1/Screenshots/Nisha.png");
		FileUtils.copyFile(source, destination);
		
		
	}
}
