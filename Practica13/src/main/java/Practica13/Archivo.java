/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karla pineda zarate
 */
public class Archivo {
     //variables de clase
    private String ruta;

//Constructor con parametros
public Archivo(String ruta){
    this.ruta=ruta;
}

//Metodos de clase
public String leer(){
    String contenido="";
    File archivo = null;
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try{
        archivo = new File(this.ruta);
        fileReader = new FileReader(archivo);
        bufferedReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufferedReader.readLine()) != null){
            contenido += linea.replace(" ", "");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        try {
            bufferedReader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    return contenido;
}
public void escribir(String ruta,String cadena, boolean concatenar){
    FileWriter archivo = null;
    PrintWriter printWriter = null;
    try{
        archivo = new FileWriter(ruta, concatenar);
        printWriter = new PrintWriter(archivo);
        printWriter.println(cadena);
       
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                archivo.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }    
}

