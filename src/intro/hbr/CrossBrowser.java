/**
 * 
 */
package intro.hbr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 */
public class CrossBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Firefox implementation
		// Create a new instance of the Firefox browser
		WebDriver driver = new FirefoxDriver();
		

		// Navigate to the HBP website
		driver.get("https://hbr.org/");

		// Print the title of the current page to the console
		System.out.println(driver.getTitle());

		// Print the current URL of the page to the console
		System.out.println(driver.getCurrentUrl());

		// Locate the search icon  using XPath
		WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[1]/div/div/button[2]"));

		// Locate the search input field by its placeholder text using CSS selector
		WebElement inputField = driver.findElement(By.cssSelector("input[placeholder='Search hbr.org']"));

		searchIcon.sendKeys("Automation testing");  

		// Type "Automation testing" into the actual search input field
		inputField.sendKeys("Automation testing");

		// Submit the search form by submitting the input field
		inputField.submit();

		// Pause the script for 5 seconds to allow time for results to load
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}

		// Close the browser window
		driver.close();

	}

}
