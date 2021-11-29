package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4Pract1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		WebElement btnCreate = driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
		btnCreate.click();
		Thread.sleep(3000);
		WebElement txtfrst = driver.findElement(By.name("firstname"));
		txtfrst.sendKeys("Raman");
		// driver.quit();

	}
}
