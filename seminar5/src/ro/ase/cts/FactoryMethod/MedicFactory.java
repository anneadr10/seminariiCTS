package ro.ase.cts.FactoryMethod;

public class MedicFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Medic(nume);
	}

}
