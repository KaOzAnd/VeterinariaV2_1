package Veterinaria;
import java.text.DecimalFormat;

public class Factura extends Personas {
  private String nombreProducto;
  private double valorProducto;

  public Factura(String identificacion, String nombre, String apellido, String nombreProducto, double valorProducto) {
    super(identificacion, nombre, apellido);
    this.setNombreProducto(nombreProducto);
    this.setValorProducto(valorProducto);
  }

  public double getValorProducto() {
    return valorProducto;
  }

  public void setValorProducto(double valorProducto) {
    this.valorProducto = valorProducto;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  DecimalFormat formatea = new DecimalFormat("###,###.##");

  public String getFacturaTotal() {
    return ("<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>FACTURA DE VENTA: \n" +
        "<html><center><B><h1 style='font-family: Calibri; font-size: 28pt;'>VETERINARIA: \n" +
        "NOMBRE CLIENTE: " + getNombre() + " " + getApellido() + "\n" +
        "N°. Identificacion cliente: " + getIdentificacion() + "\n" +
        "Producto: " + nombreProducto + " " + "Valor Producto: $ " + formatea.format(valorProducto) + "\n" +
        "\n" +
        "Total a pagar $ " + formatea.format(valorProducto) + "\n" +
        "\n" +
        "Gracias por su compra \n");

  }
}
