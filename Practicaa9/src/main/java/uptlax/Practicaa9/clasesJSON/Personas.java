/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uptlax.Practicaa9.clasesJSON;

import java.util.ArrayList;

/**
 *
 * @author karla pineda zarate
 */
public class Personas {
    private ArrayList<Persona> personas;
    
    public Personas (){
        this.personas = new ArrayList<Persona>();
    }
    
    public ArrayList<Persona> getPersonas(){
        return personas;
    }
    
}
