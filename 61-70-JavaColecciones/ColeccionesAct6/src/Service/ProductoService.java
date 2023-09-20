package Service;

// @author Haze
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ProductoService {

    HashMap<String, Integer> productos = new HashMap();
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void cargarProductos() {
        String res = "S";
        String nombre;
        Integer precio;

        while (!res.equalsIgnoreCase("N")) {
            System.out.println("Ingrese el nombre del producto");
            nombre = input.next();
            System.out.println("Ingrese el precio del producto");
            precio = input.nextInt();

            productos.put(nombre, precio);
            System.out.println("Quiere ingresar otro producto? (S/N)");
            res = input.next();
        }
    }

    public void modificarPrecio(String producto) {
        boolean flag = false;
        Iterator it = productos.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equals(producto)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Ingrese el nuevo precio de " + producto);
            productos.replace(producto, input.nextInt());
        } else {
            System.out.println("No se encontro el producto ingresado");
        }
    }

    public void eliminarProducto(String producto) {
        boolean flag = false;
        Iterator it = productos.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equals(producto)) {
                it.remove();
                flag = true;
                break;
            }
        }

        if (flag) {
        } else {
            System.out.println("No se encontro el producto ingresado");
        }
    }

    public void mostrarProductos() {
        productos.entrySet().forEach((aux) -> {
            System.out.println(aux.getKey() + " $" + aux.getValue());
        });
    }

    public void menu() {
        int op;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Cargar Productos");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Lista de Productos");
            System.out.println("0. Salir");
            op = input.nextInt();
            switch (op) {
                case 1:
                    cargarProductos();
                    break;
                case 2:
                    System.out.println("Ingrese el producto a modificar");
                    modificarPrecio(input.next());
                    break;
                case 3:
                    System.out.println("Ingrese el producto a eliminar");
                    eliminarProducto(input.next());
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingreso una opcion no valida");
            }
        } while (op != 0);

    }
}
