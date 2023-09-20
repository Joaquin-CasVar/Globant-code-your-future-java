package pooactgrupal04;

// @author Haze
import Entity.Cliente;
import Entity.Rutina;
import Service.ClienteService;
import Service.RutinaService;

public class POOActGrupal04 {

    public static void main(String[] args) {
        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

//        Cliente c1 = cs.registrarCliente();
        Cliente c1 = new Cliente(1, "Juan", 20, 1.68, 62.3, "A");
        Cliente c2 = new Cliente(2, "Pedro", 61, 1.59, 52.7, "B");
        Cliente c3 = new Cliente(3, "Felipe", 15, 1.56, 64.3, "C");
        Cliente c4 = new Cliente(4, "Leandro", 35, 1.78, 61.7, "D");
        Cliente c5 = new Cliente(5, "Mary", 22, 1.60, 52.8, "E");
        cs.registrarCliente(c1);
        cs.registrarCliente(c2);
        cs.registrarCliente(c3);
        cs.registrarCliente(c4);
        cs.registrarCliente(c5);

        Rutina r1 = new Rutina(1, "+Musculo", 55, 4, "A");
        Rutina r2 = new Rutina(2, "+Salud", 45, 2, "B");
        Rutina r3 = new Rutina(3, "-Peso", 30, 1, "C");
        Rutina r4 = new Rutina(4, "+Movilidad", 40, 1, "D");
        Rutina r5 = new Rutina(5, "+Peso", 40, 3, "E");
        rs.crearRutina(r1);
        rs.crearRutina(r2);
        rs.crearRutina(r3);
        rs.crearRutina(r4);
        rs.crearRutina(r5);

        System.out.println("Clientes");
        cs.obtenerClientes(cs.getListaClientes());
        System.out.println("Rutinas");
        rs.obtenerRutinas(rs.getListaRutinas());

//        cs.registrarCliente();
//        cs.registrarCliente();

        cs.actualizarCliente(1, "Agustin", 19, 1.78, 58.6, "Ganar Masa Muscular");
        System.out.println("Clientes Actualizados");
        cs.obtenerClientes(cs.getListaClientes());

        rs.actualizarRutina(1, "UwU", 37, 10, "OwO");
        System.out.println("Rutinas Actualizados");
        rs.obtenerRutinas(rs.getListaRutinas());

        cs.eliminarCliente(2);
        System.out.println("Clientes Final");
        cs.obtenerClientes(cs.getListaClientes());
        
        rs.eliminarRutina(2);
        System.out.println("Rutinas Final");
        rs.obtenerRutinas(rs.getListaRutinas());

    }

}
