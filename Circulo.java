/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia2;

/**
 *
 * @author ESTUDIANTE
 */
public class Circulo {
    private double radio;
    private String color;
    
    public Circulo(){
        radio = 1;
        color = "red";
    }
    
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return Math.PI*2*radio;
    }

    @Override
    public String toString() {
        return "\nColor:" + color +"I\nRadio: " + radio;
    }
    
}
