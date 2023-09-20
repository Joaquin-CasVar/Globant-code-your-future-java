package pooact02;

// @author Haze

import Entity.Circunferencia;
import Service.CircunferenciaService;

public class POOAct02 {

    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.crearCircunferencia();
        
        cs.area(c1);
        cs.perimetro(c1);
    }

}
