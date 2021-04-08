package ro.ase.cts.adaptorClase.clase;

public class Leasing {
	
	private float suma;
	private String nume;
	
	
	public Leasing(float suma, String nume) {
		super();
		this.suma = suma;
		this.nume = nume;
	}


	public float getSuma() {
		return suma;
	}


	public String getNume() {
		return nume;
	}
	
	public void imprumuta() {
		System.out.println(nume+ "a realizat leasing cu suma "+suma);
	}

}
