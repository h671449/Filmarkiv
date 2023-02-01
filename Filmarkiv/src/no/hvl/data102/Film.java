package no.hvl.data102;

public class Film {
	
	private enum sjanger();
	private int nr;
	private int year;
	private String produsent;
	private String tittel;
	private String filmselskap;
	
	

	public Film(int nr, int year, String produsent, String tittel, String filmselskap, enum sjanger) {
		
		this.nr = nr;
		this.year = year;
		this.produsent = produsent;
		this.tittel = tittel;
		this.filmselskap = filmselskap;
		this.sjanger() = sjanger();
	}

	public void tomFilm() {
		
		Film tomFilm = new Film();
	}
	
	public int getNr() {
		
		return nr;
	}
	
	public void setNr(int nr) {
		
		this.nr = nr;
	}
	
	public int getYear() {
		
		return year;
	}
	
	public void setYear(int year) {
		
		this.year = year;
	}

	public String getProdusent() {
		
		return produsent;
	}
	
	public void setProdusent(String produsent) {
		
		this.produsent = produsent;
	}

	public String getTittel() {
		
		return tittel;
	}
	
	public void setTittel(String tittel) {
		
		this.tittel = tittel;
	}

	public String getFilmselskap() {
		
		return filmselskap;
	}
	
	public void setFilmselskap(String filmselskap) {
		
		this.filmselskap = filmselskap;
	}
	
	public enum getSjanger() {
		
		return sjanger;
	}

	
	
		

}
