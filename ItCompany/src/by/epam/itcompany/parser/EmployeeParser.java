package by.epam.itcompany.parser;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class EmployeeParser {
	
	private static Logger logger = LogManager.getLogger(EmployeeParser.class);
	private static final int MAX_PARAMETERS = 6;
	
	public static ArrayList<EmployeeParameters> parseToParameters(ArrayList<String>list){
		ArrayList<EmployeeParameters> paramList = new ArrayList<>();
		for(String g : list){
			String[] currentParam = g.split("\\s+");
			if(currentParam.length == MAX_PARAMETERS){
				EmployeeParameters parameters = null;
				try {
					String currentName = currentParam[0];
					String currentSurname = currentParam[1];
					int currentEarnsPerHour = Integer.parseInt(currentParam[2]);
					int currentHoursWork = Integer.parseInt(currentParam[3]);
					String currentKindEmployee = currentParam[4];
					String currentSpeciality = currentParam[5];
					parameters = new EmployeeParameters(currentName, currentSurname, currentEarnsPerHour, currentHoursWork, currentKindEmployee, currentSpeciality);
				} catch (NumberFormatException e) {
					logger.log(Level.ERROR,"NumberFormatException",e);
				}
				paramList.add(parameters);
			}
		}
		if(paramList.size()==0){
			logger.log(Level.FATAL,"there are no parameters");
			throw new RuntimeException();
		}
		return paramList;
	}
}

