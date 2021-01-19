package no.hvl.data102;

public class Film {

	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int år;
	private String filmSelskap;
	Sjanger sjangeren;
	
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getÅr() {
		return år;
	}

	public void setÅr(int år) {
		this.år = år;
	}

	public String getFilmSelskap() {
		return filmSelskap;
	}

	public void setFilmSelskap(String filmSelskap) {
		this.filmSelskap = filmSelskap;
	}
	
	public Film() 
	{
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int år, String filmSelskap, String Sjangeren) 
	{
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.år = år;
		this.filmSelskap = filmSelskap;
		sjangeren = sjangeren.valueOf(Sjangeren);
	}

	@Override
	public String toString() {
		return "Film [filmnr=" + filmnr + ", filmskaper=" + filmskaper + ", tittel=" + tittel + ", år=" + år
				+ ", filmSelskap=" + filmSelskap + ", sjangeren=" + sjangeren + "]";
	}
	
	
}
