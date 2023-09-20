package Service;

// @author Haze
import Entity.Raices;

public class RaicesService {

    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        double raiz = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
        if (tieneRaices(r)) {
            System.out.println("Raiz 1: " + raiz);
            raiz = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("Raiz 2: " + raiz);
        }
    }

    public void obtenerRaiz(Raices r) {
        double raiz = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
        if (tieneRaiz(r)) {
            System.out.println("Raiz: " + raiz);
        }
    }

    public void calcular(Raices r) {
        if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else if (tieneRaices(r)) {
            obtenerRaices(r);
        } else {
            System.out.println("No tiene raiz");
        }
    }
}
