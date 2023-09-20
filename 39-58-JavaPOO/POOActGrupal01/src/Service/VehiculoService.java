package Service;

// @author Haze
import Entity.Vehiculo;
import java.util.Scanner;

public class VehiculoService {

    Scanner input = new Scanner(System.in);

    public Vehiculo crearVehiculo() {
        Vehiculo v1 = new Vehiculo();

        System.out.println("Ingrese los siguientes datos");
        System.out.println("Marca");
        v1.setMarca(input.next());
        System.out.println("Modelo");
        v1.setModelo(input.next());
        System.out.println("Año");
        v1.setAnio(input.nextInt());
        System.out.println("Tipo");
        v1.setTipo(input.next());

        return v1;
    }

    public void moverse(Vehiculo v1) {
        switch (v1.getTipo()) {
            case "Bicicleta":
                System.out.println("Distancia recorrida en bicicleta en");
                System.out.println("5 segundos:" + 5 * 1);
                System.out.println("10 segundos:" + 10 * 1);
                System.out.println("1 minuto:" + 60 * 1);
                break;
            case "Motocicleta":
                System.out.println("Distancia recorrida en motocicleta en");
                System.out.println("5 segundos:" + 5 * 2);
                System.out.println("10 segundos:" + 10 * 2);
                System.out.println("1 minuto:" + 60 * 2);
                break;
            case "Automovil":
                System.out.println("Distancia recorrida en automovil en");
                System.out.println("5 segundos:" + 5 * 3);
                System.out.println("10 segundos:" + 10 * 3);
                System.out.println("1 minuto:" + 60 * 3);
                break;
            default:
                System.out.println("Tipo de vehiculo no valido");
                break;
        }

    }

    public void frenar(Vehiculo v1) {
        switch (v1.getTipo()) {
            case "Bicicleta":
                System.out.println("Distancia recorrida en 5 minutos:" + 300 * 1);
                break;
            case "Motocicleta":
                System.out.println("Distancia recorrida en 5 minutos:" + (300 * 2 + 2));
                break;
            case "Automovil":
                System.out.println("Distancia recorrida en 5 minutos:" + (300 * 3 + 2));
                break;
            default:
                System.out.println("Tipo de vehiculo no valido");
                break;
        }
    }
}
