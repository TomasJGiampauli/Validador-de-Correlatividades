package domain.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;



    public Materia(String nombre,Materia ... correlativas) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
        Collections.addAll(this.correlativas, correlativas);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    //por si se quiere agregar mas correlativas sobre la marcha
    public void agregarMateriaCorrelativa(Materia ... correlativas){
        Collections.addAll(this.correlativas, correlativas);

    }


}
