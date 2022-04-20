package Veterinaria;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Jurgensen Alzate
 * @author Valentina Pinzon
 */
public class Home {
        public static void main(String[] args) {
                String id, nombre, apellidos, nombreM, nombreProducto, cadena = "", cadena2 = "";
                int menu = 0, validacion = 0, edadM, contador = 0, contador2 = 0;
                double valorProducto = 0;
                DecimalFormat formatea = new DecimalFormat("###,###.##");
                ArrayList<Personas> datosPersonas = new ArrayList<Personas>();
                ArrayList<Mascotas> datosMascotas = new ArrayList<Mascotas>();
                ArrayList<Dueño_Mascota> datosDueño_mascota = new ArrayList<Dueño_Mascota>();
                ArrayList<Productos> datosProducto = new ArrayList<Productos>();
                ArrayList<Factura> datosFactura = new ArrayList<Factura>();
                do {
                        menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "<html><center><h1 style='color: red; font-family: Calibri; font-size: 36pt;'>Bienvenido"
                                                        + "<html><h2 style='font-family: Calibri; font-size: 20pt; color: blue;'>Seleccione una opcion:"
                                                        + "\n1). Ingresar Datos Cliente."
                                                        + "\n2). Ingresar Datos Mascota."
                                                        + "\n3). Ingresar Datos Producto."
                                                        + "\n4). Factura."
                                                        + "\n5). Salir."));
                        System.out.println("Este es el numero que tiene MENU = : " + menu);
                        switch (menu) {
                                case 1:// Inscripcion datos personas!!
                                        do {
                                                id = JOptionPane.showInputDialog(null,
                                                                "Ingrese el numero de identificacion: ");
                                                nombre = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nombre de la personas con identificacion N°. "
                                                                                + id);
                                                apellidos = JOptionPane.showInputDialog(null,
                                                                "Ingrese el apellido de: " + nombre);
                                                Personas Per1 = new Personas(id, nombre, apellidos);
                                                datosPersonas.add(Per1);
                                                validacion = JOptionPane.showConfirmDialog(null, Per1.getDatosPersona()
                                                                + "\n" +
                                                                "<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>¿DESEA INGRESAR OTRO CLIENTE?",
                                                                "Veterinaria", JOptionPane.YES_NO_OPTION, -1);
                                                System.out.println(Per1.getDatosPersona());
                                        } while (validacion == 0);
                                        break;
                                case 2: // Inscripcion datos Mascota!!
                                        do {
                                                nombreM = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nombre de la mascota: ");
                                                edadM = Integer.parseInt(
                                                                JOptionPane.showInputDialog(null,
                                                                                "Ingrese la edad de la mascota: "
                                                                                                + nombreM));
                                                Mascotas Mas1 = new Mascotas(nombreM, edadM);
                                                datosMascotas.add(Mas1);
                                                System.out.println(Mas1.getDatosMascota());
                                                for (int i = 0; i < datosPersonas.size(); i++) {
                                                        contador = contador + 1;
                                                        cadena += contador + ")." + datosPersonas.get(i).getNombre()
                                                                        + " "
                                                                        + datosPersonas.get(i).getApellido() + "\n";
                                                }
                                                int selc = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                                "Seleccione el dueno de la mascota : "
                                                                                + "\n Escriba el numero que corresponde al dueno de: "
                                                                                + nombreM + "\n"
                                                                                + cadena));
                                                selc = selc - 1;
                                                id = datosPersonas.get(selc).getIdentificacion();
                                                nombre = datosPersonas.get(selc).getNombre();
                                                apellidos = datosPersonas.get(selc).getApellido();
                                                nombreM = Mas1.getNombreMascota();
                                                Dueño_Mascota Dm1 = new Dueño_Mascota(id, nombre, apellidos, nombreM);
                                                datosDueño_mascota.add(Dm1);
                                                validacion = JOptionPane.showConfirmDialog(null, Dm1.getDatosD_M()
                                                                + "\n" +
                                                                "<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>¿DESEA INGRESAR OTRA MASCOTA?",
                                                                "Veterinaria", JOptionPane.YES_NO_OPTION, -1);
                                                cadena = "";
                                                contador = 0;
                                                System.out.println(Dm1.getDatosD_M());
                                        } while (validacion == 0);
                                        break;
                                case 3:// Inscripcion datos prodcuto!!
                                        do {
                                                nombreProducto = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nombre del producto o servicio");
                                                valorProducto = Double.parseDouble(
                                                                JOptionPane.showInputDialog(null,
                                                                                "ingrese el valor del producto: "
                                                                                                + nombreProducto));
                                                Productos Prod1 = new Productos(nombreProducto, valorProducto);
                                                datosProducto.add(Prod1);
                                                validacion = JOptionPane.showConfirmDialog(null, Prod1.getInfoProducto()
                                                                + "\n" +
                                                                "<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>¿DESEA INGRESAR OTRO PRODUCTO?",
                                                                "Veterinaria", JOptionPane.YES_NO_OPTION, -1);
                                                System.out.println(Prod1.getInfoProducto());
                                        } while (validacion == 0);
                                        break;
                                case 4:// Facturacion
                                        do {
                                                for (int i = 0; i < datosPersonas.size(); i++) {
                                                        contador = contador + 1;
                                                        cadena += contador + ")." + datosPersonas.get(i).getNombre()
                                                                        + " "
                                                                        + datosPersonas.get(i).getApellido() + "\n";
                                                }
                                                int selc = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                                "Seleccione el cliente al que va ha facturar \n" +
                                                                                "\n Escriba el numero corresponde al cliente: \n"
                                                                                + cadena));
                                                selc = selc - 1;
                                                id = datosPersonas.get(selc).getIdentificacion();
                                                nombre = datosPersonas.get(selc).getNombre();
                                                apellidos = datosPersonas.get(selc).getApellido();
                                                for (int i = 0; i < datosProducto.size(); i++) {
                                                        contador2 = contador2 + 1;
                                                        cadena2 += contador2 + "). "
                                                                        + datosProducto.get(i).getProducto() + " "
                                                                        + formatea.format(datosProducto.get(i)
                                                                                        .getValorProducto())
                                                                        + "\n";
                                                }
                                                int selc1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                                "Seleccione el producto: \n"
                                                                                + "\n Escriba el numero que corresponde al producto"
                                                                                + "\n " + cadena2));
                                                selc1 = selc1 - 1;
                                                nombreProducto = datosProducto.get(selc1).getProducto();
                                                valorProducto = datosProducto.get(selc1).getValorProducto();
                                                Factura Fac1 = new Factura(id, nombre, apellidos, nombreProducto,
                                                                valorProducto);
                                                datosFactura.add(Fac1);
                                                validacion = JOptionPane.showConfirmDialog(null, Fac1.getFacturaTotal()
                                                                + "\n" +
                                                                "<html><center><h1 style='font-family: Calibri; font-size: 22pt;'>¿DESEA REALIZAR OTRA FACTURA?",
                                                                "Veterinaria", JOptionPane.YES_NO_OPTION, -1);
                                                cadena = "";
                                                contador = 0;
                                                cadena2 = "";
                                                contador2 = 0;
                                        } while (validacion == 0);
                                        break;
                                case 5:
                                        JOptionPane.showMessageDialog(null,
                                                        "<html><center><h1 style='font-family: Calibri; font-size: 32pt;'>MUCHAS GRACIAS POR USAR EL SOFTWARE VETERINARIA",
                                                        "SALIDA", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                default:
                                        JOptionPane.showMessageDialog(null,
                                                        "<html><center><h1 style='font-family: Calibri; font-size: 16pt;'>SELECCIONE UNA OPCION DE LA LISTA",
                                                        "SELECCION ERRADA", JOptionPane.ERROR_MESSAGE);
                                        break;
                        }
                } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu != 5);
        }

}
