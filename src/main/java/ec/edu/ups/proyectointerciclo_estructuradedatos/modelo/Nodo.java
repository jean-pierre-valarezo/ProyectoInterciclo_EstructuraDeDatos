/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectointerciclo_estructuradedatos.modelo;

/**
 *
 * @author jeanp
 */
public class Nodo {
    private Contacto contacto;
    public Nodo izquierdo;
    public Nodo derecho;

    public Nodo(Contacto contacto) {
        this.contacto = contacto;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
}
