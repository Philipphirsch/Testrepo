package entities;

public class App {
    public static void main(String[] args) {
        Student ich = new Student();
        ich.setVorname("Philipp");
        ich.setZuname("Hirsch");
        ich.setGeburtsjahr(1983);
        ich.setUni("Wien");

        Konto ichRaika = new Konto();
        ichRaika.setBesitzer(ich);
        ichRaika.setGuthaben(123.45);

        ichRaika.abheben(10);
        ichRaika.einzahlen(23);

        System.out.println(ichRaika.getBesitzer().getVorname() + " " + ichRaika.getBesitzer().getZuname() + " " + ichRaika.getBesitzer().getGeburtsjahr() + " " + ichRaika.getGuthaben());

        KontoFrame fenster = new KontoFrame();
        fenster.setKonto(ichRaika);
        fenster.setVisible(true);
        fenster.init();
    }
}
