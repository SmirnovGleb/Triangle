package by.epam.itcompany.entity;

public class Manager extends Employee{
	private ManagerSpeciality speciality;

	public Manager(String name, String surname, int earnsPerHour,
			int hoursWork, ManagerSpeciality spec) {
		super(name, surname, earnsPerHour, hoursWork);
		this.speciality = spec;
	}

	public ManagerSpeciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(ManagerSpeciality speciality) {
		this.speciality = speciality;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + super.getEarnsPerHour();
		result = prime * result + getHoursWork();
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getSurname() == null) ? 0 : getSurname().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (getEarnsPerHour() != other.getEarnsPerHour())
			return false;
		if (getHoursWork() != other.getHoursWork())
			return false;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (getSurname() == null) {
			if (other.getSurname() != null)
				return false;
		} else if (!getSurname().equals(other.getSurname()))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Manager [speciality=" + speciality + "]"+super.toString();
	}

	

	

	
	
}
