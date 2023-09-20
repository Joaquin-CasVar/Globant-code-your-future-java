package pooactgrupal01;

// @author Haze
import Entity.Vehiculo;
import Service.VehiculoService;

public class POOActGrupal01 {

    public static void main(String[] args) {
        VehiculoService vs = new VehiculoService();
        Vehiculo v1 = vs.crearVehiculo();
        Vehiculo v2 = vs.crearVehiculo();
        Vehiculo v3 = vs.crearVehiculo();
        
        vs.moverse(v1);
        vs.moverse(v2);
        vs.moverse(v3);
        
        vs.frenar(v1);
        vs.frenar(v2);
        vs.frenar(v3);
    }

}
