package ex2;

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
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDejun=").append(hasMicDejun);
        sb.append(", hasPapuciCamera=").append(hasPapuciCamera);
        sb.append(", hasHalatInterior=").append(hasHalatInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements Builder {

        private String nume;
        private int varsta;
        private boolean hasPatRabatabil;
        private boolean hasMicDejun;
        private boolean hasPapuciCamera;
        private boolean hasHalatInterior;

        public PacientBuilder(String nume, int varsta) {
            this.nume = nume;
            this.varsta = varsta;
        }

        @Override
        public Builder setPatRabatabil(boolean hasPatRabatabil) {
            this.hasPatRabatabil=hasPatRabatabil;
            return this;
        }

        @Override
        public Builder setMicDejun(boolean hasMicDejun) {
            this.hasMicDejun=hasMicDejun;
            return this;
        }

        @Override
        public Builder setPapuciCamera(boolean hasPapuciCamera) {
            this.hasPapuciCamera=hasPapuciCamera;
            return this;
        }

        @Override
        public Builder setHalatInterior(boolean hasHalatInterior) {
            this.hasHalatInterior=hasHalatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(nume,varsta,hasPatRabatabil,
                    hasMicDejun,
                    hasPapuciCamera,
                    hasHalatInterior);
        }
    }
}