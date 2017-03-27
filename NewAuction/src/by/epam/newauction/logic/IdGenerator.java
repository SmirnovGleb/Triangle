package by.epam.newauction.logic;

public class IdGenerator {
	private static int value;
	public static int generateId(){		
		return value++;
	}
}