package pe.isil;

import java.util.Comparator;

public class ComparadorPorMarca implements Comparator<Participante> {

    @Override
    public int compare(Participante p0, Participante p1) {
        return Double.compare(p1.getMarcaPersonal(), p0.getMarcaPersonal());
    }

}
