package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver_Initialization.SetUp;

public class demo1 extends SetUp
{
	
	public static void main(String[] args) throws InterruptedException {
		SetUp dri=new SetUp();
		WebDriver driver =dri.inDrive();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement unam=driver.findElement(By.xpath("//input[@type='email']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOf(unam));
		unam.sendKeys("Ram");
		
	}
	
      
    		  
	
	
	
}
