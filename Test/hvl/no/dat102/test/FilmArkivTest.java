package hvl.no.dat102.test;
import static org.junit.Test.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import no.hvl.data102.Film;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmArkivADT;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilmArkivTest {
	
	FilmArkivADT filmArkivTest = new FilmArkiv(10);
	Film film1 = new Film(1, "Speilberg", "Grøsseren 3", 1994, "Universal Pictures", "ACTION");
	
	@Test
	public void testLeggTil()
	{
		filmArkivTest.leggTil(film1);
		assertEquals(1, filmArkivTest.antallFilmer());
	}
	
	@Test
	public void testSlettFilm()
	{
		filmArkivTest.leggTil(film1);
		assertTrue(filmArkivTest.slettFilm(film1));
		
	}
	
	@Test
	public void testFinnFilm()
	{
		filmArkivTest.leggTil(film1);
	   // assertEquals(film1, filmArkivTest.finnFilm("Grøsseren 3")); 
		
	}
	
	@Test
	public void testFinnProdusent()
	{
		filmArkivTest.leggTil(film1);
	   //assertEquals("Speilberg", filmArkivTest.finnProdusent("Grøsseren 3"));
		
	}
	
	@Test
	public void testAntallSjanger()
	{
		filmArkivTest.leggTil(film1);
	   assertEquals(1, filmArkivTest.antallSjanger(Sjanger.ACTION));
	}
	
	@Test
	public void testAntallFilmer()
	{
		filmArkivTest.leggTil(film1);
	   assertEquals(1, filmArkivTest.antallFilmer());
	}
	
	
		
	

}
