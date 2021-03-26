package ro.ase.cts.FactoryMethod;

public class Asistent extends PersonalSpital{

	public Asistent(String nume) {
		super(nume);
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [nume=");
		builder.append(nume);
		builder.append(", getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}
}
