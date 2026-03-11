/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

public class Perro extends Animal {
    private String ladrido;

    public Perro(String ladrido, String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.ladrido = ladrido;
    }

    public String getLadrido() {
        return ladrido;
    }

    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void Ladrar(){
        System.out.println("Ladrando");
    }
    
    
    
    
}
