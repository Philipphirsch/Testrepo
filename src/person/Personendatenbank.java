package person;


public class Personendatenbank {
	private String vorname;
	private String zuname;
	private int geburtsjahr;
	
	public void setVorname (String newVorname){
		vorname = newVorname;
	}
	public void setZuname (String newZuname){
		zuname = newZuname;
	}
	public void setGeburtsjahr (int newGeburtsjahr){
		geburtsjahr = newGeburtsjahr;
	}
	
	public String getVorname(){
		return vorname;
	}
	public String getZuname(){
		return zuname;
	}
	public int getGeburtsjahr(){
		return geburtsjahr;
	}
	

public class Student extends Personendatenbank {
	private String uni;
	public void setUni (String newUni){
		uni = newUni;
	}
	public String getUni(){
		return uni;
	}
}


public class Konto extends Personendatenbank{
	private double guthaben;
	private Konto meinKonto;
	public void setGuthaben (double newGuthaben){
		guthaben = newGuthaben;
	}
	
	public double getGuthaben(){
		return guthaben;
	}
	
	public void einzahlen (double betrag){
		if (betrag >= 0){
			guthaben = guthaben + betrag;
		}
		else{
			System.out.println("Betrag zu gering");
		}
	}
	
	public void abheben (double betrag){
		if (betrag >= 0){
			guthaben = guthaben - betrag;
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
		s = Student.vorname + " " + Personendatenbank.zuname + " " + Personendatenbank.geburtsjahr + " " + Student.uni;
		return s;		
	}
	
	public static String tostringKonto()
	{
		String s;
		String Guthaben = String.valueOf(Konto.guthaben);
		s = Student.vorname + " " + Personendatenbank.zuname + " " + Personendatenbank.geburtsjahr + " " + Konto.guthaben;
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
