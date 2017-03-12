package by.epam.itcompany.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TextReader {
	private static Logger logger = LogManager.getLogger(TextReader.class);
	
	private static final String DEFAULT_FILE_PATH = "data/employees.txt";

	public static ArrayList<String> readText(String... path){
		String currentPath = DEFAULT_FILE_PATH;
		if(path.length == 1){
			currentPath = path[0];
		}
		
		ArrayList<String> list = new ArrayList<String>();
		try(Scanner s = new Scanner(new File(currentPath))) {				
			while (s.hasNextLine()){
	            list.add(s.nextLine());
	        }
			
		} catch (FileNotFoundException e) {
			logger.log(Level.FATAL,"File isn't here "+path, e);
			throw new RuntimeException();
		}
		
		return list;
	}
}
