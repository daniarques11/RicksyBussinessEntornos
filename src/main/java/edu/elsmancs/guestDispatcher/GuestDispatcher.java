package edu.elsmancs.guestDispatcher;

import edu.elsmancs.creditCard.CreditCard;
/**
 * Interfaz para las clases que despachan clientes a partir de su CreditCard.
 *
 */
public interface GuestDispatcher {

	/**
	 * Despacha al usuario a partir de su CreditCard.
	 * @param user
	 */
	public void dispatch(CreditCard user);
}
