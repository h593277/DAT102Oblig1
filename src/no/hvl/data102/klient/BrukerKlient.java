package no.hvl.data102.klient;

import javax.swing.JOptionPane;

import no.hvl.data102.FilmArkiv;
import no.hvl.data102.FilmArkiv2;
import no.hvl.data102.adt.FilmArkivADT;

public class BrukerKlient {

	public static void main(String[] args) {
		
		
		
		FilmArkivADT filmArkivet = new FilmArkiv(100);
		FilmArkivADT filmArkivet2 = new FilmArkiv2();
		Meny menyen;
		
		String[] dataStruktur = {"Tabell", "Kjedet"}; 
		String s = (String) JOptionPane.showInputDialog(null, "Velg datastruktur", "Datastruktur", JOptionPane.QUESTION_MESSAGE, null, dataStruktur, dataStruktur[0]);
		if(s.equals("Tabell"))
		{
			menyen = new Meny(filmArkivet);
		}
		else
		{
			menyen = new Meny(filmArkivet2);
		}
	
		menyen.start();
		

	}

}
