package Veterinaria;

import java.text.DecimalFormat;

public class Productos {
  private String producto;
  private double valorProducto;

  public Productos(String producto, double valorProducto) {
    this.setProducto(producto);
    this.setValorProducto(valorProducto);
  }

  public double getValorProducto() {
    return valorProducto;
  }

  public void setValorProducto(double valorProducto) {
    this.valorProducto = valorProducto;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  DecimalFormat formatea = new DecimalFormat("###,###.##");

  public String getInfoProducto() {
    return ("<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>DATOS INGRESADOS: \n" +
        "Nombre producto: " + producto + "\n" +
        "Valor Producto: $ " + formatea.format(valorProducto));
  }
}
