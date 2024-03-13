package ex2;

public class FactoryBrancardier implements FactoryPersonalSpital{

    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}