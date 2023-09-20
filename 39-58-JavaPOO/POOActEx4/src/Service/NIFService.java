package Service;

// @author Haze
import Entity.NIF;
import java.util.Scanner;

public class NIFService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public NIF crearNif() {
        NIF n = new NIF();

        System.out.println("Ingrese DNI");
        n.setDNI(input.nextLong());
        n.setLetra(calcularLetra(n.getDNI()));
        return n;
    }

    public void mostrar(NIF n) {
        System.out.println(n.getDNI() + "-" + n.getLetra());
    }

    public String calcularLetra(long DNI) {
        String[] vecCar = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int rest = (int) DNI % 23;
        return vecCar[rest];
    }
}
