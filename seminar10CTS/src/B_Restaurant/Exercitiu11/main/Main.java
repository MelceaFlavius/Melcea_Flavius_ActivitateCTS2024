package B_Restaurant.Exercitiu11.main;

import B_Restaurant.Exercitiu11.clase.Client;
import B_Restaurant.Exercitiu11.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Ion");
        client1.realizeazaPlata(10.0);
        client1.setMetodaPlata(new PlataCash());
        client1.realizeazaPlata(20.0);
    }
}