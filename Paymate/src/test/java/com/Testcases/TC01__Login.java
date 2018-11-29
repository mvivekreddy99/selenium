package com.Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01__Login {
	WebDriver driver;

	/*
	 * @Test public void Paymatelogin() throws InterruptedException{
	 * System.setProperty("webdriver.chrome.driver","./src/Resources/java/Browser Drivers/chromedriver.exe");
	 * driver = new ChromeDriver();
	 * System.out.println("Browser launched");
	 * driver.get("https://www.enhops.com/");
	 * System.out.println("welcom to enhops"); 
	 * Thread.sleep(5000);
	 * driver.close();
	 * }          
	 */

	@BeforeTest
	public void browserlaunch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./src/Resources/java/Browser Drivers/geckodriver.exe");
		Reporter.log("Browser initialized");
		driver = new FirefoxDriver();
		Reporter.log("Browser Launched");
		driver.get("https://www.enhops.com/");
	}
	
 	@BeforeMethod
	public void verifyhomepagetitle() {
		System.out.println("Before method");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	}
 	
	@Test(priority = 0)
	public void Paymatelogin1() throws InterruptedException {
		System.out.println("Test1 executions");
		driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[1]/ul/li[2]/a")).click();
		String g = driver.getTitle();
		System.out.println(g);
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void mobiletesting() throws InterruptedException {
		System.out.println("Test2 executions");
		driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[1]/ul/li[5]/a")).click();
		String m = driver.getTitle();
		System.out.println(m);
		Thread.sleep(2000);

	}

	@AfterMethod
	public void backtohmepage() {
		System.out.println("After method");
		driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[1]/a/img")).click();
		String hme = driver.getTitle();
		System.out.println(hme);

	}

	@AfterTest
	public void browserclose() {
		String c = driver.getTitle();
		System.out.println(c);
		driver.close();
	}
}