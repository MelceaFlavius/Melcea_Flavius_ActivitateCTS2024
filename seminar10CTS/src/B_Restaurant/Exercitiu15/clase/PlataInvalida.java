package B_Restaurant.Exercitiu15.clase;

public class PlataInvalida extends ModPlata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println(nume+" nu are fonduri suficiente pentru realizarea platii in valoare de "+suma+" RON.");
    }
}