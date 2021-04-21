package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathId {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here xPath is used with 'id' to find the web element.
	@Test
	public void idAttribute() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("theory of everything");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id='guide-icon']")).click();
		Thread.sleep(3000L);
	}
		
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
