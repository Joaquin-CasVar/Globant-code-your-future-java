package relacionesact1;

// @author Haze
import Entities.Perro;
import Entities.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesAct1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Perro pe1 = new Perro();
        Perro pe2 = new Perro();

        for (int i = 0; i < 3; i++) {
            Perro perro = new Perro();
            perro.setNombre("Perro " + i);
            perro.setRaza("Beagle");
            perro.setEdad((int) (Math.random() * 10 + 1));
            perro.setTamanio(0.35);
            perro.setAdoptado(false);
            perros.add(perro);
        }
        for (int i = 0; i < 3; i++) {
            Persona p = new Persona();
            p.setNombre("Dueño " + i);
            p.setApellido("B");
            p.setEdad(25);
            p.setDocumento(1 + i);
            personas.add(p);
        }

        
        personas.forEach((persona) -> {
            System.out.println("Ingrese el nombre perro que quiere adoptar " + persona.getNombre() + " " + persona.getApellido());
            String p = input.next();
            perros.forEach((perro) -> {
                if (perro.getNombre().equalsIgnoreCase(p)) {
                    if (!perro.isAdoptado()) {
                        persona.setPerro(perro);
                        perro.setAdoptado(true);
                    } else {
                        System.out.println("El perro " + perro.getNombre() + " ya fue adoptado");
                    }
                }
            });
        });

        personas.forEach((persona) -> {
            System.out.println(persona);
        });
    }

}
