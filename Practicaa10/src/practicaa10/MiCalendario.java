/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa10;

/**
 *
 * @author karla pineda zarate
 */
public class MiCalendario implements IFecha, DiasFestivos {

    
    //Sobreescritura de metodos
    @Override
    public String dia(){
        String dia = "";
        if(IFecha.DIA_SEMANA == 1){
            dia = "Lunes";
        }
        if(IFecha.DIA_SEMANA == 2){
            dia = "Martes";
        }
        if(IFecha.DIA_SEMANA == 3){
            dia = "Miercoles";
        }
        if(IFecha.DIA_SEMANA == 4){
            dia = "Jueves";
        }
        if(IFecha.DIA_SEMANA == 5){
            dia = "Viernes";
        }
        if(IFecha.DIA_SEMANA == 6){
            dia = "Sabado";
        }
        if(IFecha.DIA_SEMANA == 7){
            dia = "Domingo";
        }
        return "El dia "+IFecha.DIA_DE_MES+ " es "+dia;
    }
    
    //sobreescritura de metodo
    @Override
    public String mes(){
        String mes = "";
        if(IFecha.MES_DEL_ANIO == 1){
            mes = "Enero";
        }
        if(IFecha.MES_DEL_ANIO == 2){
            mes = "Febrero";
        }
        if(IFecha.MES_DEL_ANIO == 3){
            mes = "Marzo";
        }
        if(IFecha.MES_DEL_ANIO == 4){
            mes = "Abril";
        }
        if(IFecha.MES_DEL_ANIO == 5){
            mes = "Mayo";
        }
        if(IFecha.MES_DEL_ANIO == 6){
            mes = "Junio";
        }
        if(IFecha.MES_DEL_ANIO == 7){
            mes = "Julio";
        }
        if(IFecha.MES_DEL_ANIO == 8){
            mes = "Agosto";
        }
        if(IFecha.MES_DEL_ANIO == 9){
            mes = "Septiembre";
        }
        if(IFecha.MES_DEL_ANIO == 10){
            mes = "Octubre";
        }
        if(IFecha.MES_DEL_ANIO == 11){
            mes = "Noviembre";
        }
        if(IFecha.MES_DEL_ANIO == 12){
            mes = "Diciembre";
        }
        return "El mes "+IFecha.MES_DEL_ANIO+" es "+mes;
    }
    
    //Sobreescritura de metodos
   @Override
    public String anio() {
       return String.valueOf(IFecha.ANIO);
    }
    
    @Override
    public String festivo() {
        String festivo = "";
        if (IFecha.DIA_DE_MES == 8 & IFecha.MES_DEL_ANIO == 9){
            festivo = "Felicidades por tu cumpleaños";
        }
        return festivo;
    }
     @Override
    public String conmemorativo() {
        return "";
    }
    @Override
    public String festivo(int dia, int mes){
        return "";
    }
    
}
