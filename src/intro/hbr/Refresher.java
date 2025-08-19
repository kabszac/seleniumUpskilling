package intro.hbr;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresher {

	public static void main(String[] args) {
//		 Declare variables (int, double, char, boolean, String)
		int number = 5;
		double digits = 5.2;
		char letter = 'l';
		boolean isTrue = true;
		String name = "isaac";
		
//		Iterate through array of numbers and print multiples of 5
		
		int[] numberList = {2,5,8,10,12,15};
		
		for(int i=0; i<numberList.length; i++) {
			if(numberList[i] % 5 == 0) {
				System.out.println(numberList[i]);
			}
		}
		
//		Use ArrayList to manage author names from the HBR homepage
		
//		instantiate an arrayList called authorNames to store the list of authors
		ArrayList<String> authorNames = new ArrayList<String>();
		
//		Instantiate a driver 
		WebDriver driver = new ChromeDriver();
		
//		 visit hbp homepage
		driver.get("https://hbr.org/");
		
//		 wait for 10 seconds before raising an error
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		 find all elements with the class 'DigitalArticleCard_byline-link__yi4gC'
		List<WebElement> linksClass =  driver.findElements(By.cssSelector("a.DigitalArticleCard_byline-link__yi4gC"));
		
//		loop through each element and call the method splitString on each element
		for (WebElement link: linksClass) {
			String linkText = link.getText();
			splitString(linkText, authorNames);
			
		}
		
//		find all elements that start with the id for-you-authors
		List<WebElement> authorsId = driver.findElements(By.cssSelector("p[id^='for-you-authors']"));
		
//		loop through each element and call the method splitString on each element
		for (WebElement link: authorsId) {
			String linkText = link.getText();
			splitString(linkText, authorNames);	
		}
		
//		find all elements that start with the id 'latest-card-authors'
		List<WebElement> cardAuthors = driver.findElements(By.cssSelector("span[id^='latest-card-authors']"));
		
//		loop through each element and call the method splitString on each element
		for (WebElement link: cardAuthors) {
			String linkText = link.getText();
			splitString(linkText, authorNames);
			
		}
		
//		print the author names in the output 
		System.out.println(authorNames);

//		close the opened tab in Chrome
		driver.close();
		
		
		

	}
	
	public static List<String> splitString(String text, ArrayList<String> names){
		// split the string on ',' and 'and'
		String[] lst = text.split("[,\\s]*and[,\\s]*|,");
		
		// remove whitespace and add to Arraylist
        for (String name : lst) {
            names.add(name.trim());
        }
		
//		return the arrayList names
		return names;
	} 

}
