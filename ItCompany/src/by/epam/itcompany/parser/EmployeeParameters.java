package by.epam.itcompany.parser;

public class EmployeeParameters {
	private String name;
	private String surname;
	private int earnsPerHour;
	private int hoursWork;
	private String kindEmployee;
	private String speciality;
	
	
	
	public EmployeeParameters(String name, String surname, int earnsPerHour,
			int hoursWork, String kindEmployee, String speciality) {
		super();
		this.name = name;
		this.surname = surname;
		this.earnsPerHour = earnsPerHour;
		this.hoursWork = hoursWork;
		this.kindEmployee = kindEmployee;
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getEarnsPerHour() {
		return earnsPerHour;
	}
	public void setEarnsPerHour(int earnsPerHour) {
		this.earnsPerHour = earnsPerHour;
	}
	public int getHoursWork() {
		return hoursWork;
	}
	public void setHoursWork(int hoursWork) {
		this.hoursWork = hoursWork;
	}	
	public String getKindEmployee() {
		return kindEmployee;
	}
	public void setKindEmployee(String kindEmployee) {
		this.kindEmployee = kindEmployee;
	}

	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
}
