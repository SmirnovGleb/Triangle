package by.epam.itcompany.logic;

public class IdGenerator {
	private static int value;
	public static int generateId(){		
		return value++;
	}
}
