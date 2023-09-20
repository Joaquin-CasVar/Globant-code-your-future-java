package Service;

// @author Haze
import Entities.Cuenta;
import java.util.Scanner;

public class CuentaService {
    
    Scanner input = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();
        
        System.out.println("Ingrese su numero de cuenta ");
        c.setNumeroCuenta(input.nextInt());
        System.out.println("Ingrese su DNI");
        c.setDNI(input.nextLong());
        System.out.println("Ingrese saldo inicial");
        c.setSaldo(input.nextInt());
        return c;
    }
    
    public void menu(Cuenta c) {
        int op;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion rapida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("0. Salir");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Dinero a ingresar");
                    ingresar(c, input.nextInt());
                    break;
                case 2:
                    System.out.println("Dinero a retirar");
                    retirar(c, input.nextInt());
                    break;
                case 3:
                    System.out.println("Dinero a retirar");
                    extraccionRapida(c, input.nextInt());
                    break;
                case 4:
                    consultarSaldo(c);
                    break;
                case 5:
                    consultarDatos(c);
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 0);
        
    }
    
    public void ingresar(Cuenta c, int ingreso) {
        c.setSaldo(ingreso + c.getSaldo());
    }
    
    public void retirar(Cuenta c, int retiro) {
        c.setSaldo(c.getSaldo() - retiro);
        if (c.getSaldo() < 0) {
            c.setSaldo(0);
        }
    }
    
    public void extraccionRapida(Cuenta c, int monto) {
        if (c.getSaldo() / 5 > monto) {
            retirar(c, monto);
        } else {
            System.out.println("Monto a retirar mayor al 20%");
        }
    }
    
    public void consultarSaldo(Cuenta c) {
        System.out.println("Saldo actual: " + c.getSaldo());
    }
    
    public void consultarDatos(Cuenta c) {
        System.out.println("Numero de Cuenta: " + c.getNumeroCuenta());
        System.out.println("DNI del Cliente: " + c.getDNI());
        System.out.println("Saldo Actual: " + c.getSaldo());
    }
}
