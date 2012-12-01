//Brandon Forster, Robert Millward,
//Matt Head
//COP 3503 Extra Credit Assignment
//Huffman Encoding and Decoding
//3 December 2012
//Parsing the XML file

import java.io.*;
import java.util.*;

public class Parser {

	public Parser(String filename) throws FileNotFoundException
	{
		File xlsFile = new File(filename);
		
		//this method call throws the FileNotFound
		Scanner xlIn = new Scanner(xlsFile);
		
		//eat the first line of input until we get to the main input
		xlIn.nextLine();
		
		//start reading in the whole input
		while (xlIn.hasNext() == true)
		{
			
		}
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
