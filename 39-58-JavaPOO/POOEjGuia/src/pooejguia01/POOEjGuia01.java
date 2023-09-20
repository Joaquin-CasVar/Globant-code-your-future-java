package pooejguia01;

// @author Haze

import Entidad.Persona;
import Service.ServicePersona;

public class POOEjGuia01 {

    public static void main(String[] args) {

        ServicePersona sp = new ServicePersona();
        
        Persona p1 = new Persona();
        Persona p2 = new Persona("Juan", 21345687, 27);
        
        p1.setNombre("Carlos");
        p1.setEdad(27);
        
        System.out.println(p2.getId());
        System.out.println("--------");
        System.out.println(p1.getNombre());
        System.out.println("--------");
        
        sp.mostrarPersona(p1);
    }

}
