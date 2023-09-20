package pooact12;

// @author Haze
import Entity.Persona;
import Service.PersonaService;

public class POOAct12 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();

        ps.calcularEdad(p1);
        ps.menorQue(p1);
        ps.mostrarPersona(p1);
    }

}
