package by.epam.itcompany.factory;

import by.epam.itcompany.entity.Designer;
import by.epam.itcompany.entity.DesignerSpeciality;
import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.parser.EmployeeParameters;

public class DesignerFactory extends AbstractEmployeeFactory {

	@Override
	public Employee createEmployee(EmployeeParameters parameters) {

		return new Designer(parameters.getName(),parameters.getSurname(),parameters.getEarnsPerHour(),parameters.getHoursWork(), DesignerSpeciality.valueOf(parameters.getSpeciality().toUpperCase()));
	}

	
}