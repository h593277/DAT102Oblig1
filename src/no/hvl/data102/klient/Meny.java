package no.hvl.data102.klient;

import javax.swing.JOptionPane;

import no.hvl.data102.Fil;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmArkivADT;

public class Meny {
	
	private TekstGrensesnitt grenseSnitt;
	private FilmArkivADT filma;
	
	public Meny(FilmArkivADT filmArkivet)
	{
		grenseSnitt = new TekstGrensesnitt();
		this.filma = filmArkivet;
	}
	
	public Film opprettFilm()
	{
		Film filmInput = new Film();
		
		
		filmInput.setFilmnr(Integer.parseInt(JOptionPane.showInputDialog("Skriv inn filmnummer")));
		filmInput.setTittel(JOptionPane.showInputDialog("Skriv inn film tittel"));
		filmInput.setFilmskaper(JOptionPane.showInputDialog("Skriv inn filmskaper"));
		filmInput.setAar(Integer.parseInt(JOptionPane.showInputDialog("Skriv aaret filmen kom ut")));
		filmInput.setFilmSelskap(JOptionPane.showInputDialog("Skriv inn selskapet som produserte filmen"));
		Sjanger filmSjanger = (Sjanger) JOptionPane.showInputDialog(null, "Velg Sjanger", "Sjangre", JOptionPane.QUESTION_MESSAGE, null, Sjanger.values(), Sjanger.ACTION);
		filmInput.setSjangeren(filmSjanger);
		
		
		return filmInput;
	}
	
	public void start()
	{
		Fil filen = new Fil();
		
		String[] operasjoner = {"Lese", "Skrive", "Opprett filmarkiv", "Statistikk", "Avslutt"}; 
		String s = (String) JOptionPane.showInputDialog(null, "Velg operasjon", "Operasjoner", JOptionPane.QUESTION_MESSAGE, null, operasjoner, operasjoner[0]);
		if(s.equals("Lese"))
		{
			String l = JOptionPane.showInputDialog("Skriv in navnet på filmarkivet du lese");
			filen.lesavFil(l);
			
		}
		else if(s.equals("Skrive"))
		{
			Film f = opprettFilm();
			filma.leggTil(f);
			String a = JOptionPane.showInputDialog("Skriv in navnet på filen du vil skrive til/opprette .txt blir lagt til automatisk");
			filen.skrivtilFil(a, filma);
		}
		else if(s.equals("Opprett filmarkiv"))
		{
			String fa = JOptionPane.showInputDialog("Skriv in navnet på filen du vil konvertere til filmarkiv");
			filma = filen.arkivfraFil(fa);
		}
		else if(s.equals("Statistikk"))
		{
			String[] valg = {"Filmer", "Produsenter", "Film Statistikk"}; 
			String filmStatistikk = (String) JOptionPane.showInputDialog(null, "Velg statistikk", "Statistikk", JOptionPane.QUESTION_MESSAGE, null, valg, valg[0]);
			
			switch(filmStatistikk)
			{
			case "Filmer":
			
				String ft = JOptionPane.showInputDialog("Skriv in deltittel du vil soke paa");
				grenseSnitt.skrivUtFilmer(ft, filma);
				break;
			case "Produsenter":
				String fp = JOptionPane.showInputDialog("Skriv in produsent du vil soke paa");
				grenseSnitt.produsentFilmer(fp, filma);
			case "Film Statistikk":
				grenseSnitt.filmStatistikk(filma);
			}
		}
		else if(s.equals("Avslutt"))
		{
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Input svarte ikke til noen kjent kommando!");
		}
		
		start();
		
	}



}
