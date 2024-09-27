package Basic_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class eight_Aug_Basic_Method1 {

	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		
		driver.navigate().to("https://images.google.com/");
		driver.close();
	}
}
