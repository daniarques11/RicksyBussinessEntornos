package edu.elsmancs.guestDispatcher;

import edu.elsmancs.creditCard.CreditCard;
/**
 * Componente encargado de despachar un cliente a través de su CreditCard
 *
 * @author Dani Arqués
 * 
 */
public interface GuestDispatcher {

	/**
	 * Despacha al usuario a partir de su CreditCard
	 * @param user
	 */
	public void dispatch(CreditCard user);
}
