package coleccionesact3;

// @author Haze

import Service.AlumnoService;

public class ColeccionesAct3 {

    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        as.crearAlumno();
        System.out.println(as.notaFinal());
    }

}
