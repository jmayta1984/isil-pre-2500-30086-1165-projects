package pe.isil;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Luis", 22);
        System.out.println(persona.toString());

        Estudiante estudiante = new Estudiante("Ana", 21, "Diseño gráfico");
        System.out.println(estudiante.toString());
        estudiante.estudiar();

    }
}