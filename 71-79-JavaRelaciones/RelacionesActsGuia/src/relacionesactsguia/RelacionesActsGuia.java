package relacionesactsguia;

// @author Haze
import Entities.DNI;
import Entities.Equipo;
import Entities.Jugador;
import Entities.Persona;
import java.util.ArrayList;

public class RelacionesActsGuia {

    public static void main(String[] args) {

//Ejercicio 1
//Realiza un programa en donde una clase Persona tenga como atributo nombre, 
//apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la 
//serie (carácter) y número. Prueba acceder luego a los atributos del dni de 
//la persona creando objetos y jugando desde el main.
        DNI dni = new DNI();
        dni.setSerie('A');
        dni.setNumero(44606959);
        Persona persona = new Persona();
        persona.setDni(dni);
        persona.setNombre("Joaquin");
        persona.setApellido("Castellano Varela");

        System.out.println(persona.getNombre() + " " + persona.getApellido());
        System.out.println("DNI: " + persona.getDni().getNumero() + " Ejemplar: " + persona.getDni().getSerie());

//Ejercicio 2
//Realiza un programa en donde exista una clase Jugador que contenga nombre, 
//apellido, posición y número. Luego otra clase Equipo que contenga una 
//colección de jugadores. Una vez hecho esto, desde el main recorreremos 
//el equipo mostrando la información de cada jugador.
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        ArrayList<Jugador> jugadores = new ArrayList();
        j1.setNombre("Lionel");
        j1.setApellido("Messi");
        j1.setPosicion("CF");
        j1.setNumero(10);
        jugadores.add(j1);

        j2.setNombre("Emiliano");
        j2.setApellido("Martinez");
        j2.setPosicion("GK");
        j2.setNumero(23);
        jugadores.add(j2);

        Equipo equipo = new Equipo();
        equipo.setJugadores(jugadores);

        for (Jugador jugador : equipo.getJugadores()) {
            System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " " + jugador.getPosicion() + " " + jugador.getNumero());
        }
    }

}
