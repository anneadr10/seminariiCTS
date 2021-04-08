package ro.ase.cts.Adapter.program;

import ro.ase.cts.Adapter.clase.AdaptorCreditObiecte;
import ro.ase.cts.Adapter.clase.CreditAbstract;
import ro.ase.cts.Adapter.clase.Leasing;

public class Program {
	
	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		

		Leasing leasing= new Leasing(100,"Ana");
		AdaptorCreditObiecte adaptor=new AdaptorCreditObiecte(leasing);
		afiseazaInfoCredit(adaptor,leasing.getSuma());
	}

}
