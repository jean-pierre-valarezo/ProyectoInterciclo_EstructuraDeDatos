/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectointerciclo_estructuradedatos.controlador;

import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.Contacto;
import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.Nodo;

/**
 *
 * @author jeanp
 */
public class ArbolContactos {
    private Nodo raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void agregarContacto(Contacto contacto) {
        raiz = agregarContactoRecursivo(raiz, contacto);
    }

    private Nodo agregarContactoRecursivo(Nodo nodo, Contacto contacto) {
        if (nodo == null) {
            return new Nodo(contacto);
        }

        if (contacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0) {
            nodo.izquierdo = agregarContactoRecursivo(nodo.izquierdo, contacto);
        } else if (contacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0) {
            nodo.derecho = agregarContactoRecursivo(nodo.derecho, contacto);
        }

        return nodo;
    }

    public Contacto buscarContacto(String nombre) {
        return buscarContactoRecursivo(raiz, nombre);
    }

    private Contacto buscarContactoRecursivo(Nodo nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        if (nombre.equals(nodo.getContacto().getNombre())) {
            return nodo.getContacto();
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            return buscarContactoRecursivo(nodo.izquierdo, nombre);
        } else {
            return buscarContactoRecursivo(nodo.derecho, nombre);
        }
    }

}
