package no.hvl.data102.klient;

import javax.swing.JOptionPane;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.adt.FilmArkivADT;

public class Meny {
	
	private TekstGrensesnitt grenseSnitt;
	private FilmArkivADT filma;
	
	public Meny(FilmArkivADT filmArkivet)
	{
		grenseSnitt = new TekstGrensesnitt();
		this.filma = filmArkivet;
	}
	
	public void start()
	{
		
		
	}



}
