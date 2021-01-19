package no.hvl.data102;

import no.hvl.data102.adt.FilmArkivADT;

public class FilmArkiv implements FilmArkivADT {

	Film[] filmArkivet;
	int antall = 0;
	public FilmArkiv(int n)
	{
	  filmArkivet = new Film[n];
	}
	
	@Override
	public boolean LeggTil(Film filmen) {
		
		boolean lagtTil = false;
		
		if(antall < filmArkivet.length)
		{
			filmArkivet[antall] = filmen;
			antall++;
			lagtTil = true;
		}
		else
		{
			Film[] hjelpeTabell = new Film[filmArkivet.length*2];
			for(int i = 0; i < filmArkivet.length; i++)
			{
				hjelpeTabell[i] = filmArkivet[i];
			}
			
			filmArkivet = hjelpeTabell;
			filmArkivet[antall] = filmen;
			antall++;
			lagtTil = true;
		}
		return lagtTil;
	}

	@Override
	public boolean SlettFilm(Film filmen) {
		boolean slettet = false;
		
		for(int i = 0; i < filmArkivet.length; i++)
		{
			if(filmArkivet[i].equals(filmen))
			{
				filmArkivet[i] = filmArkivet[antall];
				filmArkivet[antall] = null;
				antall--;
				slettet = true;
			}
		}
		return slettet;
	}

	@Override
	public Film FinnFilm(String tittel) {
		for(Film finn : filmArkivet)
		{
			if(finn.getTittel().contains(tittel))
			{
				return finn;
			}
		}
		return null;
	}

	@Override
	public String FinnProdusent(String produsent) {
		for(Film finn : filmArkivet)
		{
			if(finn.getTittel().contains(produsent))
			{
				return finn.getFilmskaper();
			}
		}
		return null;
	}

	@Override
	public int AntallFilmer() {

		return filmArkivet.length-1;
	}

}
