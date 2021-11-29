package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement btnTrain = driver.findElement(By.id("home-tab"));
		btnTrain.click();
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'400+')]"));
		String text = txt.getText();
		System.out.println(text);
}
}
