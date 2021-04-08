package ro.ase.cts.adaptorClase.clase;

public class AdaptorCreditClase extends Leasing implements CreditAbstract {

	public AdaptorCreditClase(float suma, String nume) {
		super(suma, nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.imprumuta();
		
	}

}
