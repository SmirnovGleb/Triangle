package test.by.epam.newtriangle.suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.by.epam.newtriangle.creator.TestTriangleCreator;
import test.by.epam.newtriangle.logic.TestTriangleLogic;
import test.by.epam.newtriangle.parser.TestTriangleParser;
import test.by.epam.newtriangle.reader.TestTxtReader;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestTriangleCreator.class,TestTriangleLogic.class,TestTriangleParser.class,TestTxtReader.class})
public class TriangleTest {
	
}
