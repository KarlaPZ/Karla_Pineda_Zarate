/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa7;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author karla pineda zarate
 */
public class Practicaa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //El arreglo de objetos esta vacio 
            //ArrayList<Usuario> arreglo = new ArrayList<>();
            //arreglo.get(0).getCorreo();   
            int a=10, b=11;
            
            if (a>b){
                System.out.println("Todo esta bien");
                //Mas codigo de la ejeción de nuestro programa
            }
            else{
                throw new IOException();
            }           
           
        }  
        catch(IOException e){
            System.out.println("Este es un error de lectura y escritura de archivos"+e.getMessage());
        }
       //Este error es de jerarquia menos
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acabas de entrar en un error de posición de arreglo" +e.getMessage());
        }
        //estos errores es de jerarquia mayor
        catch(Exception e){
            System.out.println("ESto es un error"+e.getMessage());
        }
        finally {
            System.out.println("Aca pueden poner codigo que quieren que se ejecute despues de una exception");
        }
        
    }
    
}
