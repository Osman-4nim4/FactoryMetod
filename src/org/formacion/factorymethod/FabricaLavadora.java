package org.formacion.factorymethod;

public class FabricaLavadora {

	public Lavadora fabricaLavadora(String clase) {
		if(clase == "superior") {
			return new LavadoraCargaSuperior();
		}
		else if(clase == "frontal") {
			return new LavadoraCargaFrontal();
		}
		else {
			return null;
		}
	}
}	

