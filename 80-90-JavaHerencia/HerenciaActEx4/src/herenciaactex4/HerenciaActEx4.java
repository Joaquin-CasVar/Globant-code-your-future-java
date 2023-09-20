package herenciaactex4;

// @author Haze

import Entities.Empleado;
import Entities.Estudiante;
import Entities.Persona;
import Entities.PersonalServicio;
import Entities.Profesor;
import java.time.Year;
import java.util.ArrayList;

public class HerenciaActEx4 {

    public static void main(String[] args) {
        ArrayList<Persona> Personas = new ArrayList();
        
        Persona pe = new Persona("Juan", "Carlos", 123, "Casado");
        Persona em = new Empleado(Year.of(1996), 13, "Pepe", "Argento", 456, "Viudo");
        Persona pr = new Profesor("Matematicas", Year.of(1994), 7, "Ana", "Acosta", 789, "Soltera");
        Persona ps = new PersonalServicio("Biblioteca", Year.of(2001), 25, "Eduardo", "Castillo", 147, "Soltero");
        Persona es = new Estudiante("Algebra", "Micaela", "Perez", 258, "Casada");
        Personas.add(pe);
        Personas.add(em);
        Personas.add(pr);
        Personas.add(ps);
        Personas.add(es);
        
        Personas.forEach(aux -> {
            System.out.println(aux.toString());
        });
    }

}
