package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class DropDownMenu {
		
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://whitecircleschool.com/dropdowndemo/");
			//driver.findElementByLinkText("Create New Account").click();
			WebElement countries = driver.findElementByName("country");
			Select select = new Select(countries);
			select.selectByVisibleText("SWITZERLAND");
					
			
		}

	}


