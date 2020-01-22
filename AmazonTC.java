package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonTC {

	public static void main(String[] args) {
		
		 	//declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","D:\\sem6\\test automation\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
		    	//Launch  Website
		        driver.navigate().to("https://www.amazon.in/");

			//Click on the search text box and send value
			WebElement element = driver.findElement(By.id("nav-signin-tooltip"));
			element.click();
			WebElement element1 = driver.findElement(By.id("ap_email"));
			
		   	element1.sendKeys("amazon_id");
			element1.submit();
			WebElement element2 = driver.findElement(By.id("ap_password"));
			element2.sendKeys("******");
			element2.submit();
			WebElement element3 = driver.findElement(By.id("nav-item-signout"));
			
			element3.click();
			

		   	//CLick on the search button
	}

}
