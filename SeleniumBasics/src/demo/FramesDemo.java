package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
//		1) Open the browser.
		ChromeDriver driver = new ChromeDriver();
				
//		2) Maximize it.
		driver.manage().window().maximize();
		
//		3) Navigate to the app Selenium
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
//     3.1) Go inside the Frame.
		driver.switchTo().frame("classFrame");
		
//		4) Click "DEPRECATED" hyperlinks
		driver.findElementByLinkText("DEPRECATED").click();
		//Thread.sleep(3000);
		//driver.quit();
//		4.1) Come out of the existing Frame.
		driver.switchTo().defaultContent();
		
//		5) Go to another Frame.
		driver.switchTo().frame("packageFrame");
		
		WebElement Element = driver.findElement(By.linkText("OpaqueKey"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",Element);
		
		driver.findElementByLinkText("OpaqueKey").click();
		
		
//		6) Go to OpaqueKey in the new frame.
		driver.findElementByLinkText("OpaqueKey").click();
		
		
	}



	
}
