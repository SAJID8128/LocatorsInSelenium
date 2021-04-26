package cssPseudoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssNthChild {
	
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	/** A CSS pseudo-class is a keyword added to a selector that specifies a 
	 * special state of the selected web element.
	 * Nth-child returns elements based on their position in a group of siblings.
	 * Here the pseudo-class 'nth-child' was used to choose a specific 
	 * element from the list of job roles by specifying the place number on 
	 * the list after 'nth-child' for that specific job role.
	 */
	@Test
	public void firstChild() throws InterruptedException {
		driver.findElement(By.cssSelector("#job_role")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("select#job_role >:nth-child(4)")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#job_role")).click();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();

	}

}
