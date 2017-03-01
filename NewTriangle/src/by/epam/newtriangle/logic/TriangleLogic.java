package by.epam.newtriangle.logic;

import by.epam.newtriangle.entity.Triangle;


public class TriangleLogic {
	
	public static double areaOfTheTriangle(Triangle triangle){
		double a = Math.hypot((triangle.getPoint1().getX() - triangle.getPoint2().getX()),(triangle.getPoint1().getY() - triangle.getPoint2().getY()));
		double b = Math.hypot((triangle.getPoint2().getX() - triangle.getPoint3().getX()),(triangle.getPoint2().getY() - triangle.getPoint3().getY()));
		double c = Math.hypot((triangle.getPoint3().getX() - triangle.getPoint1().getX()),(triangle.getPoint3().getY() - triangle.getPoint1().getY()));

		double p = (a + b + c) / 2.0;
		double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return square;
		
	}
	public static double perimeterOfTheTriangle(Triangle triangle){
		double a = Math.hypot((triangle.getPoint1().getX() - triangle.getPoint2().getX()),(triangle.getPoint1().getY() - triangle.getPoint2().getY()));
		double b = Math.hypot((triangle.getPoint2().getX() - triangle.getPoint3().getX()),(triangle.getPoint2().getY() - triangle.getPoint3().getY()));
		double c = Math.hypot((triangle.getPoint3().getX() - triangle.getPoint1().getX()),(triangle.getPoint3().getY() - triangle.getPoint1().getY()));
        
		double perimeter = a + b + c;
        
		return perimeter;
		
	}
}
