/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica11;

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
        
        try{
        Archivo archivo = new Archivo("archivos/JSON.txt");
        String json = archivo.leer();
        System.out.println(json);
        Gson gson = new Gson();
        Personas personas= gson.fromJson(json, Personas.class);
        System.out.println("El numero de friend es: "+personas.getPersonas().size());
            for (Persona persona : personas.getPersonas()){
                System.out.println("El nombre del Friend es: "+persona.getName().getFirst());
                System.out.println("Amigos de: "+persona.getName().getFirst()+" "+persona.getName().getLast());                                                  
                for (Friend friend : persona.getFriends()){
                    System.out.println(friend.getName());
            }
            System.out.println("Imprimiendo Tags: ");
            System.out.println(persona.getTags()[0]);
            System.out.println("\n");
        }   
     }
        catch (Exception e){
            System.out.println(e.getMessage());
    }
}
}

    

