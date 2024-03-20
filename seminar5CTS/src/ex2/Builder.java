package ex2;

public interface Builder {
    public abstract Builder setPatRabatabil(boolean hasPatRabatabil);
    public abstract Builder setMicDejun(boolean hasMicDejun);
    public abstract Builder setPapuciCamera(boolean hasPapuciCamera);
    public abstract Builder setHalatInterior(boolean hasHalatInterior);
    public abstract Pacient build();

}
