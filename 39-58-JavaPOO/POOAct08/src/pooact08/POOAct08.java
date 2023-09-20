package pooact08;

// @author Haze
import Entity.Cadena;
import Service.CadenaService;
import java.util.Scanner;

public class POOAct08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        CadenaService cs = new CadenaService();
        Cadena c1 = new Cadena();

        System.out.println("Ingrese una frase");
        c1.setFrase(input.nextLine());
        c1.setLongitud(c1.getFrase().length());
        
        cs.contarVocales(c1);
        cs.invertirFrase(c1);
        System.out.println("Ingrese el caracter a contabilizar");
        String cad = input.nextLine();
        cs.vecesRepetido(c1, cad);
        System.out.println("Ingrese la nueva frase");
        cad = input.nextLine();
        cs.compararLongitud(c1, cad);
        System.out.println("Ingrese la frase a unir");
        cad = input.nextLine();
        cs.unirFrases(c1, cad);
        System.out.println("Ingrese el caracter para reemplazar");
        cad = input.nextLine();
        cs.reemplazar(c1, cad);
        System.out.println("Ingrese el caracter a buscar");
        cad = input.nextLine();
        cs.contiene(c1, cad);
    }

}
