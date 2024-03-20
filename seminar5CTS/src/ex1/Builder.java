package ex1;

public interface Builder {
    public abstract Builder setPatRabatabil();
    public abstract Builder setMicDejun();
    public abstract Builder setPapuciCamera();
    public abstract Builder setHalatInterior();
    public abstract Pacient build();
}
