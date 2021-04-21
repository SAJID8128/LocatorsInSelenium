package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathOrAnd {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here 'or' is used with two xPath statements to find the web element.
	@Test
	public void xPathOr() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Portal:Biography'] | //a[text()='Biography']")).click();
		Thread.sleep(5000L);
	}
	
	// Here 'and' is used to combine two xPath statements to find the web element.
	@Test
	public void xPathAnd() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='search' and @id='searchInput']")).sendKeys("quantum entanglement");
		Thread.sleep(5000L);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
