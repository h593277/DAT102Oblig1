package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmArkivADT {
	
	
	boolean leggTil(Film filmen);
	
	boolean slettFilm(Film filmen);
	
	Film finnFilm(String tittel);
	
	String finnProdusent(String produsent);
	
	int antallSjanger(Sjanger sjanger);
	
	int antallFilmer();
	
	public Film[] getFilmArkiv();

		
	

}
