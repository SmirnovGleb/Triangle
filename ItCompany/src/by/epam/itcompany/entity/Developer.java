package by.epam.itcompany.entity;

public class Developer extends Employee {
	private DeveloperSpeciality speciality;

	public Developer(String name, String surname, int earnsPerHour,
			int hoursWork, DeveloperSpeciality spec) {
		super(name, surname, earnsPerHour, hoursWork);
		this.speciality = spec;
	}

	public DeveloperSpeciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(DeveloperSpeciality speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Developer [speciality=" + speciality + "]"+super.toString();
	}

	

	
	
}
