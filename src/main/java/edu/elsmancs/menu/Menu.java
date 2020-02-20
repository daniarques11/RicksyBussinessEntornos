package edu.elsmancs.menu;

import java.util.ArrayList;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;

public class Menu implements GuestDispatcher{
	
	private int stock;
	private final double cost;
	private ArrayList<CreditCard> pedidos = new ArrayList<CreditCard>();
	/**
	 * Constructor
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
	//Override de la interfaz
	
	@Override
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
