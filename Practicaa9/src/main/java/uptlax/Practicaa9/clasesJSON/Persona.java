/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uptlax.Practicaa9.clasesJSON;

import java.io.Serializable;

/**
 *
 * @author karla pineda zarate
 */
public class Persona implements Serializable{
    //variables de clase
    private String id;
    private String imagen;
    private String edad;
    private Nombre nombre;
    private String compania;
    private String email;
    private String telefono;
    private String direccion;
    private String acerca_de;

//Constructor vacio
public Persona(){
    this.id = "";
    this.imagen = "";
    this.edad = "";
    this.nombre = new Nombre();
    this.compania = "";
    this.email= "";
    this.telefono = "";
    this.direccion = "";
    this.acerca_de= "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }


    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }

}

