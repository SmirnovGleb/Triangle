package by.epam.itcompany.comparator;

import java.util.Comparator;

import by.epam.itcompany.entity.Employee;

public class EarnComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getEarnsPerHour() - employee2.getEarnsPerHour();
	}

}
