package pe.isil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(10);
        Figura rectangulo = new Rectangulo(5, 10);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(rectangulo);

        for(Figura figura: figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
}