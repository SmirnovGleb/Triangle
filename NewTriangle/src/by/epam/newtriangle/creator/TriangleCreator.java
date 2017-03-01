package by.epam.newtriangle.creator;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.newtriangle.entity.Point;
import by.epam.newtriangle.entity.Triangle;



public class TriangleCreator {
	private static Logger logger = LogManager.getLogger(TriangleCreator.class);
	
	private static final int FIRST_DOT_X = 0;
	private static final int FIRST_DOT_Y = 1;
	private static final int SECOND_DOT_X = 2;
	private static final int SECOND_DOT_Y = 3;
	private static final int THIRD_DOT_X = 4;
	private static final int THIRD_DOT_Y = 5;
	
	public static ArrayList<Triangle> makeTriangle(ArrayList<Double[]> dots){
		
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		for(int i = 0;i<dots.size();i++){
			
			double dot1x = dots.get(i)[FIRST_DOT_X];
			double dot1y = dots.get(i)[FIRST_DOT_Y];
			double dot2x = dots.get(i)[SECOND_DOT_X];
			double dot2y = dots.get(i)[SECOND_DOT_Y];
			double dot3x = dots.get(i)[THIRD_DOT_X];
			double dot3y = dots.get(i)[THIRD_DOT_Y];
			
			double lineA = Math.hypot(dot1x - dot2x, dot1y - dot2y);
	        double lineB = Math.hypot(dot1x - dot3x, dot1y - dot3y);
	        double lineC = Math.hypot(dot2x - dot3x, dot2y - dot3y);
	    
	        
	        if (lineA + lineB <= lineC || lineA + lineC <= lineB || lineA + lineC <= lineB){
	        	logger.log(Level.WARN,"Triangle is not created");
	        }
	           
	        else
	        {
	        	Triangle newTriangle = new Triangle(new Point(dot1x,dot1y),new Point(dot2x,dot2y),new Point(dot3x,dot3y));
	            triangles.add(newTriangle);
	            logger.log(Level.INFO,"Triangle is created");
	        }            
		}
		
		return triangles;
	}
}
