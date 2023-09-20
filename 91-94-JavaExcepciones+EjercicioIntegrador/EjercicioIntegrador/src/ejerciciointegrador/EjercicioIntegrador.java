package ejerciciointegrador;

// @author Haze
import Entities.Armadura;
import Services.ArmaduraService;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        ArmaduraService as = new ArmaduraService();
        Armadura ar = as.crearArmaduraPred();

        as.caminar(ar, 60);
        as.correr(ar, 120);
        as.propulsarse(ar, 300);
        as.volar(ar, 240);
        as.atacar(ar, 40);
        as.escribir(ar, 26);
        as.hablar(ar, 15);
        as.nivelEnergia(ar);
        System.out.println(ar);
        as.revisarDispositivos(ar);
        as.caminar(ar, 60);
        as.correr(ar, 120);
        as.propulsarse(ar, 300);
        as.volar(ar, 240);
        as.atacar(ar, 40);
        as.escribir(ar, 26);
        as.hablar(ar, 15);
        as.nivelEnergia(ar);
        System.out.println(ar);

        as.agregarObjetosAlRadar(ar, 9);
        as.verObjetos(ar);
        as.destruirObjetos(ar);
        as.verObjetos(ar);
    }

}
