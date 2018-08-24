package org.hema.Selenium.click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleSelect {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K TECH\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/registration");
		
		WebElement country = driver.findElement(By.id("dropdown_7"));
		
		Select country1 = new Select(country);
			
		System.out.println((country1.getFirstSelectedOption().getText()));
		 
		if((country1.getFirstSelectedOption().getText()).equals("Afghanistan")) {
		System.out.println("Passed the test");
		}
		else {
			
			System.out.println("Failed the test");
		}
		
		
	}
	

}
