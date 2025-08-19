package intro.hbr;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {

	public static void main(String[] args) {
		// Create a new instance of the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the HBP website
		driver.get("https://hbr.org/");
		
		// wait for 3 seconds
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}
			
		// find and click the sign in button
		WebElement signIn = driver.findElement(By.cssSelector("button#sign-in-button-header"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", signIn);
		
		// print the current url
		System.out.println(driver.getCurrentUrl());
		
		// wait for 1 second
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}
		
		//close the sign-in modal
		driver.findElement(By.cssSelector("button.AuthModal-module_close-btn__0ANTF")).click();
		
		// click on the subscribe button
		driver.findElement(By.cssSelector("a.Header-module_subscribe-button__mGvj9")).click();
		
		// close all open tabs
		driver.quit();

		
		

	}

}
