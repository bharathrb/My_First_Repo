package firstTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class firstSelenium {
	
	@Test
	public void step1() throws InterruptedException, IOException {
		
		
		System.out.println("Hello, World!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Rb\\Documents\\Bharath_Rb\\Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https:\\www.ultimatix.net");
		
		driver.manage().window().maximize();
		
		Workbook Src = new XSSFWorkbook("C:\\Users\\Bharath Rb\\Documents\\Bharath_Rb\\Login Cred.xlsx");
		Sheet TestSheet = Src.getSheetAt(0);
		
		Cell c = TestSheet.getRow(0).getCell(0);
		
		DataFormatter d = new DataFormatter();
		String Username = d.formatCellValue(c);
		
		Src.close();
		
		driver.findElement(By.id("form1")).sendKeys(Username);
		
		System.out.println(driver.findElement(By.id("proceed-button")).getText());
//		driver.findElement(By.id("proceed-button")).click();
//		
//		driver.findElement(By.id("auth-code-btn")).click();
//		
//		driver.findElement(By.id("authcode1")).sendKeys("429379");
//		
//		driver.findElement(By.id("form-submit")).click();
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"geodiv\"]/div[2]/span"))).click().perform();
//		
//		List<WebElement> options = driver.findElements(By.xpath("//*[@id='dropDown']//div//div"));
////		
//		for(WebElement opt : options) {
//			if (opt.getText().contains("Japan")) {
//				opt.click();
//				break;
//			}
//		}
//		
//		
//		action.moveToElement(driver.findElement(By.linkText("Global ESS"))).click().perform(); Thread.sleep(5000);
//		
//		String HomePage = driver.getWindowHandle();
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> i = windows.iterator();
//		
//		for(String window : windows) {
//			driver.switchTo().window(window);
//			
//			if(window.equalsIgnoreCase(HomePage)) {
//				System.out.println("Switched to Home page");
//			}
//			else {
//			System.out.println("Swithed to "+driver.getTitle());
//			driver.close();
//			System.out.println("Closed "+driver.getTitle());
//			}
//			
//		}
//		driver.switchTo().window(HomePage);
//		
//		driver.findElement(By.xpath("//*[@class='LogOut']//a[@id='uam_modal']")).click(); Thread.sleep(2000);
//		
//		driver.findElement(By.id("logoutbutton")).click(); Thread.sleep(2000);
//		
//		driver.close();
		
		
	}

}
