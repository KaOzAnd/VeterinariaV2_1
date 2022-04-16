package Veterinaria;

public class Personas {
  private String identificacion;
  private String nombre;
  private String apellido;

  public Personas(String identificacion, String nombre, String apellido) {
    this.setIdentificacion(identificacion);
    this.setNombre(nombre);
    this.setApellido(apellido);
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  public String getDatosPersona() {
    return ("<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>DATOS INGRESADOS: \n" +
        "Identificacion: " + identificacion + "\n" +
        "Nombre: " + nombre + "\n" +
        "Apellido: " + apellido);
  }

}
