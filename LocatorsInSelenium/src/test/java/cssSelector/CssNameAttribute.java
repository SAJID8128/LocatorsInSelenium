package cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssNameAttribute {
	
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
	 * Here cssSelector is used with the attribute 'name' and its value 'email'.
	 */
	@Test
	public void nameAttribute() throws InterruptedException {
		driver.findElement(By.cssSelector("[name=email]")).sendKeys("faruqbhai@gmail.com");;
		Thread.sleep(3000L);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}


}
