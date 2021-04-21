package directLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Tag {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * Here the direct locator 'tag' is used to find multiple web elements and 
	 * print out the how many have the 'a' tag.
	 */
	@Test
	public void tagAttribute() throws InterruptedException {
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		Thread.sleep(1000L);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
