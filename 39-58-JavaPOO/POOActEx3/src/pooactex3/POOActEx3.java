package pooactex3;

// @author Haze
import Entity.Raices;
import Service.RaicesService;

public class POOActEx3 {

    public static void main(String[] args) {
        RaicesService rs = new RaicesService();
        Raices r1 = new Raices(-5, 10, -5);
        rs.calcular(r1);
        System.out.println(rs.getDiscriminante(r1));
    }

}
