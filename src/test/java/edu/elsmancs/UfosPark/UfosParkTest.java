package edu.elsmancs.UfosPark;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.elsmancs.creditCard.CreditCard;

public class UfosParkTest {

	UfosPark ufosPark = new UfosPark();
    String[] ufosID = { "ufo1", "uffo2" };
	
	
	@Test
	public void test() {
		for (String ovni : ufosID) {
			ufosPark.add(ovni);
	    }
		assertNotNull(ufosPark);
	}

	@Test
	public void getUfoOfTest() {
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        assertEquals("ufo1", ufosPark.getUfoOf(abradolph.number()));

	}
}
