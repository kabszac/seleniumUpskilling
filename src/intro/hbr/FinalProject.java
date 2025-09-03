package intro.hbr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		// explicitly wait for 58 seconds before raising an eeor
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		// Navigate to the medium website
		driver.get("https://medium.com/)");

//		driver.findElement(By.cssSelector("div.Bz112c-ZmdkE")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(
//		    ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.Bz112c-ZmdkE"))
//		);
		


		
//		driver.findElement(By.linkText("Sign in")).click();
//		
//		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[1]/div[1]/div/div/a[2]/div")).click();
//		
//		try {
//		    Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
//		}
//		
//		driver.findElement(By.id("email")).sendKeys("0774107719");
//		
//		driver.findElement(By.id("pass")).sendKeys("kak879j");
//		
//		driver.findElement(By.id("loginbutton")).click();
//		
//		try {
//		    Thread.sleep(30000);
//		} catch (InterruptedException e) {
//		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
//		}
//		driver.findElement(By.cssSelector("div[aria-label='Continue as Kal']")).click();
//		
//		WebElement profileIcon = driver.findElement(By.cssSelector("img[alt='Kal medium']"));
//		assert profileIcon.isDisplayed();
		
		WebElement searchInput = driver.findElement(By.cssSelector("input[aria-controls='searchResults']"));
		searchInput.sendKeys("software engineering");
		searchInput.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("  div.y.ec.oe")).click();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 19543);");
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}
		
		js.executeScript("window.scrollBy(0, -19543);");
		
		
		WebElement clapsNumber = driver.findElement(By.cssSelector("div.dd > p > button"));
		System.out.println(clapsNumber.getText());
		int number = Integer.parseInt(clapsNumber.getText());
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); // Handle the exception if the sleep is interrupted
		}
		
		
		// Locate the SVG element
		WebElement clapButton = driver.findElement(By.cssSelector("svg[aria-label='clap']"));

		// Use JavaScriptExecutor to click
		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles: true}))", clapButton);

		
		
		WebElement followBtn = driver.findElement(By.xpath("//span[text()='Follow']"));
		System.out.println(followBtn.getText());
		

	}

}
