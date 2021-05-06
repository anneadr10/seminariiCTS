package ro.ase.cts.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	private List<Comanda> comenzi;
	
	public ManagerComenzi() {
		super();
		this.comenzi=new ArrayList<Comanda>();
	}
	
	public void invoca(Comanda command) {
		comenzi.add(command);
	}
	
	public void executaComanda() {
		if(!comenzi.isEmpty()) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}

}
