/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Poliformismo {
    private static int i;
    
    
    public static void main(String[] args) {
        Electrodomestico[] E = new  Electrodomestico[5];
        E[0] = new Licuadora(3,"LG","BLSTMB-GBG-000",1.4);
        E[1] = new Licuadora(3,"LG","BLSTMB-GBG-000",1.2);
        E[2] = new Lavadora("Samsung","TwinWash",10);
        E[3] = new Licuadora(3,"LG","BLSTMB-GBG-000",1.6);
        E[4] = new Lavadora("Samsung","TwinWash",10);
        
        for( i = 0; i < 5; i++ ){
            E[i].encender();
        }
        
        for( i = 0; i < 5; i++ ){
            E[i].apagar();
        }
        
        
        
    }
    
    
    
    
}
