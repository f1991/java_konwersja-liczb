package Alfa;

import java.util.Scanner;

public class Display extends Laborer {

	private Scanner menu = new Scanner(System.in);      // Scanner od wyboru opcji z menu //
	private Scanner wpisz = new Scanner(System.in);		// Scanner który pobiera liczbe do przekonwertowania //
	private Scanner miejsce = new Scanner(System.in);	// Scanner wyboru Ÿród³a pliku //
	private Scanner zak = new Scanner(System.in);		// Scanner zakonczenie dzialania czy kontynuacja //

	
	
	public static void powitanie ()  
	{
		System.out.println 	("	|&|     	Witaj w programie który dokonuje konwersji liczb Arabskich i Rzymskich.          |&|");
	}
	
	public static void jeszczeraz ()  
	{
		System.out.println 	();
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	("	|&|                Podaj liczbê która ma byæ zamieniona (Arabska lub Rzymska)                    |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	();
	}
	
	public static void EXIT ()  
	{
		System.out.println 	();  
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	("	|&|               Kolejno wpisz liczby aby przerwaæ wpisywanie wpisz \"EXIT\".                     |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	();
	}
	
	
	public static void plik_konsola()     
	{
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   Wpisz jedynie nazwê pliku do którego chcesz siê odwo³aæ [pamiêtaj o roszerzeniu!].         |&|");
		System.out.println	("	|&|   Plik powinien zostaæ zapisany wprost na dysku C:\\\\   [Przyk³ad dane.txt]                   |&|");
		System.out.println	("	|&|   Jeœli chcesz mo¿esz podaæ œcie¿ke do pliku [przyk³ad Documents and Settings\\\\dane.txt      |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|\n");
	}
	
	
	
	public static void plik_plik()
	{
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   Mo¿esz wpisaæ jedynie nazwê pliku do którego chcesz siê odwo³aæ [pamiêtaj o roszerzeniu!]. |&|");
		System.out.println	("	|&|   Plik powinien zostaæ wtedy zapisany wprost na dysku C:\\\\   [Przyk³ad dane.txt.]            |&|");
		System.out.println	("	|&|   Mo¿esz równie¿ podaæ œcie¿ke do pliku [przyk³ad Documents and Settings\\dane.txt bez C:\\]   |&|");
		System.out.println	("	|&|   Wyniki zostan¹ zapisane tam gdzie plik odczytany [ \"nazwa_odczytanego_pliku-wyniki\"]       |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|\n");
	}
	
	public static void konsola_plik()
	{
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   Wpisz jedynie nazwê pliku do którego bêd¹ zpisywane wyniki [pamiêtaj o roszerzeniu pliku!].|&|");
		System.out.println	("	|&|   Plik zostanie zapisany wprost na dysku C:\\\\  Przyk³ad \"dane.txt\",                          |&|");
		System.out.println	("	|&|   lub jeœli chcesz mo¿esz podaæ œcie¿ke do pliku [przyk³ad Documents and Settings\\\\dane.txt  |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|\n");
	}
	
	
	public static void menu ()
	{
		System.out.println  ("	----------------------------------------------------------------------------------------------------");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	("	|&|   MENU      Wpisz numer z menu nastêpnie zatwierdŸ ENTEREM któr¹ opcje wybierasz.            |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   [\'1\']	Zamieñ liczbê Arabsk¹ lub Rzymsk¹.                                         	 |&|");
		System.out.println	("	|&|   [\'2\']	Dokonaj konwersji kilku liczb i zapisz wyniki do pliku.                          |&|");
		System.out.println	("	|&|   [\'3\']	Odczytaj liczby z pliku, dokonaj konwersj i wypisz je na konsole.                |&|");
		System.out.println	("	|&|   [\'4\']	Odczytaj liczby z pliku, dokonaj konwersj i zapisz do pliku wyniki.              |&|");
		System.out.println	("	|&|   [\'5\']	Wpisz \'exit\' lub \'5\' jeœli chcesz zakoñczyæ dzia³anie programu.	            	 |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println  ("	----------------------------------------------------------------------------------------------------");
	}
	
	
	public static void koniec ()
	{
		System.out.println ();
		System.out.println   ("				=======================================");
		System.out.println	 ("				||    _____  __    __  _   _____     ||	");
		System.out.println	 ("				||   | ____| \\ \\  / / | | |_   _|    ||	");
		System.out.println	 ("				||   | |__    \\ \\/ /  | |   | |      ||	");
		System.out.println	 ("				||   |  __|    }  {   | |   | |      ||	");
		System.out.println	 ("				||   | |___   / /\\ \\  | |   | |      ||	");
		System.out.println   ("				||   |_____| /_/  \\_\\ |_|   |_|      ||	");
		System.out.println	 ("				||				     ||	");
		System.out.println   ("				=======================================		");
	}
	
	public static void sukces()
	{
		System.out.println   ("	  ========================================================");
		System.out.println 	 ("	  ||   _____   _   _   _   _    _____   _____   _____   ||");
		System.out.println 	 ("	  ||  /  ___/ | | | | | | / /  /  ___| | ____| /  ___/  ||");
		System.out.println   ("	  ||  | |___  | | | | | |/ /   | |     | |__  | |___    ||");
		System.out.println   ("	  ||  \\___  \\ | | | | | |\\ \\   | |     |  __| \\___  \\   ||");
		System.out.println   ("	  ||   ___| | | |_| | | | \\ \\  | |___  | |___   ___| |  ||");
		System.out.println   ("	  ||  /_____/ \\_____/ |_|  \\_\\ \\_____| |_____| /_____/  ||");
		System.out.println   ("	  ||\t\t\t\t\t\t      	||");
		System.out.println   ("	  ========================================================");
		
	}
	
	public String pobierzOpcje()    // pobiera opcje z menu //
	{
		String Opcja="";
		System.out.println  ();
		System.out.print  ("Wpisz opcjê z menu: ");
		Opcja = menu.nextLine();
		Opcja = Opcja.trim();
		Opcja = Opcja.toUpperCase();
		
		return Opcja;
	}
	
	protected String pobierzLiczbe ()  // pobiera liczbe do konwersji // 
	{
		
		System.out.print  ("Wpisz liczbê: ");
		String L; L=null;
		L = wpisz.nextLine();
		L=L.trim(); 
		L=L.toUpperCase();
	
		return L;
	}
	
	public String pobierzZrodlo()   // pobiera od u¿ytkownika nazwe pliku, mo¿emy te¿ podaæ lokacje jednak bêdzie on zapisany na dysku C:\\  //
	{
		System.out.print ("Wpisz nazwê pliku: ");
		String zrodlo; zrodlo="";
		zrodlo = miejsce.nextLine();
		zrodlo=zrodlo.trim();     // usuwa bia³e znaki przed i po wpisanym tekscie np "          dane.txt" = "dane.txt"
		System.out.println (zrodlo);
		return zrodlo;
	}
	
	public static void cosiestalo(int i)  // wyswietla b³êdy przy konwersji liczb wpisanych z klawiatury (na konsole) //
	{
		switch (i)
		{
		case 0: {System.out.println ("Poda³eœ nieprawid³ow¹ liczbe do przekonwertowania.");  break;}
		case 1: {System.out.println ("Poda³eœ nieprawid³ow¹ liczbe arabska.");			 	 break;}
		case 2: {System.out.println ("Poda³eœ nieprawid³ow¹ liczbe rzymsk¹.");				 break;}
		
		}	
	}
	
	public static String cosiestalo2(int i)		// wyswietla b³êdy przy konwersji liczb przeczytanych z pliku (wrzuca je do pliku) //
	{
	String a,b,c,d;	
	
		if (i==0) 	{a= "Poda³eœ nieprawid³ow¹ liczbê do przekonwertowania!"; 	return a;}	 
		if (i==1) 	{b= "Poda³eœ nieprawid³ow¹ liczbe arabsk¹!";				return b;}		
		if (i==2)	{c= "Poda³eœ nieprawid³ow¹ liczbe rzymsk¹!";				return c;}
		else		{d= "Nie wiem co siê sta³o."; 								return d;}

	}
	

	public void zakoncz () // Pracuje dalej albo koñczy dzia³anie programu. //
	{
		System.out.println 	();
		System.out.println  ("	|&|-----------------------------------------------------------|&|");
		System.out.println	("	|&|   [\'0\'] Przerwij program.      [\'1\'] Kontynuuj.           |&|");
		System.out.println  ("	|&|-----------------------------------------------------------|&|");
		System.out.println 	();
		System.out.print 	("Dokonaj wyboru: ");

			String odpowiedz=null; 
			odpowiedz = zak.nextLine();
			odpowiedz = odpowiedz.trim();
			odpowiedz = odpowiedz.toUpperCase();

		if (odpowiedz.equals("0"))
		{
			System.out.println (" Zakoñczy³eœ dzia³anie programu!"); koniec(); System.exit(0); 
		}
		if (odpowiedz.equals("1"))
		{
			System.out.println  ("	|&|-----------------------------------------------------------|&|");
			System.out.println	("	|&|        Wybra³eœ kontynuuj wybierz opcje z menu.           |&|");
			System.out.println  ("	|&|-----------------------------------------------------------|&|");
		}
		else {System.out.println (" Wpisa³eœ inn¹ wartoœæ ni¿ 1 lub 0! Zakoñczy³eœ dzia³anie programu!"); koniec(); System.exit(0);}
	}
	

	public static void wynik_arabska (int a)   // printuje wynik  zamiany do arabskiej dla  wpisywania liczby z klawiatury  //
	{
		System.out.println ("Arabska to: "+a);
	}
	
	public static void wynik_rzymska (String a)  // printuje wynik  zamiany do rzymskiej dla  wpisywania liczby z klawiatury  //
	{
		System.out.println ("Rzymska to: "+a);
	}
	
	public static String wynik_arabska2 (int a)		// zamienia int na string ¿eby mo¿na by³o zapisaæ do pliku jedn¹ metod¹ (oba wyniki String)  //
	{
		String b="";
	    b = Integer.toString(a);
	    
	    return b;
	}
	
	public static String wynik_rzymska2 (String a)   //   wrzuca obliczon¹ rzymsk¹ do pliku  //
	{
		 return a;
	}
	

}

