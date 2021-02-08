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
			FileWriter filmFilSkriver = new FileWriter(filnavn + ".txt");
	
			for(Film f : filmtabell.getFilmArkiv())
			{
				String film = f.getFilmnr() + SKILLE + f.getFilmskaper() + SKILLE + f.getTittel() + SKILLE + f.getAar() + SKILLE + f.getFilmSelskap() + SKILLE + f.getSjangeren();
				filmFilSkriver.write(film);
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
		
			Scanner filmFilLeser = new Scanner(filnavn + ".txt");
			while(filmFilLeser.hasNext())
			{
				System.out.println(filmFilLeser.next());
			}
			filmFilLeser.close();
		
	}
	
	public static FilmArkiv arkivfraFil(String navn)
	{
		
		FilmArkiv filma = new FilmArkiv(100);
		Scanner filmFilLeser = new Scanner(navn + ".txt");
		while(filmFilLeser.hasNextLine())
		{
			String filmString = filmFilLeser.nextLine();
			String[] film = filmString.split(SKILLE);
			
			filma.leggTil(new Film(Integer.parseInt(film[0]), film[1], film[2], Integer.parseInt(film[3]), film[4], film[5]));
			
		
		}
		filmFilLeser.close();
		
		return filma;
	}
	
	
}

