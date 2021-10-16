package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo {
	static ChromeDriver driver;

	public static void main(String[] args) throws IOException {

		try {

//	1) Open the browser	
			ChromeDriver driver = new ChromeDriver();
//2) Maximize it.
			driver.manage().window().maximize();

//3) Navigate to the app Amazon
			driver.get("https://Amazon.in/");

//4) Hover Pointer over "Hello Sign" menu
			WebElement helloSignIn = driver.findElementById("nav-link-accountList");
			Actions actions = new Actions(driver);
			actions.moveToElement(helloSignIn).build().perform();

//5) Click on 'Sign in' button
			driver.findElementByLinkText("Sign inn").click();

		} catch (Exception e) {
			getScreenShot();
		}
	}

	private static void getScreenShot() throws IOException {
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("/home/ahmadadobe/ScreenShot/screengrab_1.png"));
	}
}
