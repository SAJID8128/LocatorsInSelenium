package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathContains {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://myhotposters.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here xPath is used with 'contains' to find the web element.
	@Test
	public void contains() throws InterruptedException {
		driver.findElement(By.xpath("//input[contains(@id,'mce-EMAIL')]")).sendKeys("abc123@hotmail.com");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		Thread.sleep(3000L);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
