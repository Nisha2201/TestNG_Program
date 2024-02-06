package testngpackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
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
