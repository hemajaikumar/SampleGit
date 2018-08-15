
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AddtoCart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K TECH\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement closebtn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		closebtn.click();
		
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		txtUser.sendKeys("iphone");
		txtUser.sendKeys(Keys.ENTER);
		
		
		//WebElement textLink = driver.findElement(By.xpath("//div[@class='col col-7-12']"));
		
		Thread.sleep(2000);
		
		List<WebElement> textLink = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		if(textLink!=null) {
		textLink.get(4).click();
		}	
		//textLink.click();
		
		
		String PwID = driver.getWindowHandle();
		
		System.out.println(PwID);
		
		java.util.Set<String> allWindowsID =  driver.getWindowHandles();
		
		int count= allWindowsID.size();
		System.out.println(count);
		
		System.out.println(allWindowsID);
			
		Thread.sleep(4000);
		
		
		for (String X : allWindowsID) {
			
			
			if(!PwID.equals(X)) {
				driver.switchTo().window(X);
				
			}
			
		}
	
		
		
		
		Thread.sleep(6000);
		WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		addToCart.click();
	

		for (String X : allWindowsID) {
			
			
			if(!PwID.equals(X)) {
				driver.switchTo().window(X);
				
			}
			
		}
		
		Thread.sleep(6000);
		
		WebElement amount=driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']"));
		
		System.out.println("amount"+amount.getText());

		
				
	}
	

}