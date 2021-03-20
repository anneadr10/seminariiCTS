package seminarCTS4.Clase;

import seminarCTS4.Clase.Parlament;

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
	}

}
