package pe.isil;

public class Demo {

    /*
     * Ejercicio 1
     * Crear un método que retorne la suma de los primeros n números naturales
     */

    public static int naturalAddition(int n) {

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
            // System.out.println("Número: " + i);
            // System.out.println("Suma: " + result);
        }
        return result;
    }

    /*
     * Ejercicio 2
     * Crear un método que reciba como parámetro un número entero, y retorne
     * verdadero si el número es par o false si el número es impar
     */

    public static boolean isOdd(int number) {
        return (number % 2) == 0;
    }

    /*
     * Ejercicio 3
     * Crear un método que reciba dos números enteros y retorne el mayor de ellos
     */

     public static int maxNumber(int a, int b){
        return (a > b) ? a : b; 
     }
}
