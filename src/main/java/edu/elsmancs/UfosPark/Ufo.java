package edu.elsmancs.UfosPark;

/**
 * Ufo representa un Ovni taxi. Los Ufo tiene una ID inmutable.
 */
public class Ufo {
	
	private final String ID;
	
	/**
	 * Construye e inicializa un Ufo con un identificador.
	 * @param ID
	 */
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
