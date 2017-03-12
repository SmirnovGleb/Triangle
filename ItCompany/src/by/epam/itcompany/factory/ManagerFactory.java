package by.epam.itcompany.factory;

import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.entity.Manager;
import by.epam.itcompany.entity.ManagerSpeciality;
import by.epam.itcompany.parser.EmployeeParameters;

public class ManagerFactory extends AbstractEmployeeFactory {

	@Override
	public Employee createEmployee(EmployeeParameters parameters) {

		return new Manager(parameters.getName(),parameters.getSurname(),parameters.getEarnsPerHour(),parameters.getHoursWork(), ManagerSpeciality.valueOf(parameters.getSpeciality().toUpperCase()) );
	}

	
}
