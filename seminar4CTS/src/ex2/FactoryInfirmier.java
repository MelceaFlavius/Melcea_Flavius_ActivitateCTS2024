package ex2;

public class FactoryInfirmier implements FactoryPersonalSpital{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}