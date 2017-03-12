package by.epam.itcompany.entity;

import by.epam.itcompany.logic.IdGenerator;

public abstract class Employee {
	private int id;
	private String name;
	private String surname;
	private int earnsPerHour;
	private int hoursWork;
	

	public Employee(String name, String surname, int earnsPerHour, int hoursWork) {
		super();
		this.name = name;
		this.surname = surname;
		this.earnsPerHour = earnsPerHour;
		this.hoursWork = hoursWork;
		this.id = IdGenerator.generateId();
	}
	
	public int getId() {
		return id;
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
	
	
	@Override
	public String toString() {
		return "Employee [ID=" + id + ", name=" + name + ", surname=" + surname
				+ ", earnsPerHour=" + earnsPerHour + ", hoursWork=" + hoursWork
				+ "]";
	}
	
	
}
