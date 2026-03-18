/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poliformismo;


public class Electrodomestico {
    private String marca;
    private String modelo;
    private double capacidad;

    public Electrodomestico(String marca, String modelo, double capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getMarca() { 
        return marca; 
    }
    public String getModelo() { 
        return modelo; 
    }
    public double getCapacidad() { 
        return capacidad; 
    } 
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    public void setCapacidad(double capacidad) { 
        this.capacidad = capacidad; 
    }
 
    public void encender() {
        System.out.println("El electrodoméstico está encendido.");
    }
    
    
    public void apagar() {
        System.out.println("El electrodoméstico está apagado.");
    }

    @Override
    public String toString() {
        return "electrodomestico marca:" + marca + ", modelo:" + modelo + ", capacidad:" + capacidad + "";
    }
}
