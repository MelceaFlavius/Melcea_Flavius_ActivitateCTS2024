package ex2;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }
    @Override
    public void afisare() {
        System.out.println("Infirmierul "+this.getNume()+" are salariul de "+this.getSalariu());
    }
}
