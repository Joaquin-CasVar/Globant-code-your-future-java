package coleccionesactsguia;

// @author Haze
import Entity.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class ColeccionesActsGuia {

    public static void main(String[] args) {
//Correccion 1
        ArrayList<Integer> listado = new ArrayList<>();
        TreeMap<String, String> mapa = new TreeMap();
        HashMap<Integer, String> personas = new HashMap<>();

//Ejercicio 1 
//Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos 
//a cada uno.
//Ejercicio 2
//Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina 
//en cada uno un objeto de cada forma que aprendiste arriba.
        System.out.println("Lista");
        ArrayList<Integer> numerosA = new ArrayList<>();
        numerosA.add(10);
        numerosA.add(30);
        numerosA.add(7);
        numerosA.add(9);
        numerosA.add(13);
        System.out.println(numerosA.size());
        numerosA.remove(1);
        Integer x = 7;
        numerosA.remove(x);
        System.out.println(numerosA.size());

        System.out.println("Conjunto");
        HashSet<Integer> numerosB = new HashSet<>();
        numerosB.add(1);
        numerosB.add(3);
        numerosB.add(7);
        numerosB.add(6);
        numerosB.add(4);
        System.out.println(numerosB.size());
        numerosB.remove(7);
        System.out.println(numerosB.size());

        System.out.println("Mapa");
        HashMap<Integer, String> alumnos = new HashMap<>();
        alumnos.put(34, "Carlos");
        alumnos.put(35, "Maria");
        alumnos.put(33, "Juan");
        alumnos.put(32, "Pepe");
        alumnos.put(36, "Carlos");
        System.out.println(alumnos.size());
        alumnos.remove(35);
        System.out.println(alumnos.size());

//Correccion 2
        HashSet<String> personas1 = new HashSet<>();
        String n1 = "Albus";
        String n2 = "Severus";
        personas1.add(n1);
        personas1.add(n2);

//Correccion 3
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

//Ejercico 3
//Crea una lista de Libros y muestra el título de cada uno con un bucle.
        ArrayList<Libro> libros = new ArrayList();
        Libro libro1 = new Libro("A", 123);
        Libro libro2 = new Libro("B", 456);
        Libro libro3 = new Libro("C", 789);
        Libro libro4 = new Libro("D", 159);
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.forEach((aux) -> System.out.println(aux.getTitulo()));
    }
}
