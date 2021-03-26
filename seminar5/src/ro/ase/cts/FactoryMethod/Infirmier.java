package ro.ase.cts.FactoryMethod;

public class Infirmier extends PersonalSpital{

	public Infirmier(String nume) {
		super(nume);
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Infirmier [nume=");
		builder.append(nume);
		builder.append(", getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}

}
