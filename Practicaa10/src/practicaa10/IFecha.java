/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa10;

import java.util.Calendar;

/**
 *
 * @author karla pineda zarate
 */
public interface IFecha {
    //variables de interfaz
    public static final int DIA_SEMANA = Calendar.DAY_OF_WEEK;
    public static final int DIA_DE_MES = Calendar.DAY_OF_MONTH;
    public static final int MES_DEL_ANIO =Calendar.MONTH;
    public static final int ANIO = Calendar.YEAR;
    
    
    public abstract String dia();
    public abstract String mes();
    public abstract String anio();
    
    
}
