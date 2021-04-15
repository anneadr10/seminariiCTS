package ro.ase.cts.decorater.clase;

public class DecoratorNotaLMA extends DecoratorAbstract{

	public DecoratorNotaLMA(NotaAbstracta nota) {
		super(nota);
	}
		

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare- La multi ani !");
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}
	

}
