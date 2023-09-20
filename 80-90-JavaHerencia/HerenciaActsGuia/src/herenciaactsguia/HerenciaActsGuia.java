package herenciaactsguia;

// @author Haze
import Entities.Animal;
import Entities.Gato;
import Entities.Perro;
import java.util.ArrayList;

public class HerenciaActsGuia {

    public static void main(String[] args) {
//Ejercicio 1
//Vamos a crear una clase Animal que tenga un método hacerRuido() que 
//devuelva un saludo “Hola”. Luego haremos clase Perro y clase Gato que 
//extiendan de Animal y sobreescriban el método hacerRuido() con el ruido 
//que corresponda a cada uno. Luego, en el main vamos a crear un 
//ArrayList de animales y los siguientes animales
        ArrayList<Animal> Animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        Animales.add(a);
        Animales.add(b);
        Animales.add(c);
        
        Animales.forEach((aux) -> {
            aux.hacerRuido();
        });
    }

}
