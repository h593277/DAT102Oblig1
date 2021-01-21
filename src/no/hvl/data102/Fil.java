package no.hvl.data102;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fil {
	
	final String SKILLE = "#";
	
	
	public void SkrivtilFil(String filnavn, FilmArkiv filmtabell)
	{
		try
		{
			FileWriter filmFilSkriver = new FileWriter(filnavn);
			
		
			for(Film f : filmtabell.filmArkivet)
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
		FilmArkiv filma = new FilmArkiv(100);
		
		return filma;
	}
	
	
}

