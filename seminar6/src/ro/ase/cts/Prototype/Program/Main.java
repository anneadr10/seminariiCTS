package ro.ase.cts.Prototype.Program;

import ro.ase.acs.Prototype.clase.Bilet;
import ro.ase.acs.Prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		ContClient contClient= new ContClient("Ioana",21,10);
		ContClient contClient2=(ContClient) contClient.copiaza();

		System.out.println(contClient);
		System.out.println(contClient2);
		Bilet biletPrototype= new Bilet(1,"Echipa1","Echipa2", null);
		Bilet bilet1=(Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(100);
		Bilet bilet2=(Bilet)biletPrototype.copiaza();
		
		System.out.println(bilet1);
		System.out.println(bilet2);
		
	}

}
