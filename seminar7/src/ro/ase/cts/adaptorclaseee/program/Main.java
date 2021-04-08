package ro.ase.cts.adaptorclaseee.program;

import ro.ase.cts.adaptorClase.clase.AdaptorCreditClase;
import ro.ase.cts.adaptorClase.clase.CreditAbstract;

public class Main {
	

	public static void afiseazaInfoCredit(CreditAbstract creditAbstract ) {
		creditAbstract.oferaCredit();
	}

	public static void main(String[] args) {
	
		AdaptorCreditClase adaptorClase =  new AdaptorCreditClase(50, "Maria");
		afiseazaInfoCredit(adaptorClase);
	

	}

}
