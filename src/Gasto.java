/**
 * Representa un gasto personal con su descripción, monto y categoría.
 */
public class Gasto {

    private int id;
    private String descripcion;
    private double monto;
    private String categoria;

    public Gasto(int id, String descripcion, double monto, String categoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public String getCategoria() {
        return categoria;
    }

    // Define cómo se muestra el gasto cuando se imprime en pantalla
    @Override
    public String toString() {
        return String.format("[%d] %-20s $%8.2f  (%s)", id, descripcion, monto, categoria);
    }
}