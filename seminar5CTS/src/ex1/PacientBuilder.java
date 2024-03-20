package ex1;

public class PacientBuilder implements Builder{
    private String nume;
    private int varsta;
    private boolean hasPatRabatabil=false;
    private boolean hasMicDejun=false;
    private boolean hasPapuciCamera=false;
    private boolean hasHalatInterior=false;

    public PacientBuilder(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public Builder setPatRabatabil() {
        this.hasPatRabatabil=true;
        return this;
    }

    @Override
    public Builder setMicDejun() {
        this.hasMicDejun=true;
        return this;
    }

    @Override
    public Builder setPapuciCamera() {
        this.hasPapuciCamera=true;
        return this;
    }

    @Override
    public Builder setHalatInterior() {
        this.hasHalatInterior=true;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume,this.varsta,this.hasPatRabatabil,
                this.hasMicDejun,this.hasPapuciCamera,
                this.hasHalatInterior);
    }
}
