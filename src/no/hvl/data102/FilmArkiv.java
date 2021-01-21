package no.hvl.data102;

import no.hvl.data102.adt.FilmArkivADT;

public class FilmArkiv implements FilmArkivADT {

	Film[] filmArkivet;
	int antall = 0;
	public FilmArkiv(int n)
	{
	  filmArkivet = new Film[n];
	}
	
	public Film[] getFilmArkiv()
	{
		return filmArkivet;
	}
	
	@Override
	public boolean leggTil(Film filmen) {
		
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
	public boolean slettFilm(Film filmen) {
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
	public Film finnFilm(String tittel) {
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
	public String finnProdusent(String produsent) {
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
	public int antallSjanger(Sjanger sjanger)
	{
		int sjangerAntall = 0;
		for(Film f : filmArkivet)
		{
			if(f.getSjangeren() == sjanger)
			{
				sjangerAntall++;
			}
		}
		
		return sjangerAntall;
	}

	@Override
	public int antallFilmer() {

		return filmArkivet.length-1;
	}

}
