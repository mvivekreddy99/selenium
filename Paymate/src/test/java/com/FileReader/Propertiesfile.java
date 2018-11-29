package com.FileReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.Utility.LogUtil;

public class Propertiesfile {
	public static Properties prop;
	//public static String filepath = ".src/Resources/java/Other Files/config.properties";
	//public static String filepath = "F:/vivek automation/New folder/Paymate/src/Resources/java/Other Files/config.properties";

	public static void propertiesload() {
		
		try {
			LogUtil.log.info("Xml file method is executed");
			String filepath = "./src/Resources/java/Other Files/config.properties";
			prop = new Properties();
			File xmlFile = new File(filepath);
			System.out.println(xmlFile);
			FileInputStream fis = new FileInputStream(xmlFile);
			System.out.println("loaded");
			prop.load(fis);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
