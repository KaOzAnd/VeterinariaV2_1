package Veterinaria;

public class Mascotas {
  private String nombreMascota;
  private int edadMascota;

  public Mascotas(String nombreMascota, int edadMascota) {
    this.setNombreMascota(nombreMascota);
    this.setEdadMascota(edadMascota);
  }

  public int getEdadMascota() {
    return edadMascota;
  }

  public void setEdadMascota(int edadMascota) {
    this.edadMascota = edadMascota;
  }

  public String getNombreMascota() {
    return nombreMascota;
  }

  public void setNombreMascota(String nombreMascota) {
    this.nombreMascota = nombreMascota;
  }

  public String getDatosMascota() {
    return ("<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>DATOS INGRESADOS: \n" +
        "Nombre Mascota: " + nombreMascota + "\n" +
        "Edad Mascota: " + edadMascota + " Años");
  }

}
