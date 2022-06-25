package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Iframe\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//BY using webelement
		WebElement imgFrame = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
		driver.switchTo().frame(imgFrame);
		//By using id
		//driver.switchTo().frame("a077aa5e");
		WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
		
		
	}

}
