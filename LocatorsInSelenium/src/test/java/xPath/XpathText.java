package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathText {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://wallpapercave.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Here xPath is used with 'text' to find the web element.
	@Test
	public void text() throws InterruptedException {
		WebElement text1 = driver.findElement(By.xpath("//p[text()='Copyright © WallpaperCave 2014 - 2021. All Right Reserved.']"));
		System.out.println(text1);
		Thread.sleep(3000L);
		WebElement text2 = driver.findElement(By.xpath("//h1[text()='Welcome to WallpaperCave!']"));
		System.out.println(text2);
		Thread.sleep(3000L);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
