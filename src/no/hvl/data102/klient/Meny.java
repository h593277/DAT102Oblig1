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
	
	public Film OpprettFilm()
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
		
		
		String s = JOptionPane.showInputDialog("Skriv in onsket operasjon: lese, skrive, filmarkiv, avslutt");
		if(s.equals("lese"))
		{
			String l = JOptionPane.showInputDialog("Skriv in navnet på filmarkivet du lese");
			filen.LesavFil(l);
			
		}
		else if(s.equals("skrive"))
		{
			Film f = OpprettFilm();
			filma.leggTil(f);
			String a = JOptionPane.showInputDialog("Skriv in navnet på filen du vil skrive til/opprette .txt blir lagt til automatisk");
			filen.SkrivtilFil(a, filma);
		}
		else if(s.equals("filmarkiv"))
		{
			String fa = JOptionPane.showInputDialog("Skriv in navnet på filen du vil konvertere til filmarkiv");
			filen.arkivfraFil(fa);
		}
		else if(s.equals("avslutt"))
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
