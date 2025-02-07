package pe.isil;

public class Main {
    public static void main(String[] args) {

        System.out.println("El valor de PI es: " + Math.PI);

        /*
         * max
         */
        System.out.println("El número mayor es: " + Math.max(14, 6));

        /*
         * decrementExact
         */

        System.out.println("El número previo es: " + Math.decrementExact(10));

        /*
         * floorDiv
         */
        System.out.println("El cociente es: " + Math.floorDiv(-15, 4));

        System.out.println("El cociente es: " + -15 / 4);

        /*
         * floorMod
         */
        System.out.println("El residuo es: " + Math.floorMod(-15, 4));

        System.out.println("El residuo es: " + -15 % 4);

        /*
         * sqrt
         */
        System.out.println("La raíz cuadrada es: " + Math.sqrt(72));

        /*
         * ceil
         */
        System.out.println("El número redondeado es: " + Math.ceil(7.8));

        System.out.println("El número redondeado es: " + Math.ceil(-7.8));

    }


}