package no.hvl.data102.adt;

import no.hvl.data102.Film;

public interface FilmArkivADT {
	
	
	boolean LeggTil(Film filmen);
	
	boolean SlettFilm(Film filmen);
	
	Film FinnFilm(String tittel);
	
	String FinnProdusent(String produsent);
	
	int AntallFilmer();

		
	

}
