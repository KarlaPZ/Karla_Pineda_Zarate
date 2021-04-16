/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica13;

import java.util.ArrayList;

/**
 *
 * @author karla pineda zarate
 */
public class Usuarios {
    //variables de clase
    private ArrayList<Usuario> usuarios;
    
    //constructor vacio
    public Usuarios (){
        this.usuarios = new ArrayList<>();
    }
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    
}
