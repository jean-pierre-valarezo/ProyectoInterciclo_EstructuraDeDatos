/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.proyectointerciclo_estructuradedatos;

import ec.edu.ups.proyectointerciclo_estructuradedatos.controlador.ArbolContactos;
import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.Contacto;
import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.vista.VistaContactos;
import java.util.Scanner;

/**
 *
 * @author jeanp
 */
public class ProyectoInterciclo_EstructuraDeDatos {

    public static void main(String[] args) {
        ArbolContactos arbolContactos = new ArbolContactos();
        VistaContactos vista = new VistaContactos();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            vista.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono);
                    System.out.print("¿Desea agregar correos? (S/N): ");
                    String agregarCorreos = scanner.nextLine().trim().toUpperCase();
                    if (agregarCorreos.equals("S")) {
                        System.out.print("Ingrese el correo (escriba 'fin' para terminar): ");
                        String correo;
                        while (!(correo = scanner.nextLine()).equalsIgnoreCase("fin")) {
                            nuevoContacto.agregarCorreo(correo);
                            System.out.print("Ingrese el correo (escriba 'fin' para terminar): ");
                        }
                    }
                    System.out.print("¿Desea agregar redes sociales? (S/N): ");
                    String agregarRedesSociales = scanner.nextLine().trim().toUpperCase();
                    if (agregarRedesSociales.equals("S")) {
                        System.out.print("Ingrese la red social (ejemplo: Facebook): ");
                        String redSocial;
                        while (!(redSocial = scanner.nextLine()).equalsIgnoreCase("fin")) {
                            System.out.print("Ingrese el perfil de " + redSocial + ": ");
                            String perfil = scanner.nextLine();
                            nuevoContacto.agregarRedSocial(redSocial, perfil);
                            System.out.print("Ingrese la red social (escriba 'fin' para terminar): ");
                        }
                    }
                    arbolContactos.agregarContacto(nuevoContacto);
                    vista.mostrarMensaje("Contacto agregado exitosamente.");
                    break;
                case 2:
                    // Buscar contacto
                    scanner.nextLine(); // Consumir la nueva línea antes de leer el nombre del contacto
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscado = scanner.nextLine();
                    Contacto contactoEncontrado = arbolContactos.buscarContacto(nombreBuscado);
                    if (contactoEncontrado != null) {
                        vista.mostrarMensaje("Contacto encontrado:\n" + contactoEncontrado.obtenerInformacionContacto());
                    } else {
                        vista.mostrarMensaje("El contacto no fue encontrado.");
                    }
                    break;

                case 3:
                    // Eliminar contacto
                    scanner.nextLine(); // Consumir la nueva línea antes de leer el nombre del contacto
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreAEliminar = scanner.nextLine();
                    boolean eliminado = arbolContactos.eliminarContacto(nombreAEliminar);
                    if (eliminado) {
                        vista.mostrarMensaje("Contacto eliminado exitosamente.");
                    } else {
                        vista.mostrarMensaje("El contacto no fue encontrado o no pudo ser eliminado.");
                    }
                    break;
                case 4:
                    vista.mostrarMensaje("Contactos en Preorder:");
                    arbolContactos.mostrarPreorder();
                    break;
                case 5:
                    vista.mostrarMensaje("Contactos en Inorder:");
                    arbolContactos.mostrarInorder();
                    break;
                case 6:
                    vista.mostrarMensaje("Contactos en Postorder:");
                    arbolContactos.mostrarPostorder();
                    break;
                case 7:
                    vista.mostrarMensaje("Contactos en Anchura:");
                    arbolContactos.mostrarAnchura();
                    break;
                case 8:
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
                    break;
            }
            vista.mostrarMensaje(""); // Salto de línea después de cada operación
        } while (opcion != 8);

        scanner.close();
    }
}
