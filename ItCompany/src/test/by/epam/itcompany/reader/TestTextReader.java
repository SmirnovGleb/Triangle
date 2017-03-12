package test.by.epam.itcompany.reader;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import by.epam.itcompany.reader.TextReader;



public class TestTextReader {

	@Test
	public void testReadText(){
		ArrayList<String> listData = TextReader.readText();
		Assert.assertTrue(listData.size()>0);
	}
	
	@Test
	public void testReadTextWithPath(){
		ArrayList<String> listData = TextReader.readText("data/employees.txt");
		Assert.assertTrue(listData.size()>0);
	}
	
	@Test(expected = RuntimeException.class)
    public void testFileReaderException() throws RuntimeException {
        String filename = "";
        TextReader.readText(filename);
    }
	
}
