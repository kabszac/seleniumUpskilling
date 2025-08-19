/**
 * 
 */
package intro.hbr;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
public class DynamicContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		instantiate an arrayList called titleNames to store the list of titles
		ArrayList<String> titleNames = new ArrayList<String>();
		
//		Instantiate a driver 
		WebDriver driver = new ChromeDriver();
		
//		 visit hbp homepage
		driver.get("https://hbr.org/");
		
		// find the first article on the homepage
		WebElement title1 = driver.findElement(By.cssSelector("h1.Featured_title__MsPRd"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement title1 = wait.until( ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.Featured_title__MsPRd")));
		
//		use.isDisplayed()
		if(title1.isDisplayed()) {
			titleNames.add(title1.getText());
		}else {
		    System.out.println("Logo is hidden");
		}
		
//		find all elements that start with the class ForYouCard_title__sGvAV
		List<WebElement> titleClass = driver.findElements(By.cssSelector("h2[class='ForYouCard_title__sGvAV']"));

//		loop through the tiltleCLass list 
		for (WebElement title: titleClass) {
			String titleText = title.getText();
			titleNames.add(titleText);
		}
		
//		print the title names in the terminal
		System.out.println(titleNames);
		
//		close the opened tab in Chrome
		driver.close();
		
		
		
	}

}
