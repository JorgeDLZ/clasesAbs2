import java.util.ArrayList;
public class Cliente {
    protected String nombreCl;
    protected String correo;
    protected ArrayList<Producto> productosComprados = new ArrayList<>();
    protected double totalGastado = 0;

    public Cliente() {
    }

    public Cliente(String nombreCl, String correo, ArrayList<Producto> productosComprados) {
        this.nombreCl = nombreCl;
        this.correo = correo;
        this.productosComprados = productosComprados;
    }

    public String getNombreCl() {
        return nombreCl;
    }

    public void setNombreCl(String nombreCl) {
        this.nombreCl = nombreCl;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(ArrayList<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCl='" + nombreCl + '\'' +
                ", correo='" + correo + '\'' +
                ", productosComprados=" + productosComprados +
                '}';
    }


    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() < cantidad) {
            System.out.println("No hay suficiente stock de " + producto.getNombre());
            return;
        }

        if (producto instanceof Vendible) {
            Vendible item = (Vendible) producto;
            double total = item.calcularPrecioVenta(cantidad);
            totalGastado += total;
            producto.reducirStock(cantidad);
            productosComprados.add(producto);

        }
    }

    public void mostrarCompra() {
        System.out.println("\nCompras de " + nombreCl + ":");
        for (Producto compra : productosComprados) {

            System.out.println(compra.getNombre() + " - " + compra.getCantidadStock() + " unidades restantes");
        }
        System.out.println("Total gastado: $" + totalGastado);
    }
}

