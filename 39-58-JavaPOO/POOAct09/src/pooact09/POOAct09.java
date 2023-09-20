package pooact09;

// @author Haze
import Entity.Matematica;
import Service.MatematicaService;

public class POOAct09 {

    public static void main(String[] args) {
        MatematicaService ms = new MatematicaService();
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random() * 100);
        m1.setNum2(Math.random() * 100);

        System.out.println(m1.toString());
        
        System.out.println("El numero mayor es " + ms.mayor(m1));
        System.out.println("La potencia del mayor elevado al menor es "
                + ms.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del valor absoluto del menor es "
                + ms.calculaRaiz(m1));
    }

}
