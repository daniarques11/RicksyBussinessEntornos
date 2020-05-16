package edu.elsmancs.crystalExpender;

import edu.elsmancs.creditCard.CreditCard;

import edu.elsmancs.guestDispatcher.GuestDispatcher;

/**
 * CrystalExpender representa un expendedor de cristales a usuarios. Tiene un stock finito y el producto tiene un precio
 *
 */
public class CrystalExpender implements GuestDispatcher {

	private int stock;
	private final double itemCost;
	/**
	 * Construye e inicializa una m�quina expendedora de cristales
	 * @param stock
	 * @param itemCost
	 */
	public CrystalExpender(int stock, double itemCost) {
		this.stock = stock;
		this.itemCost = itemCost;
	}
	
	public double stock() {
		return this.stock;
	}
	
	/**
	 * Despacha un cliente cobr�ndole un cristal si tiene cr�dito.
	 * @param user
	 */
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
