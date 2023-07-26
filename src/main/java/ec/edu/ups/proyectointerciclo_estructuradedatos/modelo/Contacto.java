/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectointerciclo_estructuradedatos.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jeanp
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private List<String> correos;
    private Map<String, String> redesSociales;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correos = new ArrayList<>();
        this.redesSociales = new HashMap<>();
    }
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<String> getCorreos() {
        return correos;
    }

    public Map<String, String> getRedesSociales() {
        return redesSociales;
    }
    
}
