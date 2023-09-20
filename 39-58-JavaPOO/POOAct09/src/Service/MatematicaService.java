package Service;

// @author Haze
import Entity.Matematica;

public class MatematicaService {

    public String devolverMayor(Matematica m) {
        if (m.getNum1() > m.getNum2()) {
            return "Numero 1";
        } else {
            return "Numero 2";
        }
    }
    
    public double mayor(Matematica m) {
        if (m.getNum1() > m.getNum2()) {
            return m.getNum1();
        } else {
            return m.getNum2();
        }
    }

    public double menor(Matematica m) {
        if (m.getNum1() < m.getNum2()) {
            return m.getNum1();
        } else {
            return m.getNum2();
        }
    }

    public double calcularPotencia(Matematica m) {
        int may, men;
        may = (int) Math.round(mayor(m));
        men = (int) Math.round(menor(m));
        return Math.pow(may, men);
    }

    public double calculaRaiz(Matematica m) {
        double men = Math.abs(menor(m));
        return Math.sqrt(men);
    }

}
