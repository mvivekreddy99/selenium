/*package com.FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CSVDataprovider {
	
	static Reader reader;
	static FileInputStream file;
	static CSVReader csvreader;
	static Object[][] data;
	static int[] column;
	static List<int[]> rows;
	public static void getdata(String filepath) throws Exception{
		
		reader = new FileReader(filepath);
		csvreader = new CSVReader(reader);
		
		//Skipping the header 
		csvreader = new CSVReaderBuilder(reader).withSkipLines(1).build();
		
		rows =(List<int[]>)csvreader.readAll();
		
		Iterator<String[]> i1 = rows.iterator();
		while (i1.hasNext()) {

			column = i1.next();

			//System.out.println(column.length);
		}
			data=new Object[rows][column];
		
		
		
		
		
		
		
		 
		
	}
	
	
	

}
*/