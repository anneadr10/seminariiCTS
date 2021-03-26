package ro.ase.cts.FactoryMethod;

public class InfirmierFactory  implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Brancardier(nume);
	}

}
