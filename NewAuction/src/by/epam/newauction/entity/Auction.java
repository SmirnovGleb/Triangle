package by.epam.newauction.entity;

import java.util.ArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;



public class Auction implements Owner{
	private static final String NAME = "Auction";
	private static final int DEFAULT_NUMBER_OF_BIDDERS = 5;
	private int timeDuration;
	private ArrayList<Bidder> bidderList;
	private ArrayList<Lot> lotList;
	private CyclicBarrier cyclicBarrier;
	private static Auction instance;
	private static ReentrantLock instanceLock = new ReentrantLock();
	private static AtomicBoolean exist = new AtomicBoolean(false);
	
	private Auction() {
		super();
		cyclicBarrier = new CyclicBarrier(DEFAULT_NUMBER_OF_BIDDERS);
	}

	public static Auction getInstance(){
		if (!exist.get()) {
			instanceLock.lock();
			try {
				if (instance == null) {
					instance = new Auction();
					exist.set(true);
			    }
				} 
			finally {
				instanceLock.unlock();
				}
			}
		return instance;
	}

	public int getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(int timeDuration) {
		this.timeDuration = timeDuration;
	}

	public ArrayList<Bidder> getBidderList() {
		return bidderList;
	}

	public void setBidderList(ArrayList<Bidder> bidderList) {
		this.bidderList = bidderList;
	}

	public ArrayList<Lot> getLotList() {
		return lotList;
	}

	public void setLotList(ArrayList<Lot> lotList) {
		this.lotList = lotList;
	}

	public CyclicBarrier getCyclicBarrier() {
		return cyclicBarrier;
	}

	public void setCyclicBarrier(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public String toString() {
		return NAME;
	}
	
}
