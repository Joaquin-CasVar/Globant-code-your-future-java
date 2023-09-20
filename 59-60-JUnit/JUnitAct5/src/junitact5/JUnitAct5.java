package junitact5;

// @author Haze
import Entity.DateValidator;

public class JUnitAct5 {

    public static void main(String[] args) {
        DateValidator d = new DateValidator();

        System.out.println(d.checkFechaValida("01/03/2002"));
    }

}
