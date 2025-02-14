package pe.isil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
         * List
         */
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Carlos");
        names.add("Pedro");

        System.out.println(names);
        System.out.println(names.size());
        /*
         * Set
         */
        Set<Integer> grades = new HashSet<>();
        grades.add(15);
        grades.add(20);
        grades.add(8);
        grades.add(8);
        System.out.println(grades);

        /*
         * Map
         */
        Map<String, String> student = new HashMap<>();
        student.put("name", "Jorge Fuentes");
        student.put("id", "u202501515");
        System.out.println(student);
        System.out.println(student.get("id"));
    }
}