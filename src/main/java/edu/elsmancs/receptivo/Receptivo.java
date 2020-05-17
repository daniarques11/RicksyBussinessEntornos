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
 * @author Dani Arqués
 * 
 */
public class Receptivo {

	private ArrayList<GuestDispatcher> dispatchList = new ArrayList<GuestDispatcher>();

	public Receptivo() {
	}

	/**
	 * Añade un despachador al receptivo
	 * 
	 * @param dispatchable component
	 */
	public void registra(GuestDispatcher dispatchableComponent) {
		this.dispatchList.add(dispatchableComponent);
	}

	/**
	 * Despacha al usuario (pasado por parámetro) con todos los despachadores disponibles
	 * @param user
	 */
	public void dispatch(CreditCard user) {
		for (GuestDispatcher dispatchable : dispatchList) {
			dispatchable.dispatch(user);
		}
	}
}
