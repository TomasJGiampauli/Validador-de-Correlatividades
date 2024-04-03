package domain.sistema;

import domain.personas.Alumno;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscripcion;


    public Inscripcion(Alumno alumno, Materia ... materias) {
        this.alumno = alumno;
        this.materiasInscripcion = new ArrayList<>();
        Collections.addAll(this.materiasInscripcion, materias);

    }

    //por si se quiere agregar mas materias sobre la marcha
    public void agregarMateriaInscripcion(Materia ... materias){
        Collections.addAll(this.materiasInscripcion, materias);
    }
    public boolean aprobada() {

        return materiasInscripcion.stream().allMatch(materiaAverificar ->
                alumno.getMateriasAprobadas().containsAll(materiaAverificar.getCorrelativas()));

    }


}



