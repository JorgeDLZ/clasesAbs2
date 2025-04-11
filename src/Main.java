
public class Main {
    public static void main(String[] args) {



        Laptop laptop1 = new Laptop("Asus", 2000000, 10, "Ryzen 7", "16GB");
        Celular celular1 = new Celular("iPhone 13", 2500000, 8, "4000mAh", "12MP");


        Cliente cliente1 = new Cliente();
        cliente1.setNombreCl("Jorge");
        cliente1.setCorreo("Jorge@zxy");
        // compras
        cliente1.comprarProducto(laptop1, 6);
        cliente1.comprarProducto(celular1, 3);

        cliente1.mostrarCompra();


        System.out.println("\nInventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}
