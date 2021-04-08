package ro.ase.cts.adaptorclaseee.program;

import ro.ase.cts.adaptorClase.clase.AdaptorCreditClase;

public class Main {
	

	public static void afiseazaInformatiiCredit(AdaptorCreditClase adaptorClase) {
		adaptorClase.oferaCredit();
	}

	public static void main(String[] args) {
	
		AdaptorCreditClase adaptorClase= new AdaptorCreditClase(50,"Maria");
		afiseazaInformatiiCredit(adaptorClase);
	

	}

}
