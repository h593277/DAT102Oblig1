package no.hvl.data102;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fil {
	
	Film[] filmtilFil;
	File filmFil = new File("Filmarkiv.txt");
	
	public Fil(FilmArkiv filmer)
	{
		filmtilFil = filmer.filmArkivet;
	}
	
	
	public void SkrivtilFil()
	{
		try
		{
			FileWriter filmFilSkriver = new FileWriter(filmFil);
			for(Film f : filmtilFil)
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
	
	public void LesavFil() 
	{
		try
		{
			Scanner filmFilLeser = new Scanner(filmFil);
			while(filmFilLeser.hasNext())
			{
				System.out.println(filmFilLeser.next());
			}
			filmFilLeser.close();
		}
		catch(IOException e)
		{
			System.out.println("Ioexception");
		}
	}
	
	
}

