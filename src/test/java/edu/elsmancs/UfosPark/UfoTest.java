package edu.elsmancs.UfosPark;

import static org.junit.Assert.*;

import org.junit.Test;

public class UfoTest {

	@Test
	public void crearUfoTest() {
		Ufo ovni = new Ufo("ovni");
		assertEquals("ovni", ovni.getID());
	}

}
