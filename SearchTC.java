package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\sem6\\test automation\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
    	//Launch  Website
        driver.navigate().to("https://www.amazon.in");

	//Click on the search text box and send value
	WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	element.sendKeys("iphone");
	
	
	element.submit();

	}

}
