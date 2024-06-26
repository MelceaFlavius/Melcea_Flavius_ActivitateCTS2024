package B_Restaurant.Exercitiu12.main;

import B_Restaurant.Exercitiu12.clase.observer.Client;
import B_Restaurant.Exercitiu12.clase.observer.Observer;
import B_Restaurant.Exercitiu12.clase.observer.Turist;
import B_Restaurant.Exercitiu12.clase.subiect.Restaurant;
import B_Restaurant.Exercitiu12.clase.subiect.SalaSport;
import B_Restaurant.Exercitiu12.clase.subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant=new Restaurant("Calea Dorobanti nr 22");
        Observer client1=new Client("Manole");
        Observer client2=new Client("Ana");
        Observer client3=new Client("Mircea");
        Observer client4=new Client("Ioana");

        restaurant.abonareClient(client1);
        restaurant.abonareClient(client2);

        restaurant.notificareSchimbareMeniu();

        restaurant.abonareClient(client3);
        restaurant.abonareClient(client4);

        restaurant.dezabonareClient(client2);

        System.out.println("-----------------------------------------------------------------------");
        restaurant.notificareEveniment("20/07/2024");

        System.out.println("-----------------------------------------------------------------------");
        Observer turist1=new Turist("Cristi");
        restaurant.abonareClient(turist1);
        restaurant.notificareSchimbareMeniu();

        System.out.println("-----------------------------------------------------------------------");
        Subiect salaSport=new SalaSport();

        salaSport.abonareClient(client1);
        salaSport.abonareClient(client2);
        ((SalaSport)salaSport).notificareMeciVolei("20/07/2024");
    }
}