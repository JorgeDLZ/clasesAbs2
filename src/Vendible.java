public interface Vendible {

    int cantidad_Minima_Descuento = 5;
    double tasa_Descuento=0.10;

    double calcularPrecioVenta(int cantidad);
}