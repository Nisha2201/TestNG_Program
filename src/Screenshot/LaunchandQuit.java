package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchandQuit {
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement dr =driver.findElement(By.xpath("//textarea[@name='q']"));
		dr.sendKeys("INDIA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//new ChromeDriver();
		//driver.get("https://www.google.com/");
		//WebElement dr =driver.findElement(By.xpath("//textarea[@name='q']"));
		//dr.sendKeys("INDIA");
	}

	@Test 
	public void tcs()
	{
		System.out.println("nisha");
	}
	@AfterMethod
	public void quit() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		//TakesScreenshot ts1= driver;
		TakesScreenshot ss = (TakesScreenshot) driver;
			File source=	ss.getScreenshotAs(OutputType.FILE);
			File destination = new File("/Users/adwitasingh/eclipse-workspace/TestNg_Project1/Screenshots/Nisha"+Math.random()+".png");
		FileUtils.copyFile(source, destination);

		/*Thread.sleep(2000);
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/adwitasingh/eclipse-workspace/TestNg_Project1/Screenshots/Nisha.png");
		FileUtils.copyFile(source, destination);*/
	}
}
