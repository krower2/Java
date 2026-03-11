/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia2;

/**
 *
 * @author ESTUDIANTE
 */
public class Cilindro extends Circulo {
    private double altura;
    
    
    
    public Cilindro(){
        super();
        altura = 10;
    }
    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Volumen(){
        return super.area()*altura;
    }
    
    public double area(){
        return 2*super.area() + altura * perimetro();
    }

    @Override
    public String toString() {
        return super.toString() + "\nAltura " + altura;
    }
    
    
}
