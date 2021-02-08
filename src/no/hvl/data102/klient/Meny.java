package no.hvl.data102.klient;

import javax.swing.JOptionPane;

import no.hvl.data102.Fil;
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
		Fil filen = new Fil();
		
		
		String s = JOptionPane.showInputDialog("Skriv in onsket operasjon: lese, skrive");
		if(s.equals("lese"))
		{
			String l = JOptionPane.showInputDialog("Skriv in navnet på filmarkivet du lese");
			filen.LesavFil(l);
			
		}
		else if(s.equals("skrive"))
		{
			String a = JOptionPane.showInputDialog("Skriv in navnet på filen du vil skrive til/opprette .txt blir lagt til automatisk");
			filen.SkrivtilFil(a, filma);
		}
		
	}



}
