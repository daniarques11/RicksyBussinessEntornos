package edu.elsmancs.receptivo;

import java.util.ArrayList;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;


public class Receptivo {
	
	private ArrayList<GuestDispatcher> dispatchList = new ArrayList<GuestDispatcher>();

	public Receptivo() {}
	
	public void registra(GuestDispatcher dispatchableComponent) {
		this.dispatchList.add(dispatchableComponent);
	}
	
	public void dispatch(CreditCard user) {
		for (GuestDispatcher dispatchable : dispatchList) {
			dispatchable.dispatch(user);
		}
	}
}
