package edu.elsmancs.crystalExpender;

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
}
