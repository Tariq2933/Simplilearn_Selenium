package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTime_Demo {
	public static void main(String[] args) {
			
//	1)	Open the browser.
		ChromeDriver driver = new ChromeDriver(); 
//	2)	Maximize it.
		driver.manage().window().maximize();
//	3)	Navigate to the app.
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
//	4)	Click on the start button.
		driver.findElementById("start").click();
//	5)	Verify the test “Hello World!” appears on the page.
		String expectedText = "Hello World!";
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		//driver.wait();
		
		
		String actualtext = driver.findElementByCssSelector("#finish > h4").getText();
		
		
		if (expectedText.equals(actualtext))
		{
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}

		driver.quit();
	}
	

}
