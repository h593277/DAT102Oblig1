package no.hvl.data102.klient;

import javax.swing.JOptionPane;

import no.hvl.data102.Fil;
import no.hvl.data102.FilmArkiv;

public class BrukerKlient {

	public static void main(String[] args) {
		
		String m = JOptionPane.showInputDialog("Skriv in navnet på filmarkivet du vil jobbe med eller navnet på nytt filmarkiv(.txt vil bli lagt på automatisk)") + ".txt";
		
		FilmArkiv filmArkivet = new FilmArkiv(100);
		Meny menyen = new Meny(filmArkivet);
		
		menyen.start();
		
		Fil filen = new Fil();
		
		filen.arkivfraFil(m);
		

	}

}
