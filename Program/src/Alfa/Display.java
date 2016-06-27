package Alfa;

import java.util.Scanner;

public class Display extends Laborer {

	private Scanner menu = new Scanner(System.in);      // Scanner od wyboru opcji z menu //
	private Scanner wpisz = new Scanner(System.in);		// Scanner kt�ry pobiera liczbe do przekonwertowania //
	private Scanner miejsce = new Scanner(System.in);	// Scanner wyboru �r�d�a pliku //
	private Scanner zak = new Scanner(System.in);		// Scanner zakonczenie dzialania czy kontynuacja //

	
	
	public static void powitanie ()  
	{
		System.out.println 	("	|&|     	Witaj w programie kt�ry dokonuje konwersji liczb Arabskich i Rzymskich.          |&|");
	}
	
	public static void jeszczeraz ()  
	{
		System.out.println 	();
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	("	|&|                Podaj liczb� kt�ra ma by� zamieniona (Arabska lub Rzymska)                    |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	();
	}
	
	public static void EXIT ()  
	{
		System.out.println 	();  
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	("	|&|               Kolejno wpisz liczby aby przerwa� wpisywanie wpisz \"EXIT\".                     |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	();
	}
	
	
	public static void plik_konsola()     
	{
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   Wpisz jedynie nazw� pliku do kt�rego chcesz si� odwo�a� [pami�taj o roszerzeniu!].         |&|");
		System.out.println	("	|&|   Plik powinien zosta� zapisany wprost na dysku C:\\\\   [Przyk�ad dane.txt]                   |&|");
		System.out.println	("	|&|   Je�li chcesz mo�esz poda� �cie�ke do pliku [przyk�ad Documents and Settings\\\\dane.txt      |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|\n");
	}
	
	
	
	public static void plik_plik()
	{
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   Mo�esz wpisa� jedynie nazw� pliku do kt�rego chcesz si� odwo�a� [pami�taj o roszerzeniu!]. |&|");
		System.out.println	("	|&|   Plik powinien zosta� wtedy zapisany wprost na dysku C:\\\\   [Przyk�ad dane.txt.]            |&|");
		System.out.println	("	|&|   Mo�esz r�wnie� poda� �cie�ke do pliku [przyk�ad Documents and Settings\\dane.txt bez C:\\]   |&|");
		System.out.println	("	|&|   Wyniki zostan� zapisane tam gdzie plik odczytany [ \"nazwa_odczytanego_pliku-wyniki\"]       |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|\n");
	}
	
	public static void konsola_plik()
	{
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   Wpisz jedynie nazw� pliku do kt�rego b�d� zpisywane wyniki [pami�taj o roszerzeniu pliku!].|&|");
		System.out.println	("	|&|   Plik zostanie zapisany wprost na dysku C:\\\\  Przyk�ad \"dane.txt\",                          |&|");
		System.out.println	("	|&|   lub je�li chcesz mo�esz poda� �cie�ke do pliku [przyk�ad Documents and Settings\\\\dane.txt  |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|\n");
	}
	
	
	public static void menu ()
	{
		System.out.println  ("	----------------------------------------------------------------------------------------------------");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println 	("	|&|   MENU      Wpisz numer z menu nast�pnie zatwierd� ENTEREM kt�r� opcje wybierasz.            |&|");
		System.out.println  ("	|&|----------------------------------------------------------------------------------------------|&|");
		System.out.println	("	|&|   [\'1\']	Zamie� liczb� Arabsk� lub Rzymsk�.                                         	 |&|");
		System.out.println	("	|&|   [\'2\']	Dokonaj konwersji kilku liczb i zapisz wyniki do pliku.                          |&|");
		System.out.println	("	|&|   [\'3\']	Odczytaj liczby z pliku, dokonaj konwersj i wypisz je na konsole.                |&|");
		System.out.println	("	|&|   [\'4\']	Odczytaj liczby z pliku, dokonaj konwersj i zapisz do pliku wyniki.              |&|");
		System.out.println	("	|&|   [\'5\']	Wpisz \'exit\' lub \'5\' je�li chcesz zako�czy� dzia�anie programu.	            	 |&|");
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
		System.out.print  ("Wpisz opcj� z menu: ");
		Opcja = menu.nextLine();
		Opcja = Opcja.trim();
		Opcja = Opcja.toUpperCase();
		
		return Opcja;
	}
	
	protected String pobierzLiczbe ()  // pobiera liczbe do konwersji // 
	{
		
		System.out.print  ("Wpisz liczb�: ");
		String L; L=null;
		L = wpisz.nextLine();
		L=L.trim(); 
		L=L.toUpperCase();
	
		return L;
	}
	
	public String pobierzZrodlo()   // pobiera od u�ytkownika nazwe pliku, mo�emy te� poda� lokacje jednak b�dzie on zapisany na dysku C:\\  //
	{
		System.out.print ("Wpisz nazw� pliku: ");
		String zrodlo; zrodlo="";
		zrodlo = miejsce.nextLine();
		zrodlo=zrodlo.trim();     // usuwa bia�e znaki przed i po wpisanym tekscie np "          dane.txt" = "dane.txt"
		System.out.println (zrodlo);
		return zrodlo;
	}
	
	public static void cosiestalo(int i)  // wyswietla b��dy przy konwersji liczb wpisanych z klawiatury (na konsole) //
	{
		switch (i)
		{
		case 0: {System.out.println ("Poda�e� nieprawid�ow� liczbe do przekonwertowania.");  break;}
		case 1: {System.out.println ("Poda�e� nieprawid�ow� liczbe arabska.");			 	 break;}
		case 2: {System.out.println ("Poda�e� nieprawid�ow� liczbe rzymsk�.");				 break;}
		
		}	
	}
	
	public static String cosiestalo2(int i)		// wyswietla b��dy przy konwersji liczb przeczytanych z pliku (wrzuca je do pliku) //
	{
	String a,b,c,d;	
	
		if (i==0) 	{a= "Poda�e� nieprawid�ow� liczb� do przekonwertowania!"; 	return a;}	 
		if (i==1) 	{b= "Poda�e� nieprawid�ow� liczbe arabsk�!";				return b;}		
		if (i==2)	{c= "Poda�e� nieprawid�ow� liczbe rzymsk�!";				return c;}
		else		{d= "Nie wiem co si� sta�o."; 								return d;}

	}
	

	public void zakoncz () // Pracuje dalej albo ko�czy dzia�anie programu. //
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
			System.out.println (" Zako�czy�e� dzia�anie programu!"); koniec(); System.exit(0); 
		}
		if (odpowiedz.equals("1"))
		{
			System.out.println  ("	|&|-----------------------------------------------------------|&|");
			System.out.println	("	|&|        Wybra�e� kontynuuj wybierz opcje z menu.           |&|");
			System.out.println  ("	|&|-----------------------------------------------------------|&|");
		}
		else {System.out.println (" Wpisa�e� inn� warto�� ni� 1 lub 0! Zako�czy�e� dzia�anie programu!"); koniec(); System.exit(0);}
	}
	

	public static void wynik_arabska (int a)   // printuje wynik  zamiany do arabskiej dla  wpisywania liczby z klawiatury  //
	{
		System.out.println ("Arabska to: "+a);
	}
	
	public static void wynik_rzymska (String a)  // printuje wynik  zamiany do rzymskiej dla  wpisywania liczby z klawiatury  //
	{
		System.out.println ("Rzymska to: "+a);
	}
	
	public static String wynik_arabska2 (int a)		// zamienia int na string �eby mo�na by�o zapisa� do pliku jedn� metod� (oba wyniki String)  //
	{
		String b="";
	    b = Integer.toString(a);
	    
	    return b;
	}
	
	public static String wynik_rzymska2 (String a)   //   wrzuca obliczon� rzymsk� do pliku  //
	{
		 return a;
	}
	

}

