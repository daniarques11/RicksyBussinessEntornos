package edu.elsmancs.crystalExpender;

import edu.elsmancs.creditCard.CreditCard;

public class CrystalExpender {

	private int stock;
	private double itemCost;
	
	public CrystalExpender(int stock, double itemCost) {
		this.stock = stock;
		this.itemCost = itemCost;
	}
	
	public double stock() {
		return this.stock;
	}
	
	public void dispatch(CreditCard user) {
		if (stock > 0) {
			if(user.pay(itemCost)) {
				stock--;
			}
		}
	}
	
	@Override
	public String toString() {
		return "stock: " + this.stock + "\ncost: " + itemCost;
	}
	
}
