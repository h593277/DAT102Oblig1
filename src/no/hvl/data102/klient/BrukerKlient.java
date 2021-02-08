package no.hvl.data102.klient;

import no.hvl.data102.Fil;
import no.hvl.data102.Film;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.FilmArkiv2;
import no.hvl.data102.adt.FilmArkivADT;

public class BrukerKlient {

	public static void main(String[] args) {
		
		
		
		FilmArkivADT filmArkivet = new FilmArkiv(100);
		
		//Test
		//FilmArkivADT filmArkivet2 = new FilmArkiv(100);
		//FilmArkivADT filmArkivetLinked = new FilmArkiv2();
	
		//Film test = new Film(1, "Jackson", "Lord of the Rings: Fellowship of the Ring", 1999, "New Line Cinema", "FANTASY");
		//filmArkivet.leggTil(test);
		
		//filmArkivetLinked.leggTil(test);
	
		//Fil testFil = new Fil();
		//testFil.SkrivtilFil("GOAT", filmArkivet);
		Meny menyen = new Meny(filmArkivet);
		
	
		menyen.start();
		
		

	}

}
