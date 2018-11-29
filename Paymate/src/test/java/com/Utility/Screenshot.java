package com.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Screenshot extends Browser {

	public static void infoScreenshot(WebDriver driver, String screenShotInfo) throws Exception {
		System.out.println(screenShotInfo);
		TakesScreenshot ts = (TakesScreenshot) driver;
		// File source = ts.getScreenshotAs(OutputType.FILE);
		String source = ts.getScreenshotAs(OutputType.BASE64);
		File file = OutputType.FILE.convertFromBase64Png(source);
		String destination = "./ExecutionReports/Screenshots/" + screenShotInfo + timestamp() + ".png";
		System.out.println("Source is:" + source);
		FileUtils.copyFile(file, new File(destination), true);
		Thread.sleep(5000);

		ExtentReport.logger.log(Status.INFO, "", MediaEntityBuilder.createScreenCaptureFromPath("/Vivek/ExecutionReports/Screenshots/" + screenShotInfo + timestamp() + ".png").build());

	}

	public static String timestamp() {
		return new SimpleDateFormat("dd MMMM yyyy HH-mm-ss").format(new Date());
	}

}
