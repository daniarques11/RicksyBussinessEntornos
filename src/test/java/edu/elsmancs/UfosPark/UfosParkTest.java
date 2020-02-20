package edu.elsmancs.UfosPark;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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

}
