package by.epam.itcompany.logic;

import java.util.ArrayList;

import by.epam.itcompany.entity.Company;
import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.exception.EmployeeException;

public class CompanyLogic {
	
	public static Employee findEmployee(int minEarn, int maxEarn, Company company) throws EmployeeException{
		ArrayList<Employee> list = company.getEmployees();
		Employee employee = null;
		for(Employee e : list){
			if(e.getEarnsPerHour()>minEarn && e.getEarnsPerHour()<maxEarn){
				employee = e;
			}
		}
		if(employee==null){
			throw new EmployeeException();
		}
		return employee;
	}
	
	public static int costPerHour (Company company){
		int cost = 0;
		for(Employee e: company.getEmployees()){
			cost=cost+e.getEarnsPerHour();
		}
		return cost;
	}
}
