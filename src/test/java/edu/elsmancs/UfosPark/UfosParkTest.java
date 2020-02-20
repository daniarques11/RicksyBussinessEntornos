package edu.elsmancs.UfosPark;

import static org.junit.Assert.*;

import org.junit.Test;

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

}
