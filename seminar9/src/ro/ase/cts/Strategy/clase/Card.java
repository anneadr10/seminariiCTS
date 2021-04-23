package ro.ase.cts.Strategy.clase;

public class Card implements Strategy {
	
	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Tranzactia a fost realizata cu cardul pentru suma de " + suma);
		
	}

}
