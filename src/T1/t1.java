package T1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {
@SuppressWarnings("deprecation")
@Test
public void m1()  {
	System.out.println("vvv");
		
		System.out.println("ccc");
		System.setProperty("WebDriver.Chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	    WebElement ele = driver.findElement(By.id("alert"));
	  
	  ele.click();
	  
	  //static wait
	  //Thread.sleep(8000);
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(7,TimeUnit.MILLISECONDS);
	  
	  driver.switchTo().alert().accept();
	}
}
