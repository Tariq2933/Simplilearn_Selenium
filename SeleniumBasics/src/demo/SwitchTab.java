package demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchTab {
	public static void main(String[] args) {
		
		
//	1) Open the browser.
		ChromeDriver driver = new ChromeDriver();
		
//	2) Maximize it.
		driver.manage().window().maximize();
		
//	3) Navigate to the app FACEBOOK
		driver.get("https://facebook.com");
		
//	4) Click Instagram to open in New Tab
		driver.findElementByLinkText("Instagram").click();;
		
		// 5) Switch focus to new Windows/tab.
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
//	5) Enter the email id
		driver.findElementByName("username").sendKeys("abc@gmail.com");

			
		
	}

}
