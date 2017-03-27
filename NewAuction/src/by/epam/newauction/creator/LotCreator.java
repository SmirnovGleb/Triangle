package by.epam.newauction.creator;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.newauction.entity.Lot;

public class LotCreator {
	private static Logger logger = LogManager.getLogger(LotCreator.class);
	private static final String EXPECTED_CLASS_NAME = "lot";
	private static final int EXPECTED_PARAMETERS = 3;
	
	public static Lot createLot(String str){
		Lot lot = null;
		String[] parameters = str.split("\\s+");
		if(str != null && parameters[0].equals(EXPECTED_CLASS_NAME) && parameters.length == EXPECTED_PARAMETERS){
			BigDecimal price = new BigDecimal(parameters[2]);
			lot = new Lot(parameters[1],price);
		}
		return lot;
	}
	
	public static ArrayList<Lot> createLots(ArrayList<String> list){
		ArrayList<Lot> listLots = new ArrayList<>();
		for(String currentString : list){
			if(createLot(currentString) != null){
				listLots.add(createLot(currentString));
			}
		}
		if(listLots.isEmpty()){
			logger.log(Level.ERROR,"there are not bidders");
		}
		return listLots;
	}
}
