package Amz_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Amz_Smoke_01 {
WebDriver d1;
	@Test
	public void Login() throws InterruptedException
	{
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.navigate().refresh();
		
		
		WebElement email = d1.findElement(By.id("ap_email"));
		email.sendKeys("nishasbhalwal@gmail.com");
		//email.sendKeys(Keys.ENTER);
		WebElement cont = d1.findElement(By.id("continue"));
		cont.click();
		WebElement pwd = d1.findElement(By.id("ap_password"));
		pwd.sendKeys("subbu0707");
		//pwd.sendKeys(Keys.ENTER);
		WebElement submit = d1.findElement(By.id("signInSubmit"));
		submit.click();
		WebElement search = d1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Books");
		search.sendKeys(Keys.ENTER);
		//WebElement submit = d1.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
		//submit.click();
		WebElement a1 = d1.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2 = new Actions(d1);
		a2.moveToElement(a1).perform();
		WebElement b1 = d1.findElement(By.id("nav-item-signout"));
		b1.click();
		
		Thread.sleep(3000);
		d1.quit();
	}
		
		
		
		
		
		
		}

	

