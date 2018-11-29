package com.Utility;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport extends Browser {
	public static ExtentTest logger;
	public static ExtentTest logger2;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent = new ExtentReports();

	/*
	 * public static void extentreport(Method Result) throws Exception {
	 * System.out.println("extentreport method"); // start reporters
	 * htmlReporter = new
	 * ExtentHtmlReporter("./ExecutionReports/AutomationReport.html");
	 * 
	 * // create ExtentReports and attach reporter(s)
	 * 
	 * extent.attachReporter(htmlReporter);
	 * 
	 * // creates a toggle for the given test, adds all log events under it
	 * logger=extent.createTest(Result.getName()); logger.log(Status.INFO,
	 * "logged in succesfully");
	 * 
	 * 
	 * }
	 */
	public static void extentreport() throws Exception {
		System.out.println("extentreport method");
		// start reporters
		htmlReporter = new ExtentHtmlReporter("./ExecutionReports/AutomationReport.html");
		// create ExtentReports and attach reporter(s)

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Vivek");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Java Version", "1.8.0_121");
		extent.setSystemInfo("Environment", "Automation Testing");

		// creates a toggle for the given test, adds all log events under it
		logger = extent.createTest("Sample test");
		logger.log(Status.INFO, "logged in succesfully");

	}

	public void getresult(ITestResult result) throws IOException {
		System.out.println("getresult method");
		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, result.getMethod().getMethodName() + " test is pass");
		} else if (result.getStatus() == ITestResult.SKIP) {

			logger.log(Status.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.ERROR, result.getName() + " test is failed" + result.getThrowable());
			TakesScreenshot ts = (TakesScreenshot) driver;
			String source = ts.getScreenshotAs(OutputType.BASE64);
			logger.log(Status.INFO, (Markup) MediaEntityBuilder.createScreenCaptureFromPath(source).build());
		} else if (result.getStatus() == ITestResult.STARTED) {
			logger.log(Status.INFO, result.getName() + " test is started in ");
		}

	}

	public static void closereport() {
		System.out.println("close report method");
		extent.flush();
	}

}
