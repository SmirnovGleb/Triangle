package test.by.epam.itcompany.factory;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.entity.Manager;
import by.epam.itcompany.entity.ManagerSpeciality;
import by.epam.itcompany.exception.EmployeeException;
import by.epam.itcompany.factory.EmployeeCreator;
import by.epam.itcompany.parser.EmployeeParameters;



public class TestEmployeeCreator {
	private static EmployeeParameters firstParameters;
	private static EmployeeParameters badParameters;
	private static Employee expectedEmployee;
	@BeforeClass
	public static void initParameters(){
		firstParameters = new EmployeeParameters("Pamela", "Anderson", 1300, 30, "manager", "pr");
		badParameters = new EmployeeParameters("morda","levaya",3,60,"asd","pr");
		expectedEmployee = new Manager("Pamela","Anderson",1300,30,ManagerSpeciality.PR);
	}
	
	@Test
	public void testCreateEmployee(){
		boolean testCreate = false;
		try {
			testCreate = expectedEmployee.equals(new EmployeeCreator().createEmployee(firstParameters));
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(testCreate);
	}
	
	@Test(expected = EmployeeException.class)
    public void testFileReaderException() throws EmployeeException {
		new EmployeeCreator().createEmployee(badParameters);
    }
	
	
	@AfterClass
	public static void destroyParameters(){
		firstParameters = null;
		badParameters = null;
		expectedEmployee = null;
	}
}
