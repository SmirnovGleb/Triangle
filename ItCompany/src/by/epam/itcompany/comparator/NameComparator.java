package by.epam.itcompany.comparator;

import java.util.Comparator;

import by.epam.itcompany.entity.Employee;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getName().compareTo(employee2.getName());
	}

}
