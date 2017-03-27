package by.epam.newauction.entity;

import java.math.BigDecimal;


public class Lot{
	private String name;
	private BigDecimal price;
	private Owner owner;
	
	public Lot(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
		owner= Auction.getInstance();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Lot [name=" + name + ", price=" + price + ", owner=" + owner
				+ "]";
	}
}
