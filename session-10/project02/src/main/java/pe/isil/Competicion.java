package pe.isil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Competicion {

    private List<Participante> participantes;

    /*
     * Constructor
     */

    public Competicion() {
        participantes = new ArrayList<>();
    }

    /*
     * Getters
     */

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void inscribirParticipante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de camiseta:");
        int camiseta = scanner.nextInt();

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.next();

        System.out.println("Ingrese la marca personal:");
        double marcaPersonal = scanner.nextDouble();

        Participante participante =  new Participante(camiseta, nombre, marcaPersonal);

        participantes.add(participante);
        //scanner.close();

    }

    /*
     * Probar con ordenamiento burbuja
     * https://tutospoo.jimdofree.com/tutoriales-java/m%C3%A9todos-de-ordenaci%C3%B3n/burbuja/
     */
    public void ordernarPorMarcaPersonal( ){
        Collections.sort(participantes, new ComparadorPorMarca());
    }

    public void mostrarOrdenParticipacion() {
        for(Participante participante : participantes){
            System.out.println(participante.toString());
        }
    }
}
