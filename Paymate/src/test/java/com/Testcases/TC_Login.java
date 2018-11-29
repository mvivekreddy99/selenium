package com.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FileReader.ExcelDataprovider;
import com.Pages.Loginpage;
import com.Utility.Browser;

public class TC_Login extends Browser {

	@DataProvider
	public static Object[][] getdata() throws Exception{
		return ExcelDataprovider.excelReader("./src/Resources/java/Test Data/Paymatetest.xlsx", "Login");
		
	}
	@BeforeClass
	public static void browsersetup() throws Exception {
		init();
		System.out.println("browser setup method");
	}

	@Test(dataProvider="getdata")
	public static void loginmethod(String Username,String Password) throws Exception {
		Loginpage.login(Username, Password);
		System.out.println("login mthod is executing");
		Loginpage.logout();
		System.out.println("logout method is executed" );
}
	
	@AfterClass
	public static void browserclose() {
		System.out.println("closing browser");
		closebrowser();
	}

}
