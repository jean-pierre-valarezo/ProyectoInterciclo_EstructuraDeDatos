/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectointerciclo_estructuradedatos.controlador;

import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.Contacto;
import ec.edu.ups.proyectointerciclo_estructuradedatos.modelo.Nodo;
import java.util.LinkedList;
import java.util.Queue;

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

    public boolean eliminarContacto(String nombre) {
        if (raiz == null) {
            return false;
        }

        Nodo nodoEliminado = eliminarContactoRecursivo(raiz, nombre);
        return nodoEliminado != null;
    }

    private Nodo eliminarContactoRecursivo(Nodo nodo, String nombre) {
    if (nodo == null) {
        return null;
    }

    if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
        nodo.izquierdo = eliminarContactoRecursivo(nodo.izquierdo, nombre);
    } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
        nodo.derecho = eliminarContactoRecursivo(nodo.derecho, nombre);
    } else {
        // Caso 1: Nodo sin hijos o con un solo hijo
        if (nodo.izquierdo == null) {
            return nodo.derecho;
        } else if (nodo.derecho == null) {
            return nodo.izquierdo;
        }

        // Caso 2: Nodo con dos hijos
        Nodo sucesor = encontrarSucesor(nodo.derecho);
        nodo.getContacto().setNombre(sucesor.getContacto().getNombre());
        nodo.getContacto().setTelefono(sucesor.getContacto().getTelefono());
        nodo.derecho = eliminarContactoRecursivo(nodo.derecho, sucesor.getContacto().getNombre());
    }

    return nodo;
}


    private Nodo encontrarSucesor(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }

    public void mostrarPreorder() {
        mostrarPreorderRecursivo(raiz);
    }

    private void mostrarPreorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getContacto().getNombre());
            mostrarPreorderRecursivo(nodo.izquierdo);
            mostrarPreorderRecursivo(nodo.derecho);
        }
    }

    public void mostrarInorder() {
        mostrarInorderRecursivo(raiz);
    }

    private void mostrarInorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            mostrarInorderRecursivo(nodo.izquierdo);
            System.out.println(nodo.getContacto().getNombre());
            mostrarInorderRecursivo(nodo.derecho);
        }
    }

    public void mostrarPostorder() {
        mostrarPostorderRecursivo(raiz);
    }

    private void mostrarPostorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            mostrarPostorderRecursivo(nodo.izquierdo);
            mostrarPostorderRecursivo(nodo.derecho);
            System.out.println(nodo.getContacto().getNombre());
        }
    }

    public void mostrarAnchura() {
        if (raiz == null) {
            return;
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo nodo = cola.poll();
            System.out.println(nodo.getContacto().getNombre());

            if (nodo.izquierdo != null) {
                cola.add(nodo.izquierdo);
            }

            if (nodo.derecho != null) {
                cola.add(nodo.derecho);
            }
        }
    }
    
}
