package by.epam.itcompany.factory;

import by.epam.itcompany.entity.Developer;
import by.epam.itcompany.entity.DeveloperSpeciality;
import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.parser.EmployeeParameters;


public class DeveloperFactory extends AbstractEmployeeFactory {

	@Override
	public Employee createEmployee(EmployeeParameters parameters) {

		return new Developer(parameters.getName(),parameters.getSurname(),parameters.getEarnsPerHour(),parameters.getHoursWork(), DeveloperSpeciality.valueOf(parameters.getSpeciality().toUpperCase()));
	}

	
}