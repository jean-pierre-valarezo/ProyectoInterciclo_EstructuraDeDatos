/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.vista;

import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author davidvargas
 */
public class VistaContactos {

    private Scanner scanner;

    public VistaContactos() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("----- Gestión de Contactos -----");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar contactos en Preorder");
        System.out.println("5. Mostrar contactos en Inorder");
        System.out.println("6. Mostrar contactos en Postorder");
        System.out.println("7. Mostrar contactos en Anchura");
        System.out.println("8. Salir");
        System.out.print("Ingrese su opción: ");
    }

    public String leerNombreContacto() {
        System.out.print("Ingrese el nombre del contacto: ");
        return scanner.nextLine();
    }

    public String leerTelefonoContacto() {
        System.out.print("Ingrese el número de teléfono del contacto: ");
        return scanner.nextLine();
    }

    public String leerCorreo() {
    System.out.print("Ingrese el correo (escriba 'FIN' para terminar): ");
    return scanner.nextLine();
}

public String leerRedSocial() {
    System.out.print("Ingrese la red social (ejemplo: Facebook, escriba 'FIN' para terminar): ");
    return scanner.nextLine();
}


    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void agregarCorreosYRedesSociales(Contacto contacto) {
        String correo;
        do {
            correo = leerCorreo();
            if (!correo.equalsIgnoreCase("fin")) {
                contacto.agregarCorreo(correo);
            }
        } while (!correo.equalsIgnoreCase("fin"));

        String redSocial;
        do {
            redSocial = leerRedSocial();
            if (!redSocial.equalsIgnoreCase("fin")) {
                System.out.print("Ingrese el perfil de " + redSocial + ": ");
                String perfil = scanner.nextLine();
                contacto.agregarRedSocial(redSocial, perfil);
            }
        } while (!redSocial.equalsIgnoreCase("fin"));
    }
}
