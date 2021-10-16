package demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.trivago.in/");
		
		//Wait for Cookies Pop-up to appear. And click Ok.
		Thread.sleep(3000);
		
		driver.findElementById("onetrust-accept-btn-handler").click();
		
		//Select 19th of the next month
		driver.findElementByXPath("//button[contains(@key,'checkInButton')]").click();
		
		//Locate upcoming month.
		WebElement comingMonth = driver.findElementByXPath("(//table[contains(@class,'cal-month')])[2]");
     
		//Get all rows from coming month and put them in the list.
		List<WebElement> rows = comingMonth.findElements(By.tagName("tr"));
				
		//Pick up one row at a time form the list of the rows.
		boolean dateSelected = false;
		for(int i=0; i<rows.size(); i++ ) 
		{
			WebElement row = rows.get(i);
		
		//From the selected row now create a New list
		List<WebElement> columns = row.findElements(By.tagName("td"));
		
		//Iterate through all the values of the new list.
		for(WebElement x : columns) 
		{
			if(x.getText().equals("19"))	
			{
			x.click();
			dateSelected = true;
			break;
			}
		}
		}
	
	
	
	if(dateSelected == true)
		{
		break;
		}
	
}










