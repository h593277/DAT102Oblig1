package no.hvl.data102;

public class Film {

	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int år;
	private String filmSelskap;
	private enum sjanger {SKREKK, ACTION, ROMANTISK, KOMEDIE, DOKUMENTAR, THRILLER, FANTASY}
	
	public Film() 
	{
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int år, String filmSelskap) 
	{
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.år = år;
		this.filmSelskap = filmSelskap;
	}
	
	
}
