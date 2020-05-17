package edu.elsmancs.receptivo;

import java.util.ArrayList;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;

/**
 * Receptivo es un gestor encargado de despachar un usuario con todos los despachadores disponibles.
 * Se compone de un conjunto de despachadores.
 *
 */
public class Receptivo {
	
	private ArrayList<GuestDispatcher> dispatchList = new ArrayList<GuestDispatcher>();

	public Receptivo() {}
	
	/**
	 * Añade un despachador al receptivo
	 * @param dispatchableComponent
	 */
	public void registra(GuestDispatcher dispatchableComponent) {
		this.dispatchList.add(dispatchableComponent);
	}
	
	public void dispatch(CreditCard user) {
		for (GuestDispatcher dispatchable : dispatchList) {
			dispatchable.dispatch(user);
		}
	}
}
