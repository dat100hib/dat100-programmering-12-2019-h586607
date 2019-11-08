package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.Innlegg;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		
		boolean print = false;
		
		try {
			 PrintWriter skriver = new PrintWriter(filnavn);
			 
			 skriver.println(samling.toString());
			 
			 skriver.close();
			 
			 print = true;
		}
		catch(FileNotFoundException e) {
			
			print = false;
		}
			return print;
	}
}
