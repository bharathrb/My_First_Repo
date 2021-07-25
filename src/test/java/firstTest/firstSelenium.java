package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstSelenium {
	
	@Test
	public void step1() {
		System.out.println("Hello, World!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Bharath Rb\\Sel Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.google.com");
		
	}

}
