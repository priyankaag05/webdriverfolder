package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//handle the iframe. means embeded page into page. first go to iframe then search the element.
		driver.switchTo().frame("frame1");

		WebElement Header = driver.findElement(By.id("sampleHeading"));
		System.out.println(Header.getText());
		// it will bring back to content of main page. ouside iframe
		driver.switchTo().defaultContent();
		
	}

}
