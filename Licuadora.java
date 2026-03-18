/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Licuadora extends Electrodomestico {
    private int velocidades;
    public Licuadora(int velocidades, String marca, String modelo, double capacidad) {
        super(marca, modelo, capacidad);
        this.velocidades = velocidades;
    }
    public int getVelocidades() {
        return velocidades;
    }
    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }
    
    public void licuar() {
        System.out.println("La licuadora está licuando los ingredientes.");
    }

    public void apagar() {
        System.out.println("La licuadora se ha apagado.");
    }
    
}
