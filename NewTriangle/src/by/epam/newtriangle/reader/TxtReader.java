package by.epam.newtriangle.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class TxtReader {
	private static Logger logger = LogManager.getLogger(TxtReader.class);
	
	private static final String FILE_PATH = "data/input.txt";
	
	public static ArrayList<String> readTxt(){
		
        ArrayList<String> list = new ArrayList<String>();
		try(Scanner s = new Scanner(new File(FILE_PATH))) {				
			while (s.hasNextLine()){
	            list.add(s.nextLine());
	        }
			
		} catch (FileNotFoundException e) {
			logger.log(Level.FATAL,"File isn't here "+FILE_PATH, e);
			throw new RuntimeException();
		}
		
		return list;
	}
}
