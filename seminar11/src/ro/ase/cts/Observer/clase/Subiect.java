package ro.ase.cts.Observer.clase;

public interface Subiect {
	public void adaugareAbonat(Observer observer);
	public void stergereAbonat(Observer observer);
	public void trimiteMesaj(String mesaj);
}
