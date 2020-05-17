package edu.elsmancs.menu;

import java.util.ArrayList;

import edu.elsmancs.creditCard.CreditCard;
import edu.elsmancs.guestDispatcher.GuestDispatcher;

/**
 * Menu representa un vale por un determinado menú
 * Tiene un stock finito, el producto tiene un precio y se guarda un registro de los menús pedidos
 *
 * @author Dani Arqués
 * 
 */
public class Menu implements GuestDispatcher{
	
	private int stock;
	private final double cost;
	private ArrayList<CreditCard> pedidos = new ArrayList<CreditCard>();
	/**
	 * Construye e inicializa un determinado menú
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
	 * Despacha un cliente cobrándole un menú si tiene crédito
	 * Si se cobra el menú, se añade al registro
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
