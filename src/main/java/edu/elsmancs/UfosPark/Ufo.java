package edu.elsmancs.UfosPark;

public class Ufo {
	
	private String ID;
	
	public Ufo(String ID) {
		this.ID = ID;
	}
	
	String getID() {
		return this.ID;
	}
	
	@Override
	public String toString() {
		return this.ID;
	}
}
