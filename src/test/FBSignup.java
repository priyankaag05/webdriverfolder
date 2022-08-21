package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// //a[@data-testid='open-registration-form-button']
		 //input[@name='firstname']
		//input[@name='lastname']
		 //input[@name='reg_email__']
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Signup=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Signup.click();
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		
		WebElement Mobilenumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				
		Firstname.sendKeys("avu");
		LastName.sendKeys("agarwal");
		Mobilenumber.sendKeys("9582282282");
		password.sendKeys("qwerty@123");
		
		// select is tag for dropdown
				//select is a class so we have to create object of select class
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select ddday=new Select(day);
		
		ddday.selectByVisibleText("7");
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ddmonth=new Select(month);
		ddmonth.selectByVisibleText("Jan");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ddyear=new Select(year);
		//ddyear.selectByVisibleText("2017");
		
		//to find default value at dropdown
	    System.out.println("Selected month by getfirstselectedoption method is "+ddmonth.getFirstSelectedOption().getText());
	    System.out.println("Selected year is "+ ddyear.getFirstSelectedOption().getText());
		
		// xpath of deafult value at month 
		// //select[@name='birthday_month']/option[@selected='1']
		
		WebElement dmonth=driver.findElement(By.xpath("//select[@name='birthday_month']/option[@selected='1']"));
	    System.out.println("selected month by xpath is "+ dmonth.getText());
		
		//to find all months using getoption
		List<WebElement> Months= ddmonth.getOptions();
		for(WebElement elm:Months) {
			System.out.println(elm.getText());
		}
		
		// list of all days using get options
		List<WebElement> AllDays= ddday.getOptions();
		for(WebElement dayelm:AllDays) {
			System.out.println(dayelm.getText());
		}
		
		
		//using xpath to find all month
		List<WebElement> AllMonth=driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for(WebElement elm:AllMonth) {
			System.out.println(elm.getText());
		}
		
		//using xpath to find all days
				List<WebElement> Alldayvalue=driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
				for(WebElement elm1:Alldayvalue) {
					System.out.println(elm1.getText());
				}
		
				String Gender="Female";
				
//		WebElement Female=driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//		WebElement Male=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
//		WebElement Other=driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
//		if(Gender.equals("Female")){
//			Female.click();
//		}else if(Gender.equals("Male")){
//			Male.click();
//		}else
//			Other.click();
		
				//This is xpath for female radio button 
		//		WebElement GenderRadiobtn=driver.findElement(By.xpath("//label[text()='Female']//following-sibling::input"));
			
				//This is dynamic xpath for female , male or custom on Facebook. Using concatination
			WebElement GenderRadiobtn=driver.findElement(By.xpath("//label[text()='" + Gender + "']/following-sibling::input"));
		GenderRadiobtn.click();
		 
	}

}
