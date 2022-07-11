public class Coche {
    //1.Atributos

    String marca;
    int anio;
    double precio;
    boolean venta;

    @Override
    public String toString() {
        return "Coche [anio=" + anio + ", marca=" + marca + ", precio=" + precio + ", venta=" + venta + "]";
    }

    public Coche() {}

    public Coche(String marca, int anio, double precio, boolean venta) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        this.venta = venta;
    }

}
