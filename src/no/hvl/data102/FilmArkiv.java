package no.hvl.data102;

import no.hvl.data102.adt.FilmArkivADT;

public class FilmArkiv implements FilmArkivADT {

	Film[] filmArkivet;
	public FilmArkiv(int n)
	{
	  filmArkivet = new Film[n];
	}
	
	@Override
	public boolean LeggTil(Film filmen) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SlettFilm(Film filmen) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film FinnFilm(String tittel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String FinnProdusent(String produsent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int AntallFilmer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
