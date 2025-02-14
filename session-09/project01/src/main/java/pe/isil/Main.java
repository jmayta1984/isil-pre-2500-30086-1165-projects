package pe.isil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Ingrese los datos del estudiante");

        System.out.println("Nombre: ");
        String nombre = scanner.next();
        
        System.out.println("Edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, edad);

        System.out.println("Ingrese la cantidad de cursos");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++){
            System.out.println("Código de curso: ");
            String codigoCurso = scanner.next();

            System.out.println("Nombre de curso: ");
            String nombreCurso = scanner.next();

            System.out.println("Cantidad de créditos: ");
            double creditosCurso = scanner.nextDouble();
            
            Curso curso = new Curso(nombreCurso, codigoCurso, creditosCurso);
            
            estudiante.inscribirCurso(curso);

        }
        scanner.close();

        estudiante.registrarNotasFinales();

        estudiante.imprimirPonderado();

    }
}