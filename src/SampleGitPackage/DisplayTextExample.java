package org.hema.seleniumalert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K TECH\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/index.php");
		
		WebElement technologies = driver.findElement(By.id("java_technologies"));
		
		System.out.println(technologies.getText());
		
		

	}

}
