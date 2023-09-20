package herenciaactex1;

// @author Haze
import Entities.Alquiler;
import Entities.Barco;
import Entities.BarcoAMotor;
import Entities.Velero;
import Entities.YateDeLujo;
import java.time.LocalDate;

public class HerenciaActEx1 {

    public static void main(String[] args) {
        Barco b1 = new Velero(2, "A", 12.5, 1995);
        Barco b2 = new BarcoAMotor(25, "B", 10.7, 2001);
        Barco b3 = new YateDeLujo(60, 5, "C", 35.3, 2018);
        
        LocalDate fechaAlquiler = LocalDate.parse("2023-08-22");
        LocalDate fechaDevolucion = LocalDate.parse("2023-08-23");
        
        Alquiler a = new Alquiler("J", 123, fechaAlquiler, fechaDevolucion, "C3", b1);
        System.out.println(a.cotizar());
        
        a.setBarco(b2);
        System.out.println(a.cotizar());
        
        a.setBarco(b3);
        System.out.println(a.cotizar());
    }

}
