package no.hvl.data102;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import no.hvl.data102.adt.FilmArkivADT;

public class Fil {
	
	final static String SKILLE = "#";
	
	
	public void SkrivtilFil(String filnavn, FilmArkivADT filmtabell)
	{
		try
		{
			FileWriter filmFilSkriver = new FileWriter(filnavn);
			
		
			for(Film f : filmtabell.getFilmArkiv())
			{
				filmFilSkriver.write(f.toString());
			}
			filmFilSkriver.close();
		}
		catch(IOException e)
		{
			System.out.println("Ioexception");
		}
	}
	
	public void LesavFil(String filnavn) 
	{
		
			Scanner filmFilLeser = new Scanner(filnavn);
			while(filmFilLeser.hasNext())
			{
				System.out.println(filmFilLeser.next());
			}
			filmFilLeser.close();
		
	}
	
	public static FilmArkiv arkivfraFil(String navn)
	{
		Film[] filmer = new Film[100];
		int antall = 0;
		Scanner filmFilLeser = new Scanner(navn);
		while(filmFilLeser.hasNext())
		{
			//Ikke lagt til løsning med String.split her, må oppdatere
			
				filmer[antall].setFilmnr(filmFilLeser.nextInt());
				filmer[antall].setFilmskaper(filmFilLeser.nextLine());
				filmer[antall].setTittel(filmFilLeser.nextLine());
				filmer[antall].setAar(filmFilLeser.nextInt());
				filmer[antall].setFilmSelskap(filmFilLeser.nextLine());
				//filmer[antall].setSjangeren(filmFilLeser.nextLine()); Fikser denne senere.
				antall++;
		
		}
		filmFilLeser.close();
		
		FilmArkiv filma = new FilmArkiv(100); 
		for(Film f : filmer)
		{
			filma.leggTil(f);
		}
		
		
		return filma;
	}
	
	
}

