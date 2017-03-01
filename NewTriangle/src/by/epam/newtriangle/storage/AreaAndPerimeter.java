package by.epam.newtriangle.storage;

public class AreaAndPerimeter {
	private double area;
	private double perimeter;
	
	public AreaAndPerimeter(double area, double perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "AreaAndPerimeter [area=" + area + ", perimeter=" + perimeter
				+ "]";
	}
	
	
}
