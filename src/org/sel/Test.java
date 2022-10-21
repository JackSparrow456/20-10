package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Seleniumn\\driv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.green-tech.co.in/");	
		Thread.sleep(3002);
		WebElement drpProduct = driver.findElement(By.xpath("//li[@class='drop']"));
		Actions actions = new Actions(driver);

		actions.moveToElement(drpProduct).perform();
WebElement awstraining = driver.findElement(By.xpath("//a[@style='padding-top: 8px; padding-bottom: 8px;']//ancestor::li//a[@href='paperbagmachine.html']"));
awstraining.click();
	}
}
