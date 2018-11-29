package com.FileReader;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONDataprovider {
	
	public static  JSONObject getDataFile(String dataFileName) {
	    String dataFilePath = "src/test/resources/";
	    JSONObject testObject = null; 

	    try {
	        FileReader reader = new FileReader(dataFilePath + dataFileName);                        
	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
	        testObject = (JSONObject) jsonObject;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return testObject;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
 