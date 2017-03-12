package by.epam.itcompany.entity;

public class Designer extends Employee{
	private DesignerSpeciality speciality;

	public Designer(String name, String surname, int earnsPerHour,
			int hoursWork, DesignerSpeciality spec) {
		super(name, surname, earnsPerHour, hoursWork);
		this.speciality = spec;
	}

	public DesignerSpeciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(DesignerSpeciality speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Designer [speciality=" + speciality + "]"+super.toString();
	}

	

	

	
}
