package cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssTagClassAttribute {
	
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
	 * Here cssSelector is used with a combination of tag,class, and attribute to distinguish
	 * email field from the password field.
	 */
	@Test
	public void classAttribute() throws InterruptedException {
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("java_is_easy@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("thisismypassword");
		Thread.sleep(3000L);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
