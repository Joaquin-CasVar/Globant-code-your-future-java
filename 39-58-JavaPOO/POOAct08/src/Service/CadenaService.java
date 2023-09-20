package Service;

// @author Haze
import Entity.Cadena;

public class CadenaService {

    public void contarVocales(Cadena c) {
        int tVoc = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase("A")
                    || c.getFrase().substring(i, i + 1).equalsIgnoreCase("E")
                    || c.getFrase().substring(i, i + 1).equalsIgnoreCase("I")
                    || c.getFrase().substring(i, i + 1).equalsIgnoreCase("O")
                    || c.getFrase().substring(i, i + 1).equalsIgnoreCase("U")) {
                tVoc += 1;
            }
        }
        System.out.println("Cantidad de vocales en la frase: " + tVoc);
    }

    public void invertirFrase(Cadena c) {
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c, String car) {
        int tot = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase(car)) {
                tot += 1;
            }
        }
        System.out.println("El caracter " + car + " se encuentra en la frase "
                + tot + " veces");
    }

    public void compararLongitud(Cadena c, String frase) {
        boolean flag = false;
        if (c.getLongitud() == frase.length()) {
            flag = true;
        }

        if (flag) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen distinta longitud");
        }
    }

    public void unirFrases(Cadena c, String frase) {
        String fraseN = c.getFrase().concat(frase);
        System.out.println("Frase resultante: " + fraseN);
    }

    public void reemplazar(Cadena c, String car) {
        String fraseN = c.getFrase().replace("a", car);
        System.out.println("Frase resultante: " + fraseN);
    }

    public void contiene(Cadena c, String car) {
        boolean flag = false;
        if (c.getFrase().contains(car)) {
            flag = true;
        }

        if (flag) {
            System.out.println("Las frase contiene " + car);
        } else {
            System.out.println("Las frase no contiene " + car);
        }
    }

}
