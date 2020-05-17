package edu.elsmancs.menu;

import java.util.ArrayList;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;

/**
 * Menu representa un vale por un determinado men�
 * Tiene un stock finito, el producto tiene un precio y se guarda un registro de los men�s pedidos
 *
 * @author Dani Arqu�s
 * 
 */
public class Menu implements GuestDispatcher{
	
	private int stock;
	private final double cost;
	private ArrayList<CreditCard> pedidos = new ArrayList<CreditCard>();
	/**
	 * Construye e inicializa un determinado men�
	 * @param stock
	 * @param cost
	 */
	public Menu(int stock, double cost) {
		this.stock = stock;
		this.cost = cost;
	}

	public int stock() {
		return stock;
	}
	
	public int totalPedidos() {
		return pedidos.size();
	}
	
	/**
	 * Despacha un cliente cobr�ndole un men� si tiene cr�dito
	 * Si se cobra el men�, se a�ade al registro
	 * @param user
	 */
	public void dispatch(CreditCard user) {
		if (stock > 0) {
			if(user.pay(cost)) {
				stock--;
				pedidos.add(user);
			}
		}
	}
	
	@Override
	public String toString() {
		String listaPedidos = "";
		for (CreditCard pedido : pedidos) {
			listaPedidos += pedido.owner() + "\n";
		}
		return "Lista pedidos:\n" + listaPedidos;
	}

}
