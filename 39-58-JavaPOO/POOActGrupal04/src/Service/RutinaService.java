package Service;

// @author Haze
import Entity.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class RutinaService {

    private ArrayList<Rutina> listaRutinas = new ArrayList<>(0);

    public ArrayList<Rutina> getListaRutinas() {
        return listaRutinas;
    }

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Rutina crearRutina() {
        Rutina r = new Rutina();

        System.out.println("Ingrese ID de la rutina");
        r.setId(input.nextInt());
        System.out.println("Ingrese nombre de la rutina");
        r.setNombre(input.next());
        System.out.println("Ingrese duracion de la rutina (mins)");
        r.setDuracion(input.nextInt());
        System.out.println("Ingrese nivel de la rutina (1-4)");
        r.setNivelDificultad(input.nextInt());
        System.out.println("Ingrese descripcion de la rutina");
        r.setDescripcion(input.next());

        listaRutinas.add(r);
        return r;
    }

    public void crearRutina(Rutina r) {
        listaRutinas.add(r);
    }

    public ArrayList<Rutina> obtenerRutinas() {
        return listaRutinas;
    }

    public void obtenerRutinas(ArrayList<Rutina> lista) {
        lista.forEach(rutina -> {
            System.out.println(rutina.toString());
        });
    }

    public void actualizarRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        listaRutinas.forEach(rutina -> {
            if (rutina.getId() == id) {
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
            }
        });
    }

    public void eliminarRutina(int id) {
        boolean flag = false;

        for (Rutina rutina : listaRutinas) {
            if (rutina.getId() == id) {
                listaRutinas.remove(rutina);
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Cliente eliminado");
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}
