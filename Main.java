import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorClientes gestorClientes = new GestorClientes();
        Pedido pedido = new Pedido();
        int opcion = -1;

        while (opcion != 4) {
            System.out.println("\n=== Sistema de Gestion de Pedidos ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar pedido");
            System.out.println("3. Listar clientes");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            String entrada = sc.nextLine();
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: ingresa un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    gestorClientes.registrar(sc);
                    break;
                case 2:
                    pedido.registrarPedido(sc);
                    break;
                case 3:
                    gestorClientes.listar();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        sc.close();
    }
}