package entities;

public class Konto {
		private double guthaben;
		private Person besitzer;
		
		public void setGuthaben (double newGuthaben){
			guthaben = newGuthaben;
		}
		
		public double getGuthaben(){
			return guthaben;
		}
		
		public Person getBesitzer() {
			return besitzer;
		}
		
		public void setBesitzer(Person besitzer) {
			this.besitzer = besitzer;
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
		
		public String toString() {
			return getBesitzer().toString() + " " + getGuthaben();
		}
	}

