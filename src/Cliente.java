import java.util.ArrayList;
public class Cliente {
    protected String nombreCl;
    protected String correo;
    protected ArrayList<Producto> productosComprados = new ArrayList<>();

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


    public void comprarProducto(Producto producto, int cantidad){
        for (Producto x:productosComprados){
            if(x instanceof Laptop){
                System.out.println(x);
            }
        }

        }

    }
    public static void mostrarCompra(){

    }

