package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmArkivADT {
	
	 /**
	   * 
	   * @param legger til film
	   * @return true om film ble lagt til, false ellers.
	   */ 
	
	boolean leggTil(Film filmen);
	
	 /**
	   * 
	   * @param film man ønsker å slette
	   * @return true om den ble slettet, ellers false
	   */ 
	
	boolean slettFilm(Film filmen);
	
	 /**
	   * 
	   * @param tittel til film søkes etter
	   * @return filme med tittel om den eksisterer, null hvis ikke
	   */ 
	
	Film finnFilm(String tittel);
	
	 /**
	   * 
	   * @param tittel til film søkes etter for å finne produsent
	   * @return produsentens navn som String om den eksisterer, ellers null
	   */ 
	
	String finnProdusent(String tittel);
	
	 /**
	   * 
	   * @param sjanger man skal ha antall av
	   * @return antall filmer med gitt sjanger
	   */ 
	
	int antallSjanger(Sjanger sjanger);
	
	 /**
	   * 
	   * @param ingen
	   * @return antall filmer i filmArkivet
	   */ 
	
	int antallFilmer();
	
	 /**
	   * 
	   * @param ingen
	   * @return filmArkivet
	   */ 
	
	public Film[] getFilmArkiv();

		
	

}
