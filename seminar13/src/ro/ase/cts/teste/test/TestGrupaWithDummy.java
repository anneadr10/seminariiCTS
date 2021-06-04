package ro.ase.cts.teste.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.dubluri.DummyStudent;
import ro.ase.cts.teste.clase.Grupa;
import ro.ase.cts.teste.clase.IStudent;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudent() {
		IStudent student= new DummyStudent();
		Grupa grupa= new Grupa(1083);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getStudenti().size());
	}
	
	// Avantaje DummyStudent fata de Student:
	// daca Student nu exista
	// salvam spatiu

}
