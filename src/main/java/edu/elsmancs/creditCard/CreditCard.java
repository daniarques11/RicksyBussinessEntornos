package edu.elsmancs.creditCard;

/**
 * CreditCard representa la tarjeta de crédito de un cliente. Cada CreditCard contiene una cantidad de crédito "EZI"
 *
 * @author Dani Arqués
 * 
 */
public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000;
	private final String SYMBOL = "EZI"; 
	
	/**
	 * Construye un CreditCard con un propietario y un número de tarjeta. 
	 * @param owner
	 * @param number
	 */
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}
	
	//este getter está solo para que se pueda acceder desde el toString de Menu
	
	public String owner() {
		return this.owner;
	}
	public String number() {
		return this.number;
	}
	
	public double credit() {
		return this.credit;
	}
	
	/**
	 * Retira una cantidad de crédito de la tarjeta si hay saldo suficiente.
	 * @param amount
	 * @return payed or not payed
	 */
	public boolean pay(double amount) {
		if (this.credit >= amount) {
			this.credit -= amount;
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "owner: " + this.owner + "\nnumber: " + this.number + "\ncredit: " + this.credit + this.SYMBOL;
	}
}
