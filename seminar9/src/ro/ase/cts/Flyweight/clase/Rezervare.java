package ro.ase.cts.Flyweight.clase;

public class Rezervare {

	private int nrMasa;
	private int nrPers;
	private int orarezervare;
	
	
	public Rezervare(int nrMasa, int nrPers, int orarezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPers = nrPers;
		this.orarezervare = orarezervare;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPers=");
		builder.append(nrPers);
		builder.append(", orarezervare=");
		builder.append(orarezervare);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
