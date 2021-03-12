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
public class Samsung extends Celular {

    @Override
    public String imprimirInformacion() {
        return "Esto se esta imprimiendo desde la clase hijo de Samsung";        
   
    }
    
    @Override
    public String imprimirMarca (){
        return "Este celular es de marca Samgun";
    }
    
  
}
