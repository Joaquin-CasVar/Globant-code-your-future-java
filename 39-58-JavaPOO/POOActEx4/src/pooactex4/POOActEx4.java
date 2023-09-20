package pooactex4;

// @author Haze
import Entity.NIF;
import Service.NIFService;

public class POOActEx4 {

    public static void main(String[] args) {
        NIFService ns = new NIFService();
        NIF n1 = ns.crearNif();

        ns.mostrar(n1);
    }

}
