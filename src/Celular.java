public class Celular extends Producto implements Vendible{

    protected String capcacidadBateria;
    protected String camaraResolucion;

    public Celular() {
    }

    public Celular(String capcacidadBateria, String camaraResolucion) {
        this.capcacidadBateria = capcacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public Celular(String nombre, int precio, int cantidadStock, String capcacidadBateria, String camaraResolucion) {
        super(nombre, precio, cantidadStock);
        this.capcacidadBateria = capcacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public String getCapcacidadBateria() {
        return capcacidadBateria;
    }

    public void setCapcacidadBateria(String capcacidadBateria) {
        this.capcacidadBateria = capcacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capcacidadBateria='" + capcacidadBateria + '\'' +
                ", camaraResolucion='" + camaraResolucion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > cantidad_Minima_Descuento) {
            total = total-(total*tasa_Descuento);
        }
        return total;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Celular:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidadStock + " unidades");
        System.out.println("Capacidad batería: " + capcacidadBateria);
        System.out.println("Resolución cámara: " + camaraResolucion);
    }
}

