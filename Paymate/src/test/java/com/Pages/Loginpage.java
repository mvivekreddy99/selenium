package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.Browser;
import com.Utility.Commonfunctions;
import com.Utility.LogUtil;
import com.Utility.Screenshot;

public class Loginpage extends Browser {

	public static By txtxuname = By.id("txtParanNaam");
	public static By txtpwd = By.id("txtParanShabd");
	public static By btnlogin = By.id("cphContents_btnLogin");
	public static By btnlogout = By.xpath("//*[@id='navbar-collapse']/ul/li/a[2]/i");
	public static By lnklogout = By.xpath("//*[@id='navbar-collapse']/ul/li/ul/li[1]/ul/li/a");

	public static void login(String username, String password) throws Exception {
		System.out.println("inside login method");
		driver.findElement(txtxuname).sendKeys(username);
		driver.findElement(txtpwd).sendKeys(password);
		WebElement log = driver.findElement(btnlogin);
		Commonfunctions.clicked(log);
		LogUtil.log.info("succesfully login");
		Thread.sleep(3000);
		Screenshot.infoScreenshot(driver, "After login screenshot");

	}

	public static void logout() throws Exception {
		System.out.println("inside logout method");
		WebElement lout = driver.findElement(btnlogout);
		Thread.sleep(2000);
		Commonfunctions.clicked(lout);
		WebElement lout1 = driver.findElement(lnklogout);
		Commonfunctions.clicked(lout1);
		Thread.sleep(2000);
	}
}
