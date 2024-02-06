package DataProviderAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase3 {

	@DataProvider(name="testdata")
	public Object[][] method123()
	{
	
	Object[][] o1=new Object[2][4];
	o1[0][0] = "Nisha";
	o1[0][1] = "Singh";
	o1[0][2] = "nisha@test.com";
	o1[0][3] = "nisha123";
	
	o1[1][0] = "Narinder";
	o1[1][1] = "Singh";
	o1[1][2] = "narinder@test.com";
	o1[1][3] = "narinder123";
	
	return o1;
	}
	@Test(dataProvider = "testdata")
	public void scenario1(String fname, String lname, String un, String pwd) throws InterruptedException
	{
		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://grotechminds.com/registration/");
		d1.manage().window().maximize();
		
		WebElement firstname = d1.findElement(By.id("fname"));
		firstname.sendKeys(fname);
		WebElement lastname = d1.findElement(By.id("lname"));
		lastname.sendKeys(lname);
		WebElement username = d1.findElement(By.id("Username"));
		username.sendKeys(un);
		WebElement password = d1.findElement(By.id("password"));
		password.sendKeys(pwd);
		
		Thread.sleep(3000);
		d1.quit();
	
}
}
