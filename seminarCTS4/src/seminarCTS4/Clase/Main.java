package seminarCTS4.Clase;

import seminarCTS4.Clase.Parlament;
import seminarCTS4.Clase.Imprimanta;

public class Main {

	public static void main(String[] args) {
		
		
		Parlament parlament1=Parlament.getInstance();
		Parlament parlament2=Parlament.getInstance();
		
		
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		parlament1.setTara("Romania");
		parlament2.setNrParlamentari(300);
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		
		ParlamentLazy parlamentLazy= ParlamentLazy.getInstance("Serbia", 400,8,"Sediul Serbiei");
		
		ParlamentLazy parlamentLazy2= ParlamentLazy.getInstance("UK", 500,2,"Sediul UK");
		System.out.println(parlamentLazy.toString());
		System.out.println(parlamentLazy2.toString());
		
        Imprimanta imprimanta= Imprimanta.getInstance("HP", 4000,(float) 100.50);
		
		Imprimanta imprimanta2= Imprimanta.getInstance("Samsung", 3000,(float) 200.99);
		System.out.println(imprimanta.toString());
		System.out.println(imprimanta2.toString());
		
	}

}
