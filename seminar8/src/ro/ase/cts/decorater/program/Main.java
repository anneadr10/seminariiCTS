package ro.ase.cts.decorater.program;

import ro.ase.cts.decorater.clase.DecoratorAbstract;
import ro.ase.cts.decorater.clase.DecoratorNotaLMA;
import ro.ase.cts.decorater.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorater.clase.NotaAbstracta;
import ro.ase.cts.decorater.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaAbstracta nota=new NotaDePlata(100);
		
		nota.printeaza();
		
		DecoratorAbstract decorator = new DecoratorNotaPasteFericit(nota);
		decorator.printeazaFelicitare();
		decorator.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decoratorLMA= new DecoratorNotaLMA(nota);
		decoratorLMA.printeaza();
		
		NotaAbstracta notaNoua= new NotaDePlata(36);
		DecoratorAbstract decoratorLMAnou= new DecoratorNotaLMA(notaNoua);
		DecoratorAbstract decoratorFelicitare = new DecoratorNotaPasteFericit(decoratorLMAnou);
		
		System.out.println();
		decoratorFelicitare.printeaza();

	}

}
