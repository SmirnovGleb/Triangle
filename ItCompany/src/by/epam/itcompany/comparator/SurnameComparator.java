package by.epam.itcompany.comparator;

import java.util.Comparator;

import by.epam.itcompany.entity.Employee;

public class SurnameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getSurname().compareTo(employee2.getSurname());
	}

}

