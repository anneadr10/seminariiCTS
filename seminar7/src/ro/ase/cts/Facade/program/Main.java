package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.Facade;
import ro.ase.cts.Facade.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana= new Persoana("2991220112233", "Andreea");
		
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Oferim credit");
		}
		else {
			System.out.println("Nu oferim credit");
		}

	}

}
