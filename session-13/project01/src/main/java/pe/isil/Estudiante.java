package pe.isil;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println(getNombre() + " estudia la carrera de " + carrera);
    }

    @Override
    public String toString() {
        return super.toString() + " - carrera|" + carrera;
    }
}
