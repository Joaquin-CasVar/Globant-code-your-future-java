package pooact05;

// @author Haze
import Entities.Cuenta;
import Service.CuentaService;

public class POOAct05 {

    public static void main(String[] args) {
        CuentaService cs = new CuentaService();
        Cuenta c1 = cs.crearCuenta();

        cs.menu(c1);
    }

}
