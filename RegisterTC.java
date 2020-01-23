package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTC {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\sem6\\test automation\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
    	//Launch  Website
        driver.navigate().to("https://www.amazon.in/register");

	//Click on the search text box and send value
	WebElement element = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
	element.sendKeys("Prakhar");
	WebElement element1 = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	element1.sendKeys("mobile no");
	element1.submit();
	WebElement element2 = driver.findElement(By.xpath("//input[@id='ap_email']"));
	element2.sendKeys("email id");
	element2.submit();
	WebElement element3 = driver.findElement(By.xpath("//input[@id='ap_password']"));
	element3.sendKeys("password");
	WebElement element4 = driver.findElement(By.xpath("//input[@id='continue']"));
	
	element4.click();

}
}