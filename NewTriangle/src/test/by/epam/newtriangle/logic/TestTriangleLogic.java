package test.by.epam.newtriangle.logic;


import org.junit.Assert;
import org.junit.Test;

import by.epam.newtriangle.entity.Point;
import by.epam.newtriangle.entity.Triangle;
import by.epam.newtriangle.logic.TriangleLogic;

public class TestTriangleLogic {
	
	@Test
	public void testAreaOfTheTriangle(){
		double expected = 12.0;
		double d1 = TriangleLogic.areaOfTheTriangle(new Triangle(new Point(5.0,1.0),new Point(1.0,1.0),new Point(1.0,7.0)));
		Assert.assertEquals(d1,expected,0.001);		
	}
	
	@Test
	public void testPerimeterOfTheTriangle(){		
		double expected = 17.211;
		double d1 = TriangleLogic.perimeterOfTheTriangle(new Triangle(new Point(5.0,1.0),new Point(1.0,1.0),new Point(1.0,7.0)));
		Assert.assertEquals(d1,expected,0.001);
		
	}
	
}
