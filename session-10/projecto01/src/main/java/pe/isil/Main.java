package pe.isil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("Pedro");
        names.add("Ana");
        names.add("Francisco");
        names.add("Brenda");

        System.out.println("Lista original: " + names);

        Collections.sort(names);
        System.out.println("Lista ordenada: " + names);

        Collections.reverse(names);
        System.out.println("Lista invertida: " + names);

        Collections.swap(names, 0, 3);;
        System.out.println("Lista actualizada: " + names);


    }
}