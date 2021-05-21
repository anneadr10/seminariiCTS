package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.TestJUnit.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Gigel";
		Student student= new Student(nume);
		assertEquals("Numele nu a fost initializat", nume, student.getNume());
		//assertNotEquals(null, student.getNote());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student= new Student();
		assertNotNull("Numele nu a fost initializat", student.getNume());
		assertNotNull("Lista de note nu a fost initializata", student.getNote());
	}

	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student= new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		Student student= new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student= new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student= new Student();
		int note1=10;
		int note2=9;
		int note3=5;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		float medie= (note1+ note2+note3)/3.0f;
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	
	
	@Test
	public void testCalculeazaMediePentruONota() {
		Student student= new Student();
		int note1=10;
		student.adaugaNota(note1);
		assertEquals(note1, student.calculeazaMedie(), 0.01);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculeazaMediePentruZeroNota() {
		Student student= new Student();
		 student.calculeazaMedie();
	}
	
	@Test
	public void testAreRestante() {
		Student student= new Student();
		int note1=10;
		int note2=3;
		int note3=5;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student= new Student();
		int note1=10;
		int note2=9;
		int note3=7;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student= new Student();
		int note1=10;
		int note2=9;
		int note3=7;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		try {
			student.getNota(3);
		}
		catch(IndexOutOfBoundsException exceptie) {
			
		}
		
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student= new Student();
		int note1=11;
		
		student.adaugaNota(note1);
		
	}
	
	
	
}
