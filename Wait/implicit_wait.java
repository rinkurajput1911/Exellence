package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class implicit_wait {
	
	public static void main(String[] args) {
		SetUp jj=new SetUp ();
		WebDriver driver = jj.inDrive();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text'])[1]"));
		WebElement lastname = driver.findElement(By.xpath("//input[@type='text'])[2]"));
		
		
		
	}

}
