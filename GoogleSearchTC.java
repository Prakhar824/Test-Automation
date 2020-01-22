package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GoogleSearchTC {

	public static void main(String[] args) {
		
		 	//declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","D:\\sem6\\test automation\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
		    	//Launch  Website
		        driver.navigate().to("http://www.google.com/");

			//Click on the search text box and send value
			WebElement element = driver.findElement(By.name("q"));
		   	element.sendKeys("javatpoint tutorials");
			element.submit();

		   	//CLick on the search button
	}

}
