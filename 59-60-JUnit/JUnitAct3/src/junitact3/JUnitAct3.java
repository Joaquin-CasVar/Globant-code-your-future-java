package junitact3;

// @author Haze
import Entity.Password;
import Service.PasswordValidatorService;

public class JUnitAct3 {

    public static void main(String[] args) {
        PasswordValidatorService pvs = new PasswordValidatorService();
        Password p = new Password("uwu");
        
        pvs.fortalezaContrasenia(p);
    }

}
