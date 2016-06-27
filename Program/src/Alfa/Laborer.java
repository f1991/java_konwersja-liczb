package Alfa;

import java.util.Scanner;

public class Laborer {

	
	
	private final String [] tab_rzymskie = {"M" , "CM", "D" , "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private final int [] tab_arabskie =    {1000, 900 , 500 , 400 , 100, 90  , 50 ,  40 , 10 ,   9 ,  5 ,  4  ,  1  };
	private String Arabska="";
	private String Rzymska="";
	private int a2a;
	Scanner wpisz = new Scanner(System.in);

	
	
	public int sprawdzliczbe(String L)  // sprawdza czy arabska czy rzymska  //
	{
		Arabska=""; Rzymska=""; a2a=0;
		for (int i=0; i<L.length(); i++)
		{
			if ( 47<L.codePointAt(i)&& L.codePointAt(i)<58)	{	Arabska+=L.charAt(i); Arabska=Arabska.trim();  }
			if (L.charAt(i)=='X' || L.charAt(i)=='C'  || L.charAt(i)=='D' || L.charAt(i)=='M'|| L.charAt(i)=='V'|| L.charAt(i)=='L' || L.charAt(i)=='I') { Rzymska+=L.charAt(i); Rzymska=Rzymska.trim(); }
		}
		
		if (L.length()==Arabska.length()&&L.length()!=0)
		{
			a2a=Integer.parseInt(Arabska); 
			return 1; 
		}
		if (L.length()==Rzymska.length()&&L.length()!=0)
		{
			return 2;	
		}
		
		else return 0;	
	}	
	
	public boolean sprawdzArabska (int e)  // sprawdza arabska czy poprawna  //
	{
		if (e<1 || e>3999) return false;
		else return true;
	}
	
	public boolean sprawdzRzymska (String f)   // sprawdza rzymska czy poprawna  //
	{
		if (f.length() == 0) return false;
		if (!f.equals(doRzymskiej(doArabskiej(f)))||!sprawdzArabska(doArabskiej(f)))  return false;
		else return true;
	}
	
	private int doArabskiej(String rzymska)    // dokonuje konwersji do Arabskiej (od Rzymskiej) //
	{
		int wynik_arabska=0;
		int startindex=0;
		
		for (int i=0; i<tab_rzymskie.length; i++)
		{
		 while (rzymska.startsWith(tab_rzymskie[i],startindex))
			{
				wynik_arabska+=tab_arabskie[i];
				startindex+=tab_rzymskie[i].length();	//if (i%2==0) startindex++;					
														//else startindex+=2;
			}
		}
		
		return wynik_arabska;
	}
	
	private String doRzymskiej (int arabska)	// dokonuje konwersji do Rzymskiej (od Arabskiej)  //
	{
		String wynik_rzymska="";
		for (int i=0; i<tab_arabskie.length; i++)
		{
			while (tab_arabskie[i]<=arabska)
			{
				wynik_rzymska+=tab_rzymskie[i];
				arabska-=tab_arabskie[i];
			}
		}
		return wynik_rzymska;
	}

	protected void szablon( int i)		// szablon decyduj¹cy o wyœwietleniu wyniku w konsoli //
	{
		switch (i)
		{
		case 0:	Display.cosiestalo(0);  break; 
		case 1:{
				if (sprawdzArabska(a2a)==true)
					{
					Display.wynik_rzymska(doRzymskiej(a2a)); break;
					}
				else if (sprawdzArabska(a2a)==false) Display.cosiestalo(1); break;
				}
		case 2:{
				if (sprawdzRzymska(Rzymska)==true)
				{
					Display.wynik_arabska(doArabskiej(Rzymska)); break;
				}
				else if (sprawdzRzymska(Rzymska)==false) Display.cosiestalo(2); break;
				}
		}
	}	

	protected String szablon2( int i)	// szablon decyduj¹cy o wpisaniu wyniku do pliku //
	{
		if(i==0)	return Display.cosiestalo2(i);  
		if(i==1){
				if (sprawdzArabska(a2a)==true)
					{
					 return Display.wynik_rzymska2(doRzymskiej(a2a));
					}
					else if (sprawdzArabska(a2a)==false) return Display.cosiestalo2(i); 
				}
		if(i==2){
				if (sprawdzRzymska(Rzymska)==true)
				{
					 return Display.wynik_arabska2(doArabskiej(Rzymska));
				}
				else if (sprawdzRzymska(Rzymska)==false) return Display.cosiestalo2(i); 
				}
		return Display.cosiestalo2(i); 
	}
}	
