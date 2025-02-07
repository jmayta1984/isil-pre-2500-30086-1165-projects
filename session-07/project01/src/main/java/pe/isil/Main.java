package pe.isil;

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello, ISIL";

        /*
         * charAt
         */
        System.out.println(greeting.charAt(0));

        /*
         * length
         */
        System.out.println(greeting.length());

        System.out.println(greeting.charAt(greeting.length() - 1));

        /*
         * compareTo
         */
        System.out.println("ba".compareToIgnoreCase("bA"));

        /*
         * indexOf
         */

        System.out.println(greeting.indexOf("ISIL"));

        /*
         * replace
         */
        System.out.println(greeting.replace('I', 'i'));
        System.out.println(greeting.replace("Hello", "Hi"));

    }
}