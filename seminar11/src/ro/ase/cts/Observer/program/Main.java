package ro.ase.cts.Observer.program;

import ro.ase.cts.Observer.clase.Client;
import ro.ase.cts.Observer.clase.ManagerSala;
import ro.ase.cts.Observer.clase.Observer;

public class Main {

	public static void main(String[] args) {
		// Observer - notificare
				// 12 E

				ManagerSala managerSala=new ManagerSala("SalaMea");
				
				Observer client1=new Client("Ion");
				Observer client2=new Client("Maria");
				Observer client3=new Client("Vasile");
				
				managerSala.adaugareAbonat(client1);
				managerSala.adaugareAbonat(client2);
				managerSala.adaugareAbonat(client3);
				
				managerSala.trimiteAnunt("fotbal");
				
				managerSala.stergereAbonat(client2);
				managerSala.trimiteAnunt("handbal");
				

	}

}
