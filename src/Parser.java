//Brandon Forster, Robert Millward,
//Matt Bald
//COP 3503 Extra Credit Assignment
//National Gross Domestic Product Per Capita Analyzer
//3 December 2012
//Parsing the XML file

import java.io.*;
import java.util.*;

public class Parser {
	
	final static int NUMBER_OF_YEARS = 36;

	public Parser(String filename) throws FileNotFoundException
	{
		File xlsFile = new File(filename);
		
		//this method call throws the FileNotFound
		Scanner xlIn = new Scanner(xlsFile);
		
		//eat the first line of input until we get to the main input
		xlIn.nextLine();
		
		//TODO uncomment this
		//start reading in the whole input
		//while (xlIn.hasNext() == true)
		{
			int weoCountryCode = xlIn.nextInt();
			String ISO= xlIn.next();
			String weoSubjectCode = xlIn.next();
			String country = xlIn.next();
			
			//skip through all the descriptive text
			while (xlIn.next().compareTo("n/a") != 0) {}
			
			//count the number of "n/a" years we need to skip
			int skipCount = 0;
			
			//save the value of the last token we check in the loop
			String currentToken;
			
			while (true)
			{
				currentToken = xlIn.next();
				
				//a year does not have data
				if (currentToken.compareTo("n/a") == 0)
					skipCount++;
				
				//we found the first data
				else
					break;
			}
			
			//create an array to hold the data
			double values[] = new double[NUMBER_OF_YEARS];
			for (int i = 0; i < NUMBER_OF_YEARS; i++)
			{
				//if this year was skipped above, skip data entry
				if (i< skipCount)
					continue;
				
				else
				{
					values[i] = xlIn.nextDouble();
				}
			}
			
			int estStartYear = xlIn.nextInt();
		}
		
		xlIn.close();
	}
	
	//TODO remove this main, it is for debugging
	public static void main(String[] args)
	{
		try {
			new Parser("WEOOct2012all.xls");
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}
