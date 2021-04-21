package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClass {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here xPath is used with 'class' to find the web element.
	@Test
	public void classAttribute() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("the god particle");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		Thread.sleep(2000L);
		
	}
		
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
