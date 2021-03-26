package ro.ase.cts.FactoryMethod;

public class main {
	
	public static void printeazaPersonalSpital(FactoryPersonal fabrica, String nume) {
		PersonalSpital personal= fabrica.getPersonal(nume);
		System.out.println(personal.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printeazaPersonalSpital(new MedicFactory(),"Ion");
		printeazaPersonalSpital(new AsistentFactory(),"Maria");
		printeazaPersonalSpital(new InfirmierFactory(),"Ioana");

		
	}

}
