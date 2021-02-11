package no.hvl.data102.klient;

import no.hvl.data102.Fil;
import no.hvl.data102.Film;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.FilmArkiv2;
import no.hvl.data102.adt.FilmArkivADT;

public class BrukerKlient {

	public static void main(String[] args) {
		
		
		
		FilmArkivADT filmArkivet = new FilmArkiv(100);
		
		Meny menyen = new Meny(filmArkivet);
		
	
		menyen.start();
		

	}

}
