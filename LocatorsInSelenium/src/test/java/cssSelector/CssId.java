package cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssId {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * When cssSelector is used with and id, a hashtag (#) is used before the value 
	 * of the id as shown here with '#email'.
	 */
	@Test
	public void classAttribute() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("abc123@gmail.com");
		Thread.sleep(3000L);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
