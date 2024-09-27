package com.orangehrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_Page {

	public static WebDriver driver;

	@Test
	public void launchBroser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	public void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Test (priority = 0)
	public void navigateToMyinfo() {
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		List<WebElement> input = driver.findElements(By.xpath("//input"));
		for (WebElement find : input) {
			System.out.println(find.isDisplayed());
		}
	}

	@Test (priority = 1)
	public void logout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/web/index.php/auth/l')]")).click();
		driver.quit();
	}
}
