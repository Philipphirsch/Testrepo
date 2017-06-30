package entities;

public class Person {
    private String vorname;
    private String zuname;
    private int geburtsjahr;

    public void setVorname(String newVorname) {
        vorname = newVorname;
    }

    public void setZuname(String newZuname) {
        zuname = newZuname;
    }

    public void setGeburtsjahr(int newGeburtsjahr) {
        geburtsjahr = newGeburtsjahr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getZuname() {
        return zuname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }


    public String tostring() {
        return getVorname() + " " + getZuname() + " " + getGeburtsjahr();
}
}
