package entities;

public class Student extends Person {
    private String uni;

    public void setUni(String newUni) {
        uni = newUni;
    }

    public String getUni() {
        return uni;
    }

    public String toString() {
        return super.toString() + " (" + getUni() + ")";
    }
}
