/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Lavadora extends Electrodomestico{

    public Lavadora(String marca, String modelo, double capacidad) {
        super(marca, modelo, capacidad);
    }
    
    
   public void lavar(){
       System.out.println("La lavadora esta lavando");
   }
   
   public void apagar(){
       System.out.println("la lavadora esta apagada");
   }
}
