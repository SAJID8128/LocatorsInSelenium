package directLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParitialLinkText {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://myhotposters.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here the direct locator is 'partial link text' is used to find the web element.
	@Test
	public void partialLinkTextAttribute() throws InterruptedException {
		driver.findElement(By.partialLinkText("#celebrities &")).click();
		Thread.sleep(3000L);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
