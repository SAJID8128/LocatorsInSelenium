package cssPseudo_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssLastChild {
	
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	/**  A CSS pseudo-class is a keyword added to a selector that specifies a 
	 * special state of the selected web element.
	 * Last-child returns the last element from a group of sibling elements.
	 * Here the pseudo-class 'last-child' was used to select the last 
	 * element from the list of job roles.
	 */
	@Test
	public void firstChild() throws InterruptedException {
		driver.findElement(By.cssSelector("#job_role")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("select#job_role >:last-child")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#job_role")).click();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();

	}
 

}
