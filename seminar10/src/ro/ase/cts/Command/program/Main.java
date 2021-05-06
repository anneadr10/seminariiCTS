package ro.ase.cts.Command.program;

import ro.ase.cts.Command.clase.ComandaConstituire;
import ro.ase.cts.Command.clase.ComandaDepunere;
import ro.ase.cts.Command.clase.ComandaRetragere;
import ro.ase.cts.Command.clase.ContBancar;
import ro.ase.cts.Command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {

		ContBancar contBancar=new ContBancar("Ion");
		ManagerComenzi managerComenzi=new ManagerComenzi();
		managerComenzi.invoca(new ComandaConstituire(contBancar,100));
		managerComenzi.invoca(new ComandaDepunere(contBancar,200));

		managerComenzi.executaComanda();
		managerComenzi.invoca(new ComandaRetragere(contBancar, 350));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

	}

}
