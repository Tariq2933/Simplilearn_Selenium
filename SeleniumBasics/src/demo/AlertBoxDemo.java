package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) {
//		1) Open the browser.
		ChromeDriver driver = new ChromeDriver();
//	2) Maximize it.
		driver.manage().window().maximize();
//	3) Navigate to the app.
		driver.get("https://retails.onlinesbi.com/retail/login.htm");
//	4) Click "Continue to login" button.
		driver.findElementByLinkText("CONTINUE TO LOGIN");
		
//	5) Click on Login button.
		driver.findElementById("Button2").click();
//	6) Click on Alert box by Clicking Ok button 
		driver.switchTo().alert().accept();

	}

}
