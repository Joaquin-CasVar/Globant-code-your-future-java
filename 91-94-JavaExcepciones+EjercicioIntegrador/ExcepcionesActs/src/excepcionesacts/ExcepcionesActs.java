package excepcionesacts;

// @author Haze
import Entities.DivisionNumero;
import Entities.Estudiante;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesActs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//Actividad 2
        Estudiante e = new Estudiante();
        int[] notas = e.getNotas();
        try {
            int aux = 0;
            for (int i = 0; i < 20; i++) {
                aux += notas[i];
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        }

//Actividad 3 y 4
        DivisionNumero dn = new DivisionNumero();
        try {
            System.out.println("Dividendo");
            String s1 = input.next();
            System.out.println("Divisor");
            String s2 = input.next();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            dn.division(num1, num2);
        } catch (NumberFormatException a) {
            System.out.println("ERROR. Un valor ingresado no es un numero");
        } catch (ArithmeticException a) {
            System.out.println("ERROR. Division por cero");
        }

//Actividad 5
        int res = (int) (Math.random() * 500 + 1);
        int aux;
        int contador = 0;
        boolean flag = false;

        try {
            do {
                contador++;
                aux = input.nextInt();
                if (res < aux) {
                    System.out.println("-");
                } else if (res > aux) {
                    System.out.println("+");
                } else if (res == aux) {
                    flag = true;
                }
            } while (res != aux);
        } catch (InputMismatchException a) {
            System.out.println("El valor ingresado no es un numero. Se contara como un intento");
        }

        if (flag) {
            System.out.println("Felicidades encontro el numero correcto");
        }
        System.out.println("Ha intentado adivinar el número: " + contador + " veces");

//Actividad 6
/*
    A) 1->2->3(->4)?->6->5
    B) 1->2->3->4->5
         */
//Actividad 7
/*
    A) 1->2->3->4
    B) 1->2->4
         */
//Actividad 8
/*
    1)  Valor final del try: 44
        Valor final del finally: 45
        Valor final del return: 46
        46
    2)  Valor final del catch: 43
        Valor final del finally: 44
        Valor final del return: 45
        45
    3)  Valor final del finally: 2
        Excepcion en metodo()
        java.lang.NumberFormatException: For input string: "W"
         */
//Actividad 9
/*
    A) 1->2->4->6
    B) 1->2->3->6
    C) 1->2->5->6
         */
    }
}
