package seminarCTS4.Clase;

public class Imprimanta {

	private String model;
	private int nrPagini;
	private float pret;
	private static Imprimanta imprimanta=null;
	
	public static synchronized Imprimanta getInstance(String model, int nrPagini, float pret) {
		if(imprimanta==null) {
			imprimanta=new Imprimanta(model, nrPagini, pret);
			
		}
		return imprimanta;
	}
	
	
	private Imprimanta() {
		model=" ";
		nrPagini=0;
		pret=0;
			
	}
	
	
	private Imprimanta(String model, int nrPagini, float pret) {
		super();
		this.model = model;
		this.nrPagini = nrPagini;
		this.pret = pret;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNrPagini() {
		return nrPagini;
	}
	public void setNrPagini(int nrPagini) {
		this.nrPagini = nrPagini;
	}
	public float getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	
	@Override
	public String toString() {
		return "Imprimanta [model=" + model + ", nrPagini=" + nrPagini + ", pret=" + pret + "]";
	}
	

}
