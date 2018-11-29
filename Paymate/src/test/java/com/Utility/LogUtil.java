package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class LogUtil {
	public static Logger log = Logger.getLogger(LogUtil.class);

	public static void log4jload() throws Exception {
		String log4jConfPath = "./src/Resources/java/Other Files/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

	}

	public void logxml() throws Exception {
		DOMConfigurator.configure("log4j.xml");

	}

}
