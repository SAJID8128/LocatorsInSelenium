package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathStartsWith {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.djriver.com/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here xPath is used with 'starts-with' to find the web element.
	@Test
	public void startsWith() throws InterruptedException {
		driver.findElement(By.xpath("//p[starts-with(@id,'DrpDwnMn05')]")).click();
		Thread.sleep(3000L);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
