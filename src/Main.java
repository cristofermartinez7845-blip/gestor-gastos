import java.util.Scanner;

/**
 * Programa principal: muestra el menú y pide los datos al usuario.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorGastos gestor = new GestorGastos();
        int opcion = 0;

        while (opcion != 5) {
            mostrarMenu();
            opcion = leerEntero(scanner, "Elige una opción: ");

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    double monto = leerDecimal(scanner, "Monto: $");
                    System.out.print("Categoría (comida, transporte, etc.): ");
                    String categoria = scanner.nextLine();
                    gestor.agregarGasto(descripcion, monto, categoria);
                    System.out.println("Gasto agregado correctamente.");
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE GASTOS ---");
                    gestor.listarGastos();
                    break;
                case 3:
                    int id = leerEntero(scanner, "Id del gasto a eliminar: ");
                    if (gestor.eliminarGasto(id)) {
                        System.out.println("Gasto eliminado.");
                    } else {
                        System.out.println("No existe un gasto con ese id.");
                    }
                    break;
                case 4:
                    System.out.printf("Total gastado: $%.2f%n", gestor.calcularTotal());
                    break;
                case 5:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== GESTOR DE GASTOS ===");
        System.out.println("1. Agregar gasto");
        System.out.println("2. Listar gastos");
        System.out.println("3. Eliminar gasto");
        System.out.println("4. Ver total");
        System.out.println("5. Salir");
    }

    // Pide un número entero y repite la pregunta si el usuario escribe algo inválido
    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número entero válido.");
            }
        }
    }

    // Pide un número decimal y repite la pregunta si es inválido o negativo
    private static double leerDecimal(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                double valor = Double.parseDouble(scanner.nextLine().trim());
                if (valor > 0) {
                    return valor;
                }
                System.out.println("El monto debe ser mayor que cero.");
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número válido (ejemplo: 12.50).");
            }
        }
    }
}