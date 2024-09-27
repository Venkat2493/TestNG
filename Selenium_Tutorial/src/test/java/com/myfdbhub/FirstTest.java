package com.myfdbhub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@Test
	public void launchGoogle () {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("open the selenium Q&A", Keys.ENTER);
		String print = driver.getTitle();
		System.out.println(print);
		driver.quit();
	}
	
	@Test
	public void launchTicketnew () throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ticketnew.com/movies");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Chennai", Keys.ENTER);
		Thread.sleep(6000);
		String print = driver.getTitle();
		System.out.println(print);
		driver.quit();
	}

}
