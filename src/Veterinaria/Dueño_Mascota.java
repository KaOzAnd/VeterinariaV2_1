package Veterinaria;

public class Dueño_Mascota extends Personas {
  private String nombreMascota;

  public Dueño_Mascota(String identificacion, String nombre, String apellido, String nombreMascota) {
    super(identificacion, nombre, apellido);
    this.setNombreMascota(nombreMascota);
  }

  public String getNombreMascota() {
    return nombreMascota;
  }

  public void setNombreMascota(String nombreMascota) {
    this.nombreMascota = nombreMascota;
  }

  public String getDatosD_M() {
    return ("<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>DATOS INGRESADOS: \n" +
        "Nombre del Dueño: " + getNombre() + " " + getApellido() + "\n" +
        "Nombre de la Mascota: " + getNombreMascota());
  }

}
