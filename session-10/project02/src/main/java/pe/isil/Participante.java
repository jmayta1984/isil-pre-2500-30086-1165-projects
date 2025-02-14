package pe.isil;

public class Participante {
    /*
     * Encapsulamiento
     */
    private int camiseta;
    private String nombre;
    private double marcaPersonal;

    /*
     * Constructor
     */
    public Participante(int camiseta, String nombre, double marcaPersonal) {
        this.camiseta = camiseta;
        this.nombre = nombre;
        this.marcaPersonal = marcaPersonal;
    }

    /*
     * Getters
     */

    public int getCamiseta() {
        return camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMarcaPersonal() {
        return marcaPersonal;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
