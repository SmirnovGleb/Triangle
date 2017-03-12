package test.by.epam.itcompany.parser;



import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.epam.itcompany.parser.EmployeeParameters;
import by.epam.itcompany.parser.EmployeeParser;
import by.epam.itcompany.reader.TextReader;

public class TestEmployeeParser {
	private static ArrayList<String> dataEmployee;
	private static final int EXPECTED_EMPLOYEES = 27;
	
	@BeforeClass
	public static void initParameters(){
		dataEmployee = TextReader.readText();
	}
	
	@Test
	public void testEmployeeParser(){
		ArrayList<EmployeeParameters> list = EmployeeParser.parseToParameters(dataEmployee);
		Assert.assertTrue(list.size()==EXPECTED_EMPLOYEES);
	}
	
	@Test(expected = RuntimeException.class)
    public void testFileReaderException() throws RuntimeException {
		ArrayList<String> BadData = null;
		EmployeeParser.parseToParameters(BadData);
    }
	
	@AfterClass
	public static void destroyData(){
		dataEmployee = null;
	}
}
