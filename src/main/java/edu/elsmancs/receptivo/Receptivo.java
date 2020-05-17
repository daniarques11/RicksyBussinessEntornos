package edu.elsmancs.receptivo;

import java.util.ArrayList;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;

/**
 * Receptivo es un gestor encargado de despachar un usuario con todos los
 * despachadores disponibles
 * <br>
 * Se compone de un conjunto de despachadores
 * 
 * @author Dani Arqu�s
 * 
 */
public class Receptivo {

	private ArrayList<GuestDispatcher> dispatchList = new ArrayList<GuestDispatcher>();

	public Receptivo() {
	}

	/**
	 * A�ade un despachador al receptivo
	 * 
	 * @param dispatchable component
	 */
	public void registra(GuestDispatcher dispatchableComponent) {
		this.dispatchList.add(dispatchableComponent);
	}

	/**
	 * Despacha al usuario (pasado por par�metro) con todos los despachadores disponibles
	 * @param user
	 */
	public void dispatch(CreditCard user) {
		for (GuestDispatcher dispatchable : dispatchList) {
			dispatchable.dispatch(user);
		}
	}
}
