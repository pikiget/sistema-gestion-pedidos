import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrar(Scanner sc) {
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        if (dni == null || dni.trim().isEmpty()) {
            System.out.println("Error: el DNI es obligatorio.");
            return;
        }
        Cliente c = new Cliente(nombre, dni, telefono);
        clientes.add(c);
        System.out.println("Cliente registrado: " + c);
    }

    public void listar() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}