package test.by.epam.newtriangle.reader;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import by.epam.newtriangle.reader.TxtReader;

public class TestTxtReader {
	@Test
	public void testReadTxt(){
		ArrayList<String> listData = TxtReader.readTxt();
		Assert.assertTrue(listData.size()>0);
	}
}
