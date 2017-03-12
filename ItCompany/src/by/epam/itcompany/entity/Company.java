package by.epam.itcompany.entity;

import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employees = new ArrayList<>();

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public void deleteEmployee(Employee employee){
		employees.remove(employee);
	}
}
