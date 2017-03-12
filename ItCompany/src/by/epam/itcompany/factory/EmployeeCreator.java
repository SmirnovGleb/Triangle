package by.epam.itcompany.factory;

import java.util.ArrayList;

import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.exception.EmployeeException;
import by.epam.itcompany.parser.EmployeeParameters;

public class EmployeeCreator {
	
	public Employee createEmployee(EmployeeParameters param) throws EmployeeException{
		String currentEmployee = param.getKindEmployee();
		Employee employee = null;
		switch (currentEmployee.toLowerCase()){
		case "developer":
			employee = new DeveloperFactory().createEmployee(param);
			break;
		case "designer":
			employee = new DesignerFactory().createEmployee(param);
			break;
		case "manager":
			employee = new ManagerFactory().createEmployee(param);
			break;
		default:
			throw new EmployeeException("Bad parameters");	
		}
		return employee;	
	}
	
	public ArrayList<Employee> createListEmploee(ArrayList<EmployeeParameters> list) throws EmployeeException{
		ArrayList<Employee> employeeList = new ArrayList<>();
		for(EmployeeParameters param : list){
			employeeList.add(createEmployee(param));
		}	
		return employeeList;		
	}
	
}
