package test.by.epam.newtriangle.creator;

import java.util.ArrayList;









import org.junit.Assert;
import org.junit.Test;

import by.epam.newtriangle.creator.TriangleCreator;
import by.epam.newtriangle.entity.Point;
import by.epam.newtriangle.entity.Triangle;

public class TestTriangleCreator {
	
	private final static Double[] ALL_DOTS_IN_ONE_PLACE = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
	private final static Double[] ALL_DOTS_ON_ONE_LINE = {1.0, 1.0, 1.0, 2.0, 1.0, 3.0};
	private final static Double[] RIGHT_TRIANGLE_DOTS = {1.0, 1.0, 3.0, 1.0, 1.0, 3.0};
	private final static double IT_IS_RIGHT_TRIANGLE_IF_THE_NUMBER_IS = 0.0;
	private final static int THE_COLLECTION_IS_EMPETY = 0;
	
	@Test
	public void testTriangeCreator(){
		
		Triangle expected = new Triangle(
				new Point(RIGHT_TRIANGLE_DOTS[0],RIGHT_TRIANGLE_DOTS[1]),
				new Point(RIGHT_TRIANGLE_DOTS[2],RIGHT_TRIANGLE_DOTS[3]),
				new Point(RIGHT_TRIANGLE_DOTS[4],RIGHT_TRIANGLE_DOTS[5]));
		
		ArrayList<Double[]> testList = new ArrayList<>();
		testList.add(RIGHT_TRIANGLE_DOTS);
		
		Triangle check = TriangleCreator.makeTriangle(testList).get(0);
		
		Assert.assertTrue(expected.equals(check));
	
	}
	
	@Test
	public void testMakeTriangleIfdotsIsSame(){
		
		ArrayList<Double[]> listDots= new ArrayList<Double[]>();
		listDots.add(ALL_DOTS_IN_ONE_PLACE);
		ArrayList<Triangle> makeTriangle = TriangleCreator.makeTriangle(listDots);
		Assert.assertTrue(makeTriangle.size()==THE_COLLECTION_IS_EMPETY);
	
		}
	
	
	@Test
	public void testMakeTriangleIfdotsIsLine(){
		
		ArrayList<Double[]> listDots= new ArrayList<Double[]>();
		listDots.add(ALL_DOTS_ON_ONE_LINE);
		ArrayList<Triangle> makeTriangle = TriangleCreator.makeTriangle(listDots);
		Assert.assertTrue(makeTriangle.size()==THE_COLLECTION_IS_EMPETY);
		
	}
	
	@Test
	public void testRightTriangle(){
		
		double vx1 = RIGHT_TRIANGLE_DOTS[2] - RIGHT_TRIANGLE_DOTS[0];
		double vy1 = RIGHT_TRIANGLE_DOTS[3] - RIGHT_TRIANGLE_DOTS[1];

		double vx2 = RIGHT_TRIANGLE_DOTS[4] - RIGHT_TRIANGLE_DOTS[0];
		double vy2 = RIGHT_TRIANGLE_DOTS[5] - RIGHT_TRIANGLE_DOTS[1];

		double dotProduct = vx1*vx2 + vy1*vy2;
		
		Assert.assertTrue(IT_IS_RIGHT_TRIANGLE_IF_THE_NUMBER_IS == dotProduct);
	
	}
	
	
}
