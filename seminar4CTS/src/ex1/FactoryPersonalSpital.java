package ex1;

public class FactoryPersonalSpital {
    public PersonalSpital crearePersonal(TipPersonal tip,String nume,int salariu,int vechime){
        switch (tip) {
            case BRANCARDIER -> {
                return new Brancardier(nume,salariu);
            }
            case ASISTENT -> {
                return new Asistent(nume,salariu);
            }
            case MEDIC -> {
                return new Medic(nume,salariu,vechime);
            }
            case INFIRMIER -> {
                return new Infirmier(nume,salariu);
            }
        }
        return null;
    }
}
