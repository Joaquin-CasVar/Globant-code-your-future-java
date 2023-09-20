package pooact14;

// @author Haze
import Entity.Movil;
import Service.MovilService;

public class POOAct14 {

    public static void main(String[] args) {
        MovilService ms = new MovilService();
        Movil m1 = ms.cargarCelular();

    }

}
