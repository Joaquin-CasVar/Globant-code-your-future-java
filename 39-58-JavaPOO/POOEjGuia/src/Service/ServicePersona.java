package Service;

// @author Haze

import Entidad.Persona;

public class ServicePersona {

    public void mostrarPersona(Persona p) {
        
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("DNI: " + p.getId());
    }
}
