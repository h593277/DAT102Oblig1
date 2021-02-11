package no.hvl.data102;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import no.hvl.data102.adt.FilmArkivADT;

public class Fil {
	
	final static String SKILLE = "#";
	
	public void skrivtilFil(String filnavn, FilmArkivADT filmtabell)
	{
		try
		{
			FileWriter filmFilSkriver = new FileWriter(filnavn + ".txt");
			Film[] f = filmtabell.getFilmArkiv();
			for(int i = 0; i < filmtabell.antallFilmer(); i++){
				
				String film = f[i].getFilmnr() + SKILLE + f[i].getFilmskaper() + SKILLE + f[i].getTittel() + SKILLE + f[i].getAar() + 
							SKILLE + f[i].getFilmSelskap() + SKILLE + f[i].getSjangeren() + "\n";
				System.out.print(film);
				filmFilSkriver.write(film);
			}
			filmFilSkriver.close();
		}
		catch(IOException e)
		{
			System.out.println("Ioexception");
			
		}
		
	}
	
	public void lesavFil(String filnavn) 
	{
		
			Scanner filmFilLeser;
			try {
				filmFilLeser = new Scanner(new File(filnavn + ".txt"));
			
				while(filmFilLeser.hasNextLine())
				{
					System.out.println(filmFilLeser.nextLine());
				}
				filmFilLeser.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static FilmArkivADT arkivfraFil(String navn)
	{
		
		FilmArkiv filma = new FilmArkiv(100);
		Scanner filmFilLeser;
		try {
			filmFilLeser = new Scanner(new File(navn + ".txt"));
			while(filmFilLeser.hasNextLine())
			{
				String filmString = filmFilLeser.nextLine();
				String[] film = filmString.split(SKILLE);
				
				filma.leggTil(new Film(Integer.parseInt(film[0]), film[1], film[2], Integer.parseInt(film[3]), film[4], film[5]));
				
			
			}
			filmFilLeser.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filma;
	}
	
	
}

