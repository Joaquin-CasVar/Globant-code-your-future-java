package Service;

// @author Haze
import Entity.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    private ArrayList<Cliente> listaClientes = new ArrayList<>(0);

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Cliente registrarCliente() {
        Cliente c = new Cliente();

        System.out.println("Ingrese ID del cliente");
        c.setId(input.nextInt());
        System.out.println("Ingrese nombre del cliente");
        c.setNombre(input.next());
        System.out.println("Ingrese edad del cliente");
        c.setEdad(input.nextInt());
        System.out.println("Ingrese altura del cliente");
        c.setAltura(input.nextDouble());
        System.out.println("Ingrese peso del cliente");
        c.setPeso(input.nextDouble());
        System.out.println("Ingrese objetivo del cliente");
        c.setObjetivo(input.next());

        listaClientes.add(c);
        return c;
    }

    public void registrarCliente(Cliente c) {
        listaClientes.add(c);
    }

    public ArrayList<Cliente> obtenerClientes() {
        return listaClientes;
    }

    public void obtenerClientes(ArrayList<Cliente> lista) {
        lista.forEach(cliente -> {
            System.out.println(cliente.toString());
        });
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        listaClientes.forEach(cliente -> {
            if (cliente.getId() == id) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
            }
        });
    }

    public void eliminarCliente(int id) {
        boolean flag = false;

        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                listaClientes.remove(cliente);
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Cliente eliminado");
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}
