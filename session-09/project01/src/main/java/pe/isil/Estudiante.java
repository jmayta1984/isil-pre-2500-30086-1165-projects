package pe.isil;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private ArrayList<Curso> cursos;

    /*
     * Constructor
     */

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursos = new ArrayList<>();
    }

    /*
     * Getters & setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarNotasFinales() {
        Scanner scanner = new Scanner(System.in);
        for (Curso curso : cursos) {
            System.out.println("Ingrese la nota final del curso " + curso.getNombre() + ":");
            double nota = scanner.nextDouble();
            curso.setNota(nota);
        }
        scanner.close();
    }

    public double calcularPonderado() {
        double total = 0;
        double creditos = 0;

        for (Curso curso : cursos) {
            total += curso.getNota() * curso.getCreditos();
            creditos += curso.getCreditos();
        }

        return total/creditos;
    }

    public void imprimirPonderado() {
        System.out.println("El ponderado final es: " + calcularPonderado());
    }
}
