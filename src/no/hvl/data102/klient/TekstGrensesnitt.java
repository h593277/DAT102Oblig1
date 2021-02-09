package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmArkivADT;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TekstGrensesnitt {

	public void lesFilm() {

		Film filmen = new Film();
		// Scanner sc = new Scanner(System.in);
		int filmnr = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn film nummer:"));
		filmen.setFilmnr(filmnr);
		String prod = JOptionPane.showInputDialog("Skriv inn produsenten av filmen:");
		filmen.setFilmskaper(prod);
		String tit = JOptionPane.showInputDialog("Skriv inn tittel på filmen:");
		filmen.setTittel(tit);
		int aar = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn året filmen kom ut:"));
		filmen.setAar(aar);
		String selsk = JOptionPane.showInputDialog("Skriv inn selskapet bak produksjonen av filmen:");
		filmen.setFilmSelskap(selsk);
		String sjang = JOptionPane.showInputDialog(
				"Skriv inn Sjangeren i store bokstaver: \n1: SKREKK\n2: ACTION\n3: ROMANTISK\n4: KOMEDIE\n5: DOKUMENTAR\n6: THRILLER\n7: FANATSY");
		filmen.setSjangeren(Sjanger.valueOf(sjang));

	}

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
