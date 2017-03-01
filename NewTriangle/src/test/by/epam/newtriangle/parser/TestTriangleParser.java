package test.by.epam.newtriangle.parser;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import by.epam.newtriangle.parser.TriangleParser;

public class TestTriangleParser {
	
	private static final String CORRECT_FIRST_STRING = "1.0 1.0 4.0 2.0 3.0 4.0";
	private static final String CORRECT_SECOND_STRING = "0.0 1.0 4.0 2.0 3.0 4.0";
	private static final String INCORRECT_FIRST_STRING = "qe 2.0 0.0   8.t er ";	
	private static final String INCORRECT_SECOND_STRING  = "0.0 1.0 4.0 2.0 3.0 4.0 0.0 1.0 4.0 2.0 3.0 4.0";
	private static final int THERE_ARE_TWO_ARRAYS_AFTER_ADD = 2;
	
	
	@Test
	public void testParseToDots(){
		ArrayList<String> strList = new ArrayList<String>();
		strList.add(CORRECT_FIRST_STRING);
		strList.add(INCORRECT_FIRST_STRING);
		strList.add(INCORRECT_SECOND_STRING);
		strList.add(CORRECT_SECOND_STRING);
		
		ArrayList<Double[]> parsList=null;
		
		parsList = TriangleParser.parseToDots(strList);

		Assert.assertTrue(THERE_ARE_TWO_ARRAYS_AFTER_ADD == parsList.size());
	}

}
