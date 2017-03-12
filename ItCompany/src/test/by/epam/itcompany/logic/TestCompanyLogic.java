package test.by.epam.itcompany.logic;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.epam.itcompany.entity.Company;
import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.exception.EmployeeException;
import by.epam.itcompany.factory.EmployeeCreator;
import by.epam.itcompany.logic.CompanyLogic;
import by.epam.itcompany.parser.EmployeeParser;
import by.epam.itcompany.reader.TextReader;

public class TestCompanyLogic {
	
	private static Company company;
	
	@BeforeClass
	public static void initCompany(){
		company = new Company();
		try {
			company.setEmployees(new EmployeeCreator().createListEmploee(EmployeeParser.parseToParameters(TextReader.readText())));
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindEmployee(){
		String expectedEmployeesName = "Eric";
		Employee employee =null;
		try {
			employee = CompanyLogic.findEmployee(5, 10, company);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(expectedEmployeesName.equals(employee.getName()));
		
	}
	
	@Test(expected = EmployeeException.class)
    public void testFindEmployeeException() throws EmployeeException {
		CompanyLogic.findEmployee(1, 1, new Company());
    }
	
	@Test
	public void testCostPerHour(){
		int expectedCostPerHour = 231;
		Assert.assertTrue(CompanyLogic.costPerHour(company)==expectedCostPerHour);
		
	}
	
	@AfterClass
	public static void destroyCompany(){
		company = null;
	}
	
}
