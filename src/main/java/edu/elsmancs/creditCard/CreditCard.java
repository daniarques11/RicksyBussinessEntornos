package edu.elsmancs.creditCard;

public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000;
	private final String SYMBOL = "EZI"; 
	
	/**
	 * Constructor
	 */
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}
	
	public String number() {
		return this.number;
	}
	
	@Override
	public String toString() {
		return "owner: " + this.owner + "\nnumber: " + this.number + "\ncredit: " + this.credit + this.SYMBOL;
	}
}
