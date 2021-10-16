package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg_FB {

	public static void main(String[] args) {
		//1) Open the browser.
		ChromeDriver driver = new ChromeDriver();
		//2) Navigate to the app.
		driver.get("https://www.facebook.com/");
		//3) Enter an invalid username - batman554466@gmail.com
		driver.findElementById("email").sendKeys("batman554466@gmail.com");
	
		//4) Enter an invalid password - password123.
		driver.findElementById("pass").sendKeys("password123");
		//5) Click on login button. 
		driver.findElementByName("login").click();
		
		//6) Verify the error message - Invalid Username or Password - is displayed.
		String expectedMessage = "Invalid username or password";
		String actualErrorMessage = driver.findElementByCssSelector("#error_box > div:nth-child(2)").getText();
	//	System.out.println(actualErrorMessage);
	
		if(expectedMessage.equals(actualErrorMessage))
		{
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		//7) Close the browser.*/
	//	driver.findElementsByTagName("a");
		driver.quit();

	}

}
