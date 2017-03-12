package by.epam.itcompany.factory;

import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.parser.EmployeeParameters;

public abstract class AbstractEmployeeFactory {
	public abstract Employee createEmployee(EmployeeParameters parameters);
}
