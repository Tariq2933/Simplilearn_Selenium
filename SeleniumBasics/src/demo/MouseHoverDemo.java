package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
	public static void main(String[] args) {
		
//		1) Open the browser
		ChromeDriver driver = new ChromeDriver();
//		2) Maximize it.
		driver.manage().window().maximize();
		
//		3) Navigate to the app Amazon
		driver.get("https://Amazon.in/");
		
//		4) Hover Pointer over "Hello Sign" menu
		WebElement helloSignIn = driver.findElementById("nav-link-accountList");
		Actions actions = new Actions(driver);
		actions.moveToElement(helloSignIn).build().perform();
		
//		5) Click on 'Sign in' button
		driver.findElementByLinkText("Sign in").click();

		
	}
	

}
