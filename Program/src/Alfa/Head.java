package Alfa;

import java.io.IOException;
 
public class Head {
	
	public static void main(String[] args) throws IOException {
		
		
		Display see = new Display();
		Laborer run = new Laborer();
		Files 	act = new Files();
		
		
		Display.powitanie ();
		Display.menu();
		
		
		while (true)
		{
			switch (see.pobierzOpcje())
			{
			case "EXIT":	{ System.out.println (" Zakoñczy³eœ dzia³anie programu!");	Display.koniec();	System.exit(0); break;}
			case "1": 		{ Display.jeszczeraz ();  run.szablon(run.sprawdzliczbe(see.pobierzLiczbe()));	see.zakoncz();  break;}
			case "2": 		{ Display.konsola_plik(); act.konsola2plik(see.pobierzZrodlo());				see.zakoncz();	break;}
			case "3": 		{ Display.plik_konsola(); act.czytanie2konsola(see.pobierzZrodlo());			see.zakoncz();  break;}
			case "4": 		{ Display.plik_plik(); 	  act.plik2plik(see.pobierzZrodlo());					see.zakoncz();	break;}
			case "5": 		{ System.out.println (" Zakoñczy³eœ dzia³anie programu!");	Display.koniec();	System.exit(0);	break;}
			default: 		{ System.out.println (" Wpisa³eœ inn¹ wartoœæ ni¿ przewidywano! Koniec!");	Display.koniec();  System.exit(0);}
			}
		}

	}
}
