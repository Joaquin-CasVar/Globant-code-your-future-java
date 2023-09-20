package Entities;

// @author Haze
import Interfaces.AccionAnimal;

public class Animal implements AccionAnimal {

    public void hacerRuido() {
        System.out.println("Hola");
    }

    @Override
    public void pasear(int cantVueltas) {
        System.out.println("Paseamos " + cantVueltas + " vueltas");
    }

    @Override
    public void comerAlimento(int gramos) {
        System.out.println("Comio " + gramos + "g de alimento");
    }
}
