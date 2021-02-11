package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmArkivADT;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TekstGrensesnitt {

	public void skrivUtFilmer(String delTittel, FilmArkivADT filmer) {
		System.out.println(filmer.finnFilm(delTittel));
	}

	public void produsentFilmer(String delTittel, FilmArkivADT filmer) {
		for (Film m : filmer.getFilmArkiv()) {
			if (filmer.finnProdusent(delTittel).contains(delTittel)) {
				System.out.println(m);
			}
		}

	}

	public void filmStatistikk(FilmArkivADT filmer) {
		System.out.println("Antall filmer: " + filmer.antallFilmer());
		for (Sjanger s : Sjanger.values()) {
			System.out.print(s + ": " + filmer.antallSjanger(s));
		}
	}

}
