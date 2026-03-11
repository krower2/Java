/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author ESTUDIANTE
 */
public class Gato extends Animal {
    private int noVidas;

    public Gato( String nombre, int edad, String raza, int noVidas) {
        super(nombre, edad, raza);
        this.noVidas = noVidas;
    }

    public int getNoVidas() {
        return noVidas;
    }

    public void setNoVidas(int noVidas) {
        this.noVidas = noVidas;
    }
    
    public void Maullar(){
        System.out.println("Miauuuu");
    }
    
    public void acariciar(){
        System.out.println("Acariciando");
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de vidas: " +noVidas;
    }
    
    
}