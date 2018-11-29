/*package com.FileReader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Csvdata {
	static Reader reader;
	static FileInputStream file;
	static CSVReader csvreader;
	static Object[] data;

	public static Object[] csvreader(String filepath) throws Exception {

		reader = new FileReader(filepath);
		csvreader = new CSVReader(reader);
		
		//Skipping the header 
		csvreader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		// this will load content into list
		List<String[]> rows = csvreader.readAll();
		System.out.println("Total rows which we have is " + rows.size());

		// create Iterator reference
		Iterator<String[]> i1 = rows.iterator();

		// Iterate all values
		while (i1.hasNext()) {

			String[] column = i1.next();

			System.out.println(column.length);

			for (int i = 0; i < column.length; i++)

			{
				// Object[] data=Object[column[i]];
				data = new Object[][];

				System.out.println(data);
			}
			System.out.println("   ");

		}
		return data;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public static void csve() throws Exception {
		csvreader("./src/Resources/java/Test Data/Csvpaymate.csv");

	}

}
*/