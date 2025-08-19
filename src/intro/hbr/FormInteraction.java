/**
 * 
 */
package intro.hbr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class FormInteraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Create a new instance of the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// explicitly wait for 58 seconds before raising an eeor
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		// Navigate to the HBP website
		driver.get("https://hbr.org/");
		
		// find and click the sign in button
		WebElement signIn = driver.findElement(By.cssSelector("button#sign-in-button-header"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", signIn);
		
		// find the email input
		WebElement email = driver.findElement(By.cssSelector("input[name='emailAddress']"));
		//send email 
		email.sendKeys("testuser@email.com");
		
		// find password and send password
		driver.findElement(By.cssSelector("input#text-input\\:r1\\:")).sendKeys("password");
		
		// click on the sign in button
		driver.findElement(By.cssSelector("button.SignInForm-module_btn__qTJMX")).click();
		
		// find the error message and print it
		WebElement error = driver.findElement(By.cssSelector("span.AlertMessage-module_error-message__nmgov"));
		String  errorMessage = error.getText();
		System.out.println(errorMessage);
		
		//clear the email field
		email.clear();
		// input new email
		email.sendKeys("testuser2@email.com");
		
		// wait for 3 seconds
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}
		
		// close the open tab
		driver.close();

	}

}
