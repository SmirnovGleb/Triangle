package by.epam.itcompany.comparator;

import java.util.Comparator;

import by.epam.itcompany.entity.Developer;



public class DeveloperSpecialityComparator implements Comparator<Developer>{

	@Override
	public int compare(Developer developer1, Developer developer2) {
		return developer1.getSpeciality().compareTo(developer2.getSpeciality());
	}
}
