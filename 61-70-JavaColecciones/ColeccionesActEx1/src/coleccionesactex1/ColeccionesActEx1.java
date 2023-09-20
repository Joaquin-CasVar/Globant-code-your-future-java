package coleccionesactex1;

// @author Haze
import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesActEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList();
        int num, acu = 0, cont = 0;

        System.out.println("Ingrese un numero");
        num = input.nextInt();
        while (num != -99) {
            numeros.add(num);
            acu += num;
            cont++;
            System.out.println("Ingrese otro numero");
            num = input.nextInt();
        }

        System.out.println("Se cargaron " + cont + " valores");
        System.out.println("La suma de todos los valores es " + acu);

        if (cont == 0) {
            System.out.println("El promedio de los valores cargados es 0");
        } else {
            System.out.println("El promedio de los valores cargados es " + acu / (double) cont);
        }

        acu = 0;
        for (Integer aux : numeros) {
            acu += aux;
        }
        
        System.out.println("Se cargaron " + numeros.size() + " valores");
        System.out.println("La suma de todos los valores es " + acu);
        if (numeros.isEmpty()) {
            System.out.println("El promedio de los valores cargados es 0");
        } else {
            System.out.println("El promedio de los valores cargados es " + acu / (double) numeros.size());
        }
    }

}
