package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement UserName=driver.findElement(By.xpath("//input[@type='email']"));
		UserName.sendKeys("05.priyanka@gmail.com");
		
		WebElement ButtonCon=driver.findElement(By.xpath("//input[@id='continue']"));
		ButtonCon.click();
		
		WebElement forgotkey= driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']"));
		forgotkey.click();
		//WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		//password.sendKeys("");
	//	
	//	WebElement signbutton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
			
	//	signbutton.click();
		
		
	}

}
