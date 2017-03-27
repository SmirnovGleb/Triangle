package by.epam.newauction.creator;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.newauction.entity.Bidder;


public class BidderCreator {
	private static Logger logger = LogManager.getLogger(BidderCreator.class);
	private static final String EXPECTED_CLASS_NAME = "bidder";
	private static final int EXPECTED_PARAMETERS = 2;
	
	public static Bidder createBidder(String str){
		Bidder bidder = null;
		String[] parameters = str.split("\\s+");
		if(str != null && parameters[0].equals(EXPECTED_CLASS_NAME) && parameters.length == EXPECTED_PARAMETERS){
			try {	
				BigDecimal money = new BigDecimal(parameters[1]);
				bidder = new Bidder(money);
			} catch (NumberFormatException e) {
				logger.log(Level.ERROR,"NumberFormatException",e);
			}	
		}
		return bidder;
	}
	
	public static ArrayList<Bidder> createBidders(ArrayList<String> list){
		ArrayList<Bidder> listBidders = new ArrayList<>();
		for(String currentString : list){
			listBidders.add(createBidder(currentString));
		}
		if(listBidders.isEmpty()){
			logger.log(Level.ERROR,"there are not bidders");	
		}
		return listBidders;
	}
}
