package ro.ase.cts.FactoryMethod;

public class AsistentFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Asistent(nume);
	}
}
