package directLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://wallpapercave.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here the direct locator 'name' is used to find the web element.
	@Test
	public void nameAttribute() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("solar eclipse");
		Thread.sleep(3000L);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
