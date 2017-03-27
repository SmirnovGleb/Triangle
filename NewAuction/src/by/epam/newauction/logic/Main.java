package by.epam.newauction.logic;

import java.util.ArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.newauction.creator.BidderCreator;
import by.epam.newauction.creator.LotCreator;
import by.epam.newauction.entity.Auction;
import by.epam.newauction.entity.Bidder;
import by.epam.newauction.entity.Lot;
import by.epam.newauction.reader.TextReader;


public class Main {
	private static final int THE_DURATION_OF_THE_AUCTION = 4000;
	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		Auction auction = Auction.getInstance();
		auction.setTimeDuration(THE_DURATION_OF_THE_AUCTION);
		auction.setCyclicBarrier(new CyclicBarrier(5,new Runnable(){
			@Override
			public void run() {
				logger.log(Level.INFO,"*** the end of the round ***");
				}
			}));
		
		auction.setBidderList(BidderCreator.createBidders(TextReader.readText()));
		auction.setLotList(LotCreator.createLots(TextReader.readText()));
		
		for(Bidder bidder : auction.getBidderList()){
			new Thread(bidder).start();
		}
		
		try {
			TimeUnit.MILLISECONDS.sleep(auction.getTimeDuration()+4000);
		} catch (InterruptedException e) {
			logger.log(Level.ERROR,e);
		}
		ArrayList<Lot> listLots= auction.getLotList();
		String owner = "";
		for(Lot l : listLots){
			owner = owner + l.getOwner() + " has bought " + l.getName() + "   ||   ";	
		}
		logger.log(Level.INFO,owner);
			
	}
}
