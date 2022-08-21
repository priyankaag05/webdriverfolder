package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//step to click on Login
		WebElement LoginLink= driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		//step to enter login field
		WebElement UserName=driver.findElement(By.name("user_login"));
		UserName.sendKeys("05.priyanka@gmail.com");
		
		//steps to enter password field
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
		
		//steps to enter rememberme checkbox
		WebElement Checkbox=driver.findElement(By.className("rememberMe"));
		Checkbox.click();
		
		//step for login button
		WebElement Loginbtn=driver.findElement(By.name("btn_login"));
		Loginbtn.click();
		
		//validate message when we enter wrong password
		WebElement Error=driver.findElement(By.id("msg_box"));
		
		String ActError=Error.getText();
		String ExpError="The email or password you have entered is invalid.";
		if(ActError.equals(ExpError)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC failed");
		}
		
		//anchor tag
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links" + Links.size());
		
		for(int i=0;i<Links.size();i++) {
			System.out.println(Links.get(i).getAttribute("href"));
		}
		
		driver.close();
	}
}
