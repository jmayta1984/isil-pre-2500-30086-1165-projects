package pe.isil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número natural: ");
        int n = scanner.nextInt();
        System.out.println("Suma: " + Demo.naturalAddition(n));
        System.out.println("Es par: " + Demo.isOdd(n));
        System.out.println("El mayor número es: " + Demo.maxNumber(15, 10));

        //System.out.println("¿Desea continuar: S(si)/N(no)");
        scanner.close();
    }
}
