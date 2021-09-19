package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	FabricaLavadora fabrica = new FabricaLavadora();
	
	@Test
	public void test_carga_frontal() {
		//implementar factory method
		Lavadora lavadora = fabrica.fabricaLavadora("frontal");
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		//implementar factory method
		Lavadora lavadora = fabrica.fabricaLavadora("superior");
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
