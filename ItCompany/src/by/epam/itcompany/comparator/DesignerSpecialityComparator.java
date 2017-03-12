package by.epam.itcompany.comparator;

import java.util.Comparator;

import by.epam.itcompany.entity.Designer;


public class DesignerSpecialityComparator implements Comparator<Designer>{

	@Override
	public int compare(Designer designer1, Designer designer2) {
		return designer1.getSpeciality().compareTo(designer2.getSpeciality());
	}
}
