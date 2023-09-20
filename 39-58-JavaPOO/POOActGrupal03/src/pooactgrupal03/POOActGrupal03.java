package pooactgrupal03;

// @author Haze
import Entity.Alquiler;
import Entity.Pelicula;
import Service.AlquilerService;
import Service.PeliculaService;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class POOActGrupal03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        PeliculaService ps = new PeliculaService();
        AlquilerService as = new AlquilerService();
        Pelicula[] peliculas = new Pelicula[5];
        Alquiler[] alquileres = new Alquiler[3];

        peliculas[0] = new Pelicula("A", "Comedia", 2003, 95, true);
        peliculas[1] = new Pelicula("B", "Accion", 2008, 97, false);
        peliculas[2] = new Pelicula("C", "Romance", 2015, 92, true);
        peliculas[3] = new Pelicula("D", "Romance", 2013, 87, false);
        peliculas[4] = new Pelicula("E", "Educativo", 2003, 78, true);

        Date fecha1, fecha2;
        Calendar calendario = new GregorianCalendar();
        calendario.set(2023, 6, 5);
        fecha1 = calendario.getTime();
        calendario.set(2023, 6, 8);
        fecha2 = calendario.getTime();
        alquileres[0] = new Alquiler(peliculas[0], fecha1, fecha2, 10.5);
        alquileres[1] = new Alquiler(peliculas[2], fecha1, fecha2, 10.5);
        alquileres[2] = new Alquiler(peliculas[4], fecha1, fecha2, 10.5);

//        for (int i = 0; i < peliculas.length; i++) {
//            peliculas[i] = ps.crearPelicula();
//        }
//        for (int i = 0; i < alquileres.length; i++) {
//            alquileres[i] = as.crearAlquiler(peliculas);
//        }

        int op, aux;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Cargar una pelicula");
            System.out.println("2. Mostrar lista de peliculas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Mostrar lista de alquileres realizados");
            System.out.println("5. Buscar pelicula por titulo o genero");
            System.out.println("6. Buscar alquileres por fecha de inicio");
            System.out.println("7. Calcular ingreso de un alquier");
            System.out.println("0. Salir");
            op = input.nextInt();
            
            switch (op) {
                case 1:
//                    ps.crearPelicula();
                    break;
                case 2:
                    ps.listarPeliculasAlquiladas(peliculas);
                    break;
                case 3:
                    as.agregarAlquiler(alquileres, peliculas);
                    break;
                case 4:
                    as.listarAlquileres(alquileres);
                    break;
                case 5:
                    System.out.println("Buscar pelicula por");
                    System.out.println("1. Titulo");
                    System.out.println("2. Genero");
                    System.out.println("0. Volver al menu principal");
                    
                    do {
                        aux = input.nextInt();
                        switch (aux) {
                            case 1:
                                ps.buscarPeliculaPorTitulo(peliculas, input.next());
                                break;
                            case 2:
                                ps.buscarPeliculaPorGenero(peliculas, input.next());
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion invalida");
                        }
                    } while (aux != 1 && aux != 2 && aux != 0);
                    break;
                case 6:
                    System.out.println("Ingrese la fecha en la que buscar los alquileres");
                    as.buscarAlquiler(alquileres, as.ingresarFecha());
                    break;
                case 7:
                    System.out.println("Ingrese el ID de que alquiler calcular el ingreso");
                    int i = input.nextInt();
                    System.out.println("Ingrese la fecha de regreso de la pelicula");
                    as.calcularIngreso(alquileres[i], as.ingresarFecha());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (op != 0);

    }

}
