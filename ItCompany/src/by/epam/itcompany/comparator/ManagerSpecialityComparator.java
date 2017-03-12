package by.epam.itcompany.comparator;

import java.util.Comparator;

import by.epam.itcompany.entity.Manager;


public class ManagerSpecialityComparator implements Comparator<Manager>{

	@Override
	public int compare(Manager manager1, Manager manager2) {
		return manager1.getSpeciality().compareTo(manager2.getSpeciality());
	}
}
