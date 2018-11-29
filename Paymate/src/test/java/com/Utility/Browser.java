package com.Utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.FileReader.Propertiesfile;

public class Browser extends Propertiesfile {
	public static Logger log = Logger.getLogger(Browser.class);
	public static WebDriver driver;
	public static String brow;

	// ----------Selecting the browser-------------------
	public static void Selectbrowser() throws Exception {
		brow = prop.getProperty("browser");
		System.out.println(brow);
		if (brow.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/Resources/java/Browser Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			log.info("firefox browser is launched");
			System.out.println("Browser launched");
		} else if (brow.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/Resources/java/Browser Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			log.info("chrome Browser launched");
			System.out.println("chrome Browser launched");
		} else if (brow.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/Resources/java/Browser Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			log.info("Edge Browser launched");
			System.out.println("Browser launched");
			
		} 
		
		else {
				//System.setProperty("webdriver.edge.driver", "./src/Resources/java/Browser Drivers/MicrosoftWebDriver.exe");
				driver = new SafariDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				log.info("Edge Browser launched");
				System.out.println("Browser launched");
	} 
			
			
		}
			
	

	// ------------Opening the URL
	public static void Openurl() throws Exception {
		driver.get(prop.getProperty("URL"));
		log.info("URl launched");
		System.out.println(driver.getTitle());
		// ExtentReport.extentreport(Method Result);

		// ExtentReport.logger.log(Status.INFO,"ExtentReport text");

	}

	// -----------Closing the browser
	public static void closebrowser() {
		// driver.close();
		log.info("browser Closed");
		ExtentReport.closereport();
	}

	public static void init() throws Exception {
		LogUtil.log4jload();
		propertiesload();
		Selectbrowser();
		Openurl();
		ExtentReport.extentreport();

	}
	/*
	 * @BeforeClass public static void extentreportstart(){
	 * 
	 * ExtentReport.extentreport(Result); }
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
