package edu.elsmancs.UfosPark;


import java.util.HashMap;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;

/**
 * UfosPark consiste en una flota de taxis Ufo
 * <br>
 * Se guarda un registro del cliente actual de cada Ufo
 * <br>
 * Los Ufo que pertenecen a un mismo UfosPark constan de una tasa para su uso
 * <br>
 * V�aase la clase {@link edu.elsmancs.UfosPark.Ufo} para conocer en detalle
 * 
 * @author Dani Arqu�s
 * 
 */
public class UfosPark implements GuestDispatcher{

	private HashMap<Ufo, CreditCard> flota = new HashMap<>(); 
	private double fee = 500;


	public UfosPark() {	}
	
	/**
	 * @return tama�o de la flota
	 */
	int size() {
		return this.flota.size();
	}
	
	/**
	 * A�ade un Ufo a la flota
	 * @param ufoID
	 */
	public void add(String ufoID) {
		Ufo ufo = new Ufo(ufoID);
		flota.put(ufo, null);
	}
	
	// override de la interfaz GuestDispatcher
	// Usa los m�todos getFreeUfo y freeUfos para intentar despachar un ovni
	
	/**
	 * Despacha un cliente cobr�ndole un Ufo taxi si tiene cr�dito
	 * @param user
	 */
	@Override
	public void dispatch(CreditCard user) {
		if (!flota.containsValue(user) && freeUfos() > 0) {
			if(user.pay(this.fee)) {
				flota.put(getFreeUfo(), user);
			} else {
				
			}
		} else {
			// falla silenciosamente
		}
	}
	
	/**
	 * Obtiene un Ufo libre
	 * @return ufo libre
	 */
	Ufo getFreeUfo() {
		for(Ufo ufo : flota.keySet()) {
			if(flota.get(ufo) == null) {
				return ufo;
			}
		}
		return null;
	}
	
	/**
	 * Obtiene el n�mero de Ufos libres en la flota
	 * @return n� de Ufos libres
	 */
	int freeUfos() {
		int freeUfoCount = 0;
		for (Ufo ufo : flota.keySet()) {
			if(flota.get(ufo) == null ) {
				freeUfoCount++;
			}
		}	
		return freeUfoCount;
	}

	/**
	 * Obtener el ufo de un determinado creditCard
	 * @param creditCardNum
	 * @return ufo
	 */
	
	public Ufo getUfoOf(String creditCardNum) {
		for (Ufo ufo : flota.keySet()) {
			if(flota.get(ufo) != null && flota.get(ufo).number() == creditCardNum) {
				return ufo;
			}
		}
		return null;
	}
	 
	@Override
	public String toString() {
		return flota.keySet().toString();
	}
}
