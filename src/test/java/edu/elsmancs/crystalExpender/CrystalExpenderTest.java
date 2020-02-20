package edu.elsmancs.crystalExpender;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.elsmancs.creditCard.CreditCard;

public class CrystalExpenderTest {

	@Test
	public void crearCrystalExpender() {
        CrystalExpender packExpender = new CrystalExpender(3, 50);
        assertNotNull(packExpender);
	}

	public void administrarCristalesTest() {
        CrystalExpender packExpender = new CrystalExpender(3, 50);
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        CreditCard gearHead = new CreditCard("Gearhead", "8888888888888888");
        packExpender.dispatch(abradolph);
        assertEquals(2, packExpender.stock(), 0);
        packExpender.dispatch(gearHead);
        assertEquals(1, packExpender.stock(), 0);


	}
}
