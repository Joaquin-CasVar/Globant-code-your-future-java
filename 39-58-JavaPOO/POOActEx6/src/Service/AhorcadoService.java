package Service;

// @author Haze
import Entity.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado a = new Ahorcado();

        System.out.println("Ingrese la palabra para jugar");
        a.setPalabra(stringToArray(input.next()));
        System.out.println("Ingrese la cantidad de jugadas maxima");
        a.setJugadasMax(input.nextInt());

        return a;
    }

    public void longitud(String[] palabra) {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public void buscar(String letra, Ahorcado a) {
        boolean flag = false;
        for (String letras : a.getPalabra()) {
            if (letras.equalsIgnoreCase(letra)) {
                flag = true;
                a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);
            } 
        }

        if (flag) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
            a.setJugadasMax(a.getJugadasMax() - 1);
        }
    }

    public void encontradas(String letra, Ahorcado a) {
        System.out.println("Numero de letras (encontradas, faltantes): ("
                + a.getLetrasEncontradas() + ","
                + (a.getPalabra().length - a.getLetrasEncontradas()) + ")");
    }

    public void intentos(Ahorcado a) {
        System.out.println("Número de oportunidades restantes:" + a.getJugadasMax());
    }

    public void juego(Ahorcado a) {
        String letra;

        do {
            System.out.println("Ingrese una letra");
            letra = input.next();
            longitud(a.getPalabra());
            buscar(letra, a);
            encontradas(letra, a);
            intentos(a);
            System.out.println("-------------------------------");
        } while (a.getPalabra().length > a.getLetrasEncontradas() && a.getJugadasMax() != 0);

        if (a.getJugadasMax() == 0) {
            System.out.println("Lo sentimos, no hay más oportunidades");
        } else {
            System.out.println("Felicitaciones, encontro la palabra");
        }
    }

    public String[] stringToArray(String palabra) {
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        return vector;
    }
}
