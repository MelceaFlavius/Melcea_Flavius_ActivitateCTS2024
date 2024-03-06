package model;

import singleton.Guvern;


public class Program {
    public static void main(String[] args) {
        Guvern guvern=Guvern.getInstance(5, "Manole", 12);
        Guvern guvern2=Guvern.getInstance(8, "Manolica", 15);

        System.out.println(guvern);
        System.out.println(guvern2);
    }
}
