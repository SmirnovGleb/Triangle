package by.epam.newtriangle.entity;

import java.util.ArrayList;
import java.util.Iterator;

import by.epam.newtriangle.logic.IdGenerator;
import by.epam.newtriangle.observer.OperationObserver;


public class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;
	private final int ID;
	private ArrayList<OperationObserver> observerList = new ArrayList<OperationObserver>();
	
	
	
	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.ID = IdGenerator.getId();
	}
	
	public void addObserver(OperationObserver observer) {
		observerList.add(observer);
		}
	
	private void notifyObservers() {
		Iterator it = observerList.iterator();
		while (it.hasNext()) {
		((OperationObserver) it.next()).valueChanged(this);
		}
		}
	
	public int getId() {
		return ID;
	}
	
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
		notifyObservers();
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
		notifyObservers();
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
		notifyObservers();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((point1 == null) ? 0 : point1.hashCode());
		result = prime * result + ((point2 == null) ? 0 : point2.hashCode());
		result = prime * result + ((point3 == null) ? 0 : point3.hashCode());
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
		Triangle other = (Triangle) obj;
		if (point1 == null) {
			if (other.point1 != null)
				return false;
		} else if (!point1.equals(other.point1))
			return false;
		if (point2 == null) {
			if (other.point2 != null)
				return false;
		} else if (!point2.equals(other.point2))
			return false;
		if (point3 == null) {
			if (other.point3 != null)
				return false;
		} else if (!point3.equals(other.point3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [point1=" + point1 + ", point2=" + point2
				+ ", point3=" + point3 + ", id=" + ID + "]";
	}
	
	
	
	
}
