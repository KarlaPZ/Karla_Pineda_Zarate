/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica13;

import com.google.gson.Gson;

/**
 *
 * @author karla pineda zarate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //leeemos el archivo
        Archivo archivo = new Archivo("archivos/usuarios.json");
        //obtenemos la informacion del archivo
        String json = archivo.leer();
        System.out.println("El contenido del archivo es: "+json+" usuario");
        try{
            //generamos la varibale para serializar
            Gson gson = new Gson();
            //serializamos la información del json en objetos
            Usuarios usuarios = gson.fromJson(json, Usuarios.class);
            //imprimimos la información serializada
            System.out.println("Yo tengo: "+usuarios.getUsuarios().size());
            
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            
        }
        
    }
        
    
}
