package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare r1= new Rezervare(5,3,17);
		Rezervare r2 = new Rezervare(4,2,18);
		Rezervare r3 = new Rezervare(2,7,19);
		
		FlyweightFactory fabrica= new FlyweightFactory();
		fabrica.getClient("0711111").printezarezervare(r1);
		fabrica.getClient("0722222").printezarezervare(r2);
		fabrica.getClient("0711111").printezarezervare(r3);

	}

}
