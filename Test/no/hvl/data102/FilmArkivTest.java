package no.hvl.data102;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import no.hvl.data102.adt.FilmArkivADT;

public class FilmArkivTest {
	
	FilmArkivADT filmArkivTest = new FilmArkiv(10);
	Film film1 = new Film(1, "Speilberg", "Grøsseren 3", 1994, "Universal Pictures", "ACTION");
	
	@Test
	public void testLeggTil()
	{
		filmArkivTest.leggTil(film1);
		Assertions.assertEquals(1, filmArkivTest.antallFilmer());
	}
	
	@Test
	public void testSlettFilm()
	{
		filmArkivTest.leggTil(film1);
		Assertions.assertTrue(filmArkivTest.slettFilm(film1));
		
	}
	
	@Test
	public void testFinnFilm()
	{
		filmArkivTest.leggTil(film1);
		Assertions.assertEquals(film1, filmArkivTest.finnFilm("Grøsseren 3")); 
		
	}
	
	@Test
	public void testFinnProdusent()
	{
		filmArkivTest.leggTil(film1);
		String grosseren = filmArkivTest.finnProdusent("Grøsseren 3");
		String regissor = "Speilberg";
		Assertions.assertEquals(regissor, grosseren);
		
	}
	
	@Test
	public void testAntallSjanger()
	{
		filmArkivTest.leggTil(film1);
		Assertions.assertEquals(1, filmArkivTest.antallSjanger(Sjanger.ACTION));
	}
	
	@Test
	public void testAntallFilmer()
	{
		filmArkivTest.leggTil(film1);
		Assertions.assertEquals(1, filmArkivTest.antallFilmer());
	}
	
	
		
	

}
