package person;

import java.awt.*;
import java.awt.event.*;
import java.text.*;



public class Personendatenbank {
	private String Vorname;
	private String Zuname;
	private int Geburtsjahr;
	
	public void setVorname (String NewVorname){
		Vorname = NewVorname;
	}
	public void setZuname (String NewZuname){
		Zuname = NewZuname;
	}
	public void setGeburtsjahr (int NewGeburtsjahr){
		Geburtsjahr = NewGeburtsjahr;
	}
	
	public String getVorname(){
		return Vorname;
	}
	public String getZuname(){
		return Zuname;
	}
	public int getGeburtsjahr(){
		return Geburtsjahr;
	}
	

public class Student extends Personendatenbank {
	private String Uni;
	public void setUni (String NewUni){
		Uni = NewUni;
	}
	public String getUni(){
		return Uni;
	}
}


public class Konto extends Personendatenbank{
	private double guthaben;
	private Konto meinKonto=null;
	public void setGuthaben (double newGuthaben){
		guthaben = newGuthaben;
	}
	
	public double getGuthaben(){
		return guthaben;
	}
	
	public void einzahlen (double betrag){
		if (betrag >= 0){
			guthaben = guthaben+betrag;
		}
		else{
			System.out.println("Betrag zu gering");
		}
	}
	
	public void abheben (double betrag){
		if (betrag >= 0){
			guthaben = guthaben-betrag;
		}
		else{
			System.out.println("Betrag zu gering");
		}
	}
	
	public void setKonto (Konto k){
		this.meinKonto = k;
	}
	
	public Konto getKonto(){
		return meinKonto;
	}
}


	/*public static String tostring()
	{
		String s;
		Personendatenbank.getVorname();
		s = Student.Vorname + " " + Personendatenbank.Zuname + " " + Personendatenbank.Geburtsjahr + " " + Student.Uni;
		return s;		
	}
	
	public static String tostringKonto()
	{
		String s;
		String Guthaben = String.valueOf(Konto.guthaben);
		s = Student.Vorname + " " + Personendatenbank.Zuname + " " + Personendatenbank.Geburtsjahr + " " + Konto.guthaben;
		return s;		
	}*/

public static void main (String[] args){
		Personendatenbank ich = new Personendatenbank();
		//Student ich_student = ich.new Student();
		//ich.setVorname("Philipp");
		//ich.setZuname("Hirsch");
		//ich.setGeburtsjahr(1983);
		//ich_student.setUni("Wien");
		
		
		Konto ich_raika = ich.new Konto();
		ich_raika.setVorname("Philipp");
		ich_raika.setZuname("Hirsch");
		ich_raika.setGeburtsjahr(1983);
		ich_raika.setGuthaben(123.45);
		
		ich_raika.abheben(10);
		ich_raika.einzahlen(23);
		
		System.out.println(ich_raika.getVorname()  + " " + ich_raika.getZuname() + " " + ich_raika.getGeburtsjahr() + " " + ich_raika.getGuthaben());
		//System.out.println(tostringKonto());
		
		KontoFrame fenster = new KontoFrame();
		//fenster.setKonto(ich_raika);
		fenster.setVisible(true);
		fenster.init();
		
		
	}
}
