package pe.isil;

import java.util.ArrayList;

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
     

    
    
}
