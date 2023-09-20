package pooact07;

// @author Haze
import Entities.Persona;
import Service.PersonaService;

public class POOAct07 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p = null;
        
        try {
            ps.esMayorDeEdad(p);
        } catch (NullPointerException a) {
            System.out.println("Persona no inicializada");
        }
        
        
//        Persona p1 = ps.crearPersona();
//        Persona p2 = ps.crearPersona();
//        Persona p3 = ps.crearPersona();
//        Persona p4 = ps.crearPersona();
//
//        int vecIMC[] = new int[4];
//        boolean vecME[] = new boolean[4];
//
//        vecIMC[0] = ps.calcularIMC(p1);
//        vecIMC[1] = ps.calcularIMC(p2);
//        vecIMC[2] = ps.calcularIMC(p3);
//        vecIMC[3] = ps.calcularIMC(p4);
//
//        vecME[0] = ps.esMayorDeEdad(p1);
//        vecME[1] = ps.esMayorDeEdad(p2);
//        vecME[2] = ps.esMayorDeEdad(p3);
//        vecME[3] = ps.esMayorDeEdad(p4);
//
//        double bIMC = 0, nIMC = 0, aIMC = 0;
//        double mayE = 0, menE = 0;
//        for (int i = 0; i < 4; i++) {
//            switch (vecIMC[i]) {
//                case -1:
//                    bIMC += 1;
//                    break;
//                case 0:
//                    nIMC += 1;
//                    break;
//                case 1:
//                    aIMC += 1;
//                    break;
//            }
//            if (vecME[i]) {
//                mayE += 1;
//            } else {
//                menE += 1;
//            }
//        }
//
//        if (bIMC == 0) {
//            System.out.println("Porcentaje de personas con IMC bajo: 0%");
//        } else {
//            System.out.println("Porcentaje de personas con IMC bajo: "
//                    + bIMC / 4 * 100 + "%");
//        }
//        if (nIMC == 0) {
//            System.out.println("Porcentaje de personas con IMC normal: 0%");
//        } else {
//            System.out.println("Porcentaje de personas con IMC normal: "
//                    + nIMC / 4 * 100 + "%");
//        }
//        if (aIMC == 0) {
//            System.out.println("Porcentaje de personas con IMC alto: 0%");
//        } else {
//            System.out.println("Porcentaje de personas con IMC alto: "
//                + aIMC / 4 * 100 + "%");
//        }
//        if (mayE == 0) {
//            System.out.println("Porcentaje de personas mayores de edad: 0%");
//        } else {
//            System.out.println("Porcentaje de personas mayores de edad: "
//                + mayE / 4 * 100 + "%");
//        }
//        if (menE == 0) {
//            System.out.println("Porcentaje de personas menores de edad: 0%");
//        } else {
//            System.out.println("Porcentaje de personas menores de edad: "
//                + menE / 4 * 100 + "%");
//        }
    }

}
