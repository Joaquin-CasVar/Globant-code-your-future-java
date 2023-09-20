package coleccionesactex4;

// @author Haze
import java.util.HashMap;
import java.util.Scanner;

public class ColeccionesActEx4 {

    public static void main(String[] args) {
        HashMap<Integer, String> codigos = new HashMap<>();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String ciudad;
        Integer codigo;
        boolean flag = false;
        int cont = 0;

        System.out.println("Por favor ingrese 10 codigos postales y sus ciudades");
        for (int i = 0; i < 10; i++) {
            System.out.println("Codigo Postal");
            codigo = input.nextInt();
            System.out.println("Ciudad");
            ciudad = input.next();
            codigos.put(codigo, ciudad);
        }

        System.out.println("Lista de codigos postales y sus ciudades");
        codigos.entrySet().forEach((aux) -> {
            System.out.println("Codigo: " + aux.getKey() + " Ciudad: " + aux.getValue());
        });

        System.out.println("Ingrese un codigo postal");
        codigo = input.nextInt();
        if (codigos.containsKey(codigo)) {
            System.out.println("La ciudad asociada a ese codigo es: " + codigos.get(codigo));
        } else {
            System.out.println("La ciudad asociada a ese codigo no existe");
        }

        System.out.println("Lista de codigos postales y sus ciudades");
        codigos.entrySet().forEach((aux) -> {
            System.out.println("Codigo: " + aux.getKey() + " Ciudad: " + aux.getValue());
        });

        System.out.println("Por favor ingrese otro codigo postal y su ciudad");
        System.out.println("Codigo Postal");
        codigo = input.nextInt();
        System.out.println("Ciudad");
        ciudad = input.next();
        codigos.put(codigo, ciudad);

        do {
            System.out.println("Ingrese un codigo postal a eliminar");
            codigo = input.nextInt();
            if (codigos.containsKey(codigo)) {
                System.out.println("Ciudad Eliminada");
                codigos.remove(codigo);
                cont++;
            } else {
                System.out.println("La ciudad asociada a ese codigo no existe");
            }
        } while (cont < 3);

        System.out.println("Lista de codigos postales y sus ciudades");
        codigos.entrySet().forEach((aux) -> {
            System.out.println("Codigo: " + aux.getKey() + " Ciudad: " + aux.getValue());
        });
    }

}
