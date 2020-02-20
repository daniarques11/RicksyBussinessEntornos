package edu.elsmancs.crystalExpender;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrystalExpenderTest {

	@Test
	public void crearCrystalExpender() {
        CrystalExpender packExpender = new CrystalExpender(3, 50);
        assertNotNull(packExpender);
	}

}
