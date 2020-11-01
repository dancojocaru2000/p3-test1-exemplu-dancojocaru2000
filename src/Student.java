public class Student {
    private int varsta;
    private String nume;

    Student(String nume, Integer varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return String.format("%s %d", getNume(), getVarsta());
    }
}
