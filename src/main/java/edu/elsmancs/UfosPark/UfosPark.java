package edu.elsmancs.UfosPark;

import java.util.List;

public class UfosPark {

	private List<Ufo> flota = null; 
	
	/*
	 * Constructor
	 * */
	public UfosPark() {	}
	
	public void add(String ufoID) {
		Ufo ufo = new Ufo(ufoID);
		flota.add(ufo);
	}
	
	
}
