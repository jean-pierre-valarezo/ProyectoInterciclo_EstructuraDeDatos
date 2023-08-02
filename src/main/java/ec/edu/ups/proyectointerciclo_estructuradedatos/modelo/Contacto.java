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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreos(List<String> correos) {
        this.correos = correos;
    }

    public void setRedesSociales(Map<String, String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    public void agregarCorreo(String correo) {
        correos.add(correo);
    }

    public void agregarRedSocial(String redSocial, String perfil) {
        redesSociales.put(redSocial, perfil);
    }

    public String obtenerInformacionContacto() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre).append("\n");
        info.append("Teléfono: ").append(telefono).append("\n");

        if (!correos.isEmpty()) {
            info.append("Correos electrónicos:\n");
            for (String correo : correos) {
                info.append("- ").append(correo).append("\n");
            }
        }

        if (!redesSociales.isEmpty()) {
            info.append("Redes sociales:\n");
            for (Map.Entry<String, String> entry : redesSociales.entrySet()) {
                info.append("- ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
        }

        return info.toString();
    }

    @Override
    public String toString() {
        return obtenerInformacionContacto();
    }

}
