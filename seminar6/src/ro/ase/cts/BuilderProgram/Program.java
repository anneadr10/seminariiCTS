package ro.ase.cts.BuilderProgram;

import ro.ase.cts.Builder.Rezervare;
import ro.ase.cts.Builder.RezervareBuilder;
import ro.ase.cts.Builder.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare rezervare1=new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).build();
		Rezervare rezervare2=new RezervareBuilder().setCodRezervare(30).setAreMuzicaAmbientala(true).setGenMuzica("pop").build();
		Rezervare rezervare3=new Rezervare(false,true,false,false,null,70);
		
		RezervareBuilder newBuilder= new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare4= newBuilder.setCodRezervare(80).build();
		Rezervare rezervare5= newBuilder.setCodRezervare(81).build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		
		RezervareBuilderV2 newBuilderV2= new RezervareBuilderV2().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare6= newBuilderV2.setCodRezervare(100).build();
		Rezervare rezervare7= newBuilderV2.setCodRezervare(101).build();
	}

}
