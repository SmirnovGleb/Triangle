package by.epam.newauction.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.newauction.logic.IdGenerator;

public class Bidder implements Owner, Runnable{
	private int id;
	private BigDecimal money;
	private CyclicBarrier barrier;
	private static final int THINKING_TIME = 700;
	private static Logger logger = LogManager.getLogger(Bidder.class);
		
	public Bidder(BigDecimal money) {
		super();
		id = IdGenerator.generateId();
		this.money = money;
		barrier = Auction.getInstance().getCyclicBarrier();
	}
	public int getId() {
		return id;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	public boolean isInterested(){
		int random = new Random().nextInt(1000);
		return random <= 750;
	}
	
	public BigDecimal makeBet(){
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(THINKING_TIME));
		} catch (InterruptedException e) {
			logger.log(Level.ERROR,e);
		}
		return new BigDecimal(new Random().nextInt(money.divide(new BigDecimal(2)).intValue()));
	}
	@Override
	public void run() {
		Auction auction = Auction.getInstance();
		ArrayList<Lot> list = auction.getLotList();
		long  futureTime = System.currentTimeMillis() + auction.getTimeDuration();
		while(futureTime > System.currentTimeMillis()){
			for(Lot l : list){
				try {
					BigDecimal possibility = l.getPrice().add(makeBet());
					boolean interest = isInterested();
					if(interest && money.floatValue() >= possibility.floatValue()){
						money = money.subtract(possibility);
						l.setOwner(this);
						logger.log(Level.INFO,"bidder id = " + id+" make bid "+ money +" on the lot " + l.getName());
					}
					else{
						logger.log(Level.INFO,"bidder "+ id +" hasn't enough money!");
					}
					if(!interest){
						logger.log(Level.INFO, "bidder "+ id +" don't need it!");
					}
					barrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					logger.log(Level.ERROR,e);
				}
			}
		}
	}
	@Override
	public String toString() {
		return "Bidder id = " + id;
	}
	
}
