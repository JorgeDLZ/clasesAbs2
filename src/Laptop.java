public class Laptop extends Producto implements Vendible {

    protected String procesador;
    protected String memoriaRAM;

    public Laptop() {
    }

    public Laptop(String procesador, String memoriaRAM) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public Laptop(String nombre, int precio, int cantidadStock, String procesador, String memoriaRAM) {
        super(nombre, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }

    @Override
    public void mostrarDetalles(){

    }
    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > cantidad_Minima_Descuento) {
            total = total-(total*tasa_Descuento);
        }
        return total;
    }



}
