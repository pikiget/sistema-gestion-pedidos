import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void registrarPedido(Scanner sc) {
        System.out.print("Cuantos productos deseas agregar al pedido? ");
        int cantidad = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del producto " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Precio del producto " + (i + 1) + ": ");
            double precio = Double.parseDouble(sc.nextLine());
            agregarProducto(new Producto(nombre, precio));
        }
        System.out.println("Pedido registrado. Total: S/ " + calcularTotal());
    }
}