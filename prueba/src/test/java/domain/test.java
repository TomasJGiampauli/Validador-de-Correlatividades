package domain;

import domain.personas.Alumno;
import domain.sistema.Inscripcion;
import domain.sistema.Materia;
import org.junit.Assert;
import org.testng.annotations.Test;




public class test {

    Materia analisis1 = new Materia("analisis1");
    Materia algebra = new Materia("algebra");
    Materia analisis2 = new Materia("analisis2",analisis1,algebra);


    @Test
    public void inscripcionCorrelativasAprobadas(){


        Alumno rodolfo = new Alumno ("rodolfo","1");

        /*no es necesario que lo haga con este metodo ya que puedo agregarlas directamente
        pero lo hago para probar que funciona, en los test de abajo las agrego
        en la instanciacion
        */
        rodolfo.agregarMateriaAprobada(analisis1,algebra);

        Inscripcion primeraAlt = new Inscripcion(rodolfo,analisis2);

        //tiene ambas solicitadas asique debe dar verdadero
        Assert.assertTrue(primeraAlt.aprobada());


    }

    @Test
    public void noTieneCorrelativasAprobadas(){


        Alumno evilRodolfo = new Alumno ("rodolfo","1",analisis1);

        Inscripcion segundaAlt = new Inscripcion(evilRodolfo,analisis2);

        //no tiene las 2 solicitadas asique deberia dar falso
        Assert.assertFalse(segundaAlt.aprobada());


    }

    @Test
    public void variasMateriasSinCorrelativas(){

        Alumno aleatorio = new Alumno ("rodolfo","1",null);;

        Inscripcion terceraAlt = new Inscripcion(aleatorio,analisis1,algebra);


        Assert.assertTrue(terceraAlt.aprobada());

    }

}
