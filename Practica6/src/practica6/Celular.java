/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author karla pineda zarate
 */
public abstract class Celular {
    //variables de clase
    private String marca;
    private String procesador;
    private String diagonaldepantalla;
    private String tamnoBateria;
    private String modelo;
    
    //constructor vacio
    public Celular (){
        this.marca = "";
        this.procesador = "";
        this.diagonaldepantalla = "";
        this.tamnoBateria = "";
        this.modelo = "";
    }
    
    public String imprimirInformacion(){
        return "La marca de mi telefono es: "+marca+"y ademas tiene una pantalla de "+diagonaldepantalla+ "pulgadas";
        
             
    }
    
    //metodo
    public abstract String imprimirMarca();
    
    
    
}
