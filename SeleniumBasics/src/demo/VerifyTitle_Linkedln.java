package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle_Linkedln {
	public static void main(String[] args) {
		//1) Open the browser.
		ChromeDriver driver = new ChromeDriver();
		//2)Navigate to the app.
		driver.get("https://linkedin.com/");
		//3)Verify user sees the Title - Linked: Log In or Sign Up.
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle =  driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		//4) Close the browser. 
		driver.quit();
		
		
		
	}

}
