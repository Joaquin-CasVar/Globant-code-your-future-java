package pooact13;

// @author Haze
import Entity.Curso;
import Service.CursoService;

public class POOAct13 {

    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso c1 = cs.crearCurso();

        cs.calcularGananciaSemanal(c1);
    }

}
