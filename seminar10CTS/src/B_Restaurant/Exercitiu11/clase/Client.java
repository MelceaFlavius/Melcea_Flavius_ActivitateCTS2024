package B_Restaurant.Exercitiu11.clase;

public class Client {
    private String nume;
    private MetodaPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCard();
    }

    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void realizeazaPlata(double suma){
        this.metodaPlata.realizeazaPlata(suma,this.nume);
    }
}