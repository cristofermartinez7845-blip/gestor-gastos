import java.util.ArrayList;
import java.util.List;

/**
 * Maneja la lista de gastos: agregar, listar, eliminar y calcular el total.
 */
public class GestorGastos {

    private List<Gasto> gastos = new ArrayList<>();
    private int siguienteId = 1; // contador para asignar un id único a cada gasto

    // Funcionalidad 1: agregar un gasto nuevo
    public void agregarGasto(String descripcion, double monto, String categoria) {
        Gasto nuevo = new Gasto(siguienteId, descripcion, monto, categoria);
        gastos.add(nuevo);
        siguienteId++;
    }

    // Funcionalidad 2: mostrar todos los gastos
    public void listarGastos() {
        if (gastos.isEmpty()) {
            System.out.println("No hay gastos registrados.");
            return;
        }
        for (Gasto g : gastos) {
            System.out.println(g);
        }
    }

    // Funcionalidad 3: eliminar un gasto por su id
    // Devuelve true si lo eliminó, false si no encontró ese id
    public boolean eliminarGasto(int id) {
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getId() == id) {
                gastos.remove(i);
                return true;
            }
        }
        return false;
    }

    // Funcionalidad 4: sumar todos los montos
    public double calcularTotal() {
        double total = 0;
        for (Gasto g : gastos) {
            total += g.getMonto();
        }
        return total;
    }
}