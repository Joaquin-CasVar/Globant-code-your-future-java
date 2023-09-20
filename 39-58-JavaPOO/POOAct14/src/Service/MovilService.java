package Service;

// @author Haze
import Entity.Movil;
import java.util.Scanner;

public class MovilService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Movil cargarCelular() {
        Movil m = new Movil();

        System.out.println("Ingrese la marca");
        m.setMarca(input.next());
        System.out.println("Ingrese el precio");
        m.setPrecio(input.nextDouble());
        System.out.println("Ingrese el modelo");
        m.setModelo(input.next());
        System.out.println("Ingrese los GB de memoria RAM");
        m.setMemoriaRam(input.nextInt());
        System.out.println("Ingrese los GB de almacenamiento");
        m.setAlmacenamiento(input.nextInt());
        m.setCodigo(ingresarCodigo());
        
        return m;
    }

    public int[] ingresarCodigo() {
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + " del codigo");
            codigo[i] = input.nextInt();
        }
        
        return codigo;
    }
}
