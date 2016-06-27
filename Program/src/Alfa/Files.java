package Alfa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files extends Laborer {
	
	final private String c = "C:\\";			// Sta�a c kt�ra domy�lnie definiuje dysk C://  //
	private BufferedReader czytanie = null;
    private PrintWriter pisz = null;
	private String tekst="";
	private String przeczytana="";
	private String wpisalem="";
   
    		
    public void czytanie2konsola(String zrodlo) throws IOException        // czyta z pliku i printuje na konsole  (pobiera od u�ytkownika nazwe pliku lub lokalizacje i nazw�//
    {
    	try { 				// OTWIERANIE PLIKU //
    		czytanie = new BufferedReader (new FileReader(c+zrodlo),512);
    	} catch (FileNotFoundException e){
    		System.out.println("B��D PRZY OTWIERANIU PLIKU!");
    		System.exit(1);
    	}

    	try { 				//  ODCZYT Z PLIKU
    	
    		while ((tekst=czytanie.readLine())!=null) 
    		{
    			if (tekst.equals(""))continue;					// je�li wczytana linia jest pusta to przechodzi dalej eliminuje b��d przy czytaniu liczby po kilku pustych wierszach // 
    			tekst=tekst.toUpperCase(); tekst=tekst.trim();  // zamienia na du�e litery i obcina niepotrzebne spacje //
    			System.out.print (tekst+"\t---->\t");
    			System.out.println(szablon2(sprawdzliczbe(tekst)));
    			tekst="";
    		}
    	} catch (Exception e1){
    		System.out.println("B��D PROGRAMU!");
    		System.exit(2);
    	}
    	try {       		//ZAMYKANIE PLIKU:
    		czytanie.close();
    	} catch (IOException e){
    		System.out.println("B��D PRZY ZAMYKANIU PLIKU!");
    		System.exit(3); 
    	}    
    }

    public void plik2plik (String zrodlo) throws FileNotFoundException  // czyta z pliku zapisuje wynik do pliku C:\\wyniki_"NAZWA PLIKU.txt"//
    {	
		try {
				czytanie = new BufferedReader (new FileReader(c+zrodlo),512);
				
				// dzi�ki String M mo�emy podawa� �cie�k� do pliku z tym �e sta�� jest C:\\ np. C:\\Documents and Settings\\All Users\\dane.txt
				// a plik z wynikami b�dzie zapisany tam gdzie plik z danymi czyli 				C:\\Documents and Settings\\All Users\\dane-wyniki.txt
				// opis: sta�a c="C:\\"+wycinek tego co wpisali�my od pocz�tku tekstu do ostatniej kropki"+"-wyniki"+"wycinek od ostatniej kropki do ko�ca tekstu"
				// pozwala to np. na u�ycie �cie�ki C:\\Dane.Do.Przetworzenia\\dane.txt poniewa� b�dzie szuka� miejsca ostatniej kropki a nie pierwszej.
				
				String M = c+zrodlo.substring(0,zrodlo.lastIndexOf('.'))+"-wyniki"+zrodlo.substring(zrodlo.lastIndexOf('.'));
				pisz = new PrintWriter(M); 		
		} catch (FileNotFoundException e) {
		       System.out.println("B��D PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		       }
		
		try {
		     pisz.println ("==================================================================================");
		     pisz.println ("       "+"Przeczytana"+"\t ||\t"+"  Przekonwertowana");
		     pisz.println ("==================================================================================");
		     
		     while ((przeczytana=czytanie.readLine())!=null) 
		     	{
		    	 if (przeczytana.length()==0) continue;
		    	 przeczytana=przeczytana.toUpperCase(); przeczytana=przeczytana.trim();
		    	 System.out.println ("Przeczyta�em : " +przeczytana);
		    	   
		    	 pisz.println("\t"+przeczytana+"\t\t || \t"+szablon2(sprawdzliczbe(przeczytana)));
		    	 pisz.println ("----------------------------------------------------------------------------------");
		    	 przeczytana="";
		     	}
		    } catch (IOException e1) {
		    	System.out.println("B��D ODCZYTU Z PLIKU!");
		        System.exit(2);
		    }
		
		try { 				//ZAMYKANIE PLIKU:
		     czytanie.close();
		     pisz.close();
		     System.out.println ("Zapis do pliku: "+c+"\\"+zrodlo.substring(0,zrodlo.lastIndexOf('.'))+"-wyniki"+zrodlo.substring(zrodlo.lastIndexOf('.'))+
		     " zako�czy� si� pomy�lnie!");
		     Display.sukces();
		    } catch (IOException e) {
		    	System.out.println("B��D PRZY ZAMYKANIU PLIKU!");
		    	System.exit(3); 
		    }    
    }
    
    public void konsola2plik (String zrodlo) throws FileNotFoundException
    {
    	Scanner konsola = new Scanner(System.in);
    		
    	try {
    		pisz = new PrintWriter(c+zrodlo); 
    	} catch (FileNotFoundException e) {
 		    System.out.println("B��D PRZY OTWIERANIU PLIKU!");
 		    System.exit(1);
 		}
    		
    	Display.EXIT();
    	wpisalem = "";
    		
    	try {
  	
    		pisz.println ("==================================================================================");
    		pisz.println ("        "+"Wpisana  "+"\t ||\t"+"  Przekonwertowana");
   	     	pisz.println ("==================================================================================");
    		
   	     	while (!wpisalem.equals("EXIT"))
 		     	{
   		     	System.out.print("Wpisz liczb�: ");
   		     	wpisalem = konsola.next();
    			
   		     	wpisalem=wpisalem.trim(); wpisalem=wpisalem.toUpperCase(); 
   		     	if(wpisalem.equals("EXIT")) continue;
   		     	pisz.println("\t"+wpisalem+"\t\t || \t"+szablon2(sprawdzliczbe(wpisalem)));
   		     	pisz.println ("----------------------------------------------------------------------------------");
   		     	}
    	} catch (Exception e1) {
		    System.out.println("B��D ODCZYTU Z PLIKU!");
		    System.exit(2);
		}
    	try {
    		pisz.close();
    		System.out.println ("Zapis do pliku: "+c+zrodlo+" zako�czy� si� pomy�lnie!");
	        Display.sukces();
    		}
    	catch (Exception e) {
	    	System.out.println("B��D PRZY ZAMYKANIU PLIKU!");
	    	System.exit(3); 
    		}   
    	}
}
