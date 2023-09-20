package pooact03;

// @author Haze
import Entity.Operacion;
import Service.OperacionService;

public class POOAct03 {

    public static void main(String[] args) {
        OperacionService os = new OperacionService();
        Operacion o1 = os.crearOperacion();
        
        int suma = os.sumar(o1);
        int resta = os.restar(o1);
        int mult = os.multiplicar(o1);
        int div = os.dividir(o1);
        System.out.println("Suma de los numeros ingresados: " + suma);
        System.out.println("Resta de los numeros ingresados: " + resta);
        System.out.println("Multiplicacion de los numeros ingresados: " + mult);
        System.out.println("Division de los numeros ingresados: " + div);
    }

}
