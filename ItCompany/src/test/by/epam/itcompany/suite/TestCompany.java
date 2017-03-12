package test.by.epam.itcompany.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.by.epam.itcompany.factory.TestEmployeeCreator;
import test.by.epam.itcompany.logic.TestCompanyLogic;
import test.by.epam.itcompany.parser.TestEmployeeParser;
import test.by.epam.itcompany.reader.TestTextReader;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestEmployeeCreator.class, TestCompanyLogic.class, TestEmployeeParser.class, TestTextReader.class})
public class TestCompany {
	
}
