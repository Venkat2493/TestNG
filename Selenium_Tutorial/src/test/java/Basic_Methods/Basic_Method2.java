package Basic_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Method2 {

	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if (browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browser.equals("gecko")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("name_rb_secondary_item")).click();
		//driver.findElement(By.id("profile_detail")).click();
		List<WebElement> drodown_List = driver.findElements(By.xpath("//ul[@class='header_dropdown_menu  show-only-logged-in']/li"));
		System.out.println(drodown_List);
		
		driver.navigate().to("https://www.w3schools.com/java/tryjava.asp?filename=demo_helloworld");
		String window = driver.getWindowHandle();
		System.out.println(window);
		
		
		

	}

}
