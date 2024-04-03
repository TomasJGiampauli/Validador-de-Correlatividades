package domain.personas;


import domain.sistema.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, String legajo, Materia ... materias) {
        this.nombre = nombre;
        this.legajo =legajo;
        this.materiasAprobadas = new ArrayList<>();

    }

    //por si se quiere agregar mas materias sobre la marcha
    public void agregarMateriaAprobada(Materia ... materias){

        Collections.addAll(this.materiasAprobadas, materias);
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }


}
