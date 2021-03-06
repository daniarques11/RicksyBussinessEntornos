package edu.elsmancs.creditCard;

/**
 * CreditCard representa la tarjeta de cr�dito de un cliente. Cada CreditCard contiene una cantidad de cr�dito "EZI"
 *
 * @author Dani Arqu�s
 * 
 */
public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000;
	private final String SYMBOL = "EZI"; 
	
	/**
	 * Construye un CreditCard con un propietario y un n�mero de tarjeta
	 * @param propietario
	 * @param n�mero de tarjeta
	 */
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}
	
	//este getter est� solo para que se pueda acceder desde el toString de Menu
	/**
	 * Devuelve el propietario de la tarjeta
	 * @return propietario
	 */
	public String owner() {
		return this.owner;
	}
	
	/**
	 * Devuelve el n�mero de la tarjeta
	 * @return n�mero
	 */
	public String number() {
		return this.number;
	}
	
	/**
	 * Devuelve la cantidad de cr�dito en la tarjeta
	 * @return cr�dito disponible
	 */
	public double credit() {
		return this.credit;
	}
	
	/**
	 * Retira una cantidad de cr�dito de la tarjeta si hay saldo suficiente.
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
