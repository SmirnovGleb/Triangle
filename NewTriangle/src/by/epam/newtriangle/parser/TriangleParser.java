package by.epam.newtriangle.parser;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TriangleParser {
	
	private static Logger logger = LogManager.getLogger(TriangleParser.class);
	private static final int MAX_DOTS = 6;
	
	public static ArrayList<Double[]> parseToDots(ArrayList<String>list){
		ArrayList<Double[]> dotList = new ArrayList<Double[]>();
		for(String g : list){
			Double[] dotsForTriangle = new Double[MAX_DOTS];
			String[] dots = g.split("\\s+");
			int nullCounter = 0;
			if(dots.length==MAX_DOTS){
				for(int i = 0;i<MAX_DOTS;i++){
					try {
						dotsForTriangle[i] = Double.parseDouble(dots[i]);
					} catch (NumberFormatException e) {
						logger.log(Level.ERROR,"NumberFormatException",e);
					}
					if(dotsForTriangle[i]==null){
						nullCounter++;
					}
				}
				if(nullCounter==0){
					dotList.add(dotsForTriangle);
				}
				nullCounter = 0;
			}
		}
		return dotList;
	}
}
