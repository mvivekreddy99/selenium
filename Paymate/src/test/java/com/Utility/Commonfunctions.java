package com.Utility;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Commonfunctions extends Browser {
	Properties prop = new Properties();

	public static void clicked(WebElement we) {
		we.click();
	}

	public static void senddata(WebElement sd) {

	}

	public static void MouseOver(WebElement we) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(we).build().perform();
	}

	// select the dropdown using "select by visible text", so pass VisibleText as 'Yellow' to funtion
	public static void selectbyvisibletext(WebElement WE, String VisibleText) {
		Select selObj = new Select(WE);
		selObj.selectByVisibleText(VisibleText);
	}

	// select the dropdown using "select by index", so pass IndexValue as '2'
	public static void Selectbyindex(WebElement WE, int IndexValue) {
		Select selObj = new Select(WE);
		selObj.selectByIndex(IndexValue);
	}

	// select the dropdown using "select by value", so pass Value as'thirdcolor'
	public static void Selectbyvalue(WebElement WE, String Value) {
		Select selObj = new Select(WE);
		selObj.selectByValue(Value);
	}

}
