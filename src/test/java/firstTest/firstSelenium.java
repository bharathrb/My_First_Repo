package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstSelenium {
	
	@Test
	public void step1() {
		System.out.println("Hello, World!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Rb\\Documents\\Bharath_Rb\\Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.ultimatix.net");
		
		driver.findElement(By.id("form1")).sendKeys("121212");
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
	}

}
