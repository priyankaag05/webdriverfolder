package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bibawebsiteexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.biba.in/festive-collection?mf_campaignname_click=17726062009&gclickId_identifier=Cj0KCQjwxveXBhDDARIsAI0Q0x3aS_Ki6EawYC_U0YxV4qAttPd_Vsgs60Su-c5rTpHL-ktA8TuPq0QaAnb6EALw_wcB&placement_id_identifier=&key_word_identifier=biba&ad_group_id_identifier=138778488636&utm_source=Google&gclid=Cj0KCQjwxveXBhDDARIsAI0Q0x3aS_Ki6EawYC_U0YxV4qAttPd_Vsgs60Su-c5rTpHL-ktA8TuPq0QaAnb6EALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//otherpages contentpage_1447473 india
				WebElement Login=driver.findElement(By.xpath("//div[@class='user-rv']"));
				Actions action = new Actions(driver);
				action.moveToElement(Login).perform();
		
		//select is for dropdown;
		//select is a class so we have to create object of select class
		WebElement Countrydrp= driver.findElement(By.name("drpCountry"));
		Select ddcountry=new Select(Countrydrp);
		ddcountry.selectByVisibleText("India");
		
		
		
		//Login.click();
		WebElement Mobile=driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
		Mobile.sendKeys("1234567891");
	}

}
