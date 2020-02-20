package edu.elsmancs.UfosPark;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.elsmancs.creditCard.CreditCard;

public class UfosParkTest {

	
	
	
	@Test
	public void test() {
		UfosPark ufosPark = new UfosPark();
	    String[] ufosID = { "ufo1", "uffo2" };
		for (String ovni : ufosID) {
			ufosPark.add(ovni);
	    }
		assertNotNull(ufosPark);
	}

	@Test
	public void getUfoOfTest() {
		UfosPark ufosPark = new UfosPark();
	    String[] ufosID = { "ufo1", "uffo2" };
	    for (String ovni : ufosID) {
			ufosPark.add(ovni);
	    }
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        ufosPark.dispatch(abradolph);
        assertEquals("uffo2", ufosPark.getUfoOf(abradolph.number()).toString());

	}
}
