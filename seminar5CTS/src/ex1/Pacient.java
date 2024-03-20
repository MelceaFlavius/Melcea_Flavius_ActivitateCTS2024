package ex1;

public class Pacient {
    private final String nume;
    private final int varsta;
    private final boolean hasPatRabatabil;
    private final boolean hasMicDejun;
    private final boolean hasPapuciCamera;
    private final boolean hasHalatInterior;

    protected Pacient(String nume, int varsta, boolean hasPatRabatabil,
                      boolean hasMicDejun, boolean hasPapuciCamera,
                      boolean hasHalatInterior) {
        this.nume = nume;
        this.varsta = varsta;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciCamera = hasPapuciCamera;
        this.hasHalatInterior = hasHalatInterior;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isHasPatRabatabil() {
        return hasPatRabatabil;
    }

    public boolean isHasMicDejun() {
        return hasMicDejun;
    }

    public boolean isHasPapuciCamera() {
        return hasPapuciCamera;
    }

    public boolean isHasHalatInterior() {
        return hasHalatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejun=" + hasMicDejun +
                ", hasPapuciCamera=" + hasPapuciCamera +
                ", hasHalatInterior=" + hasHalatInterior +
                '}';
    }
}
