package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.Sjanger;

public class TekstGrensesnitt {
	
	public void skrivUtFilmer(String delTittel, FilmArkiv filmer)
	{
		System.out.println(filmer.finnFilm(delTittel));
	}
	
	public void produsentFilmer(String delTittel, FilmArkiv filmer)
	{
		for(Film m : filmer.getFilmArkiv())
		{
			if(filmer.finnProdusent(delTittel).contains(delTittel))
			{
			  System.out.println(m);
			}
		}
		
	}
	
	public void filmStatistikk(FilmArkiv filmer)
	{
		System.out.println("Antall filmer: " + filmer.antallFilmer());
		for(Sjanger s : Sjanger.values())
		{
			System.out.print(s + ": " + filmer.antallSjanger(s));
		}
	}

}
