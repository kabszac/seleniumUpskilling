/**
 * 
 */
package intro.hbr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



/**
 * 
 */
public class AssertionsTestFLow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to the HBP website
		driver.get("https://hbr.org/");

		String expectedTitle = "Harvard Business Review - Ideas and Advice for Leaders";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");


		// Locate the search icon  using XPath
		WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[1]/div/div/button[2]"));

		// Locate the search input field by its placeholder text using CSS selector
		WebElement inputField = driver.findElement(By.cssSelector("input[placeholder='Search hbr.org']"));

		searchIcon.sendKeys("Automation testing");  

		// Type "Automation testing" into the actual search input field
		inputField.sendKeys("Automation testing");

		// Submit the search form by submitting the input field
		inputField.submit();
		
		// Locate the search input field by its placeholder text using CSS selector
		WebElement searchResult = driver.findElement(By.cssSelector("h3[class='mbn']"));
		String resultText = searchResult.getText();
		
		//replace all characters that are not numbers
		String numberOnly = resultText.replaceAll("[^0-9]", ""); 
		// convert the string to integer
		int result = Integer.parseInt(numberOnly);
		
		Assert.assertTrue(result > 0, "Result count should be greater than 0");
		
		WebElement firstArticle = driver.findElement(By.cssSelector("a[js-target='search-item'][position='1']"));
		
		System.out.println(firstArticle.getText());
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
